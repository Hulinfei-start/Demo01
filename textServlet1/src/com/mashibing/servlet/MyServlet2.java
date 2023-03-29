package com.mashibing.servlet;

import javax.lang.model.element.VariableElement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class MyServlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //对获取数据进行编码
        req.setCharacterEncoding("UTF-8");
        //获取service 对象的方法
        ServletContext servletContext1 = req.getServletContext();
        ServletContext servletContext2 = this.getServletContext();
        System.out.println(servletContext1==servletContext2);
        servletContext1.setAttribute("jianpan","自己买的");
        Enumeration<String> attributeNames = servletContext1.getInitParameterNames();
        while (attributeNames.hasMoreElements()){
            String s = attributeNames.nextElement();
            System.out.println(s);
        }
        //请求转发给另外一个组件
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
        //第一种 由请求转发器做出请求动作;   此时又另一个组件返回浏览器
        requestDispatcher.forward(req,resp);
        //第二种方式 是 include(包含)  由当前组件返回浏览器
        //此时需要进行编码格式
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html,charset=UTF-8");

        requestDispatcher.include(req,resp);
        //响应重定向
        resp.sendRedirect("www.baidu.com");



    }
}
