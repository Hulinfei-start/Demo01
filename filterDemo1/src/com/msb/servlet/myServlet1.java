package com.msb.servlet;

import com.msb.pojo.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/myServlet.do")
public class myServlet1  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = req.getServletContext();
        User user = (User)servletContext.getAttribute("realname2");
        System.out.println("这个实在application中取到的"+user);


        String realname2 = (String)servletContext.getAttribute("realname");
        System.out.println("这个实在application中取到的realname2"+realname2);
        //在seesion域中获取
        HttpSession session = req.getSession();
        String realname = (String) session.getAttribute("realname");
        System.out.println("在session中取到的"+realname);

        //输出方法
        System.out.println("MyServlet1 执行了service方法");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.print("MyService 返回响应数据");
    }
}
