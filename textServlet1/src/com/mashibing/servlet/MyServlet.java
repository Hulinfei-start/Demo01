package com.mashibing.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet  extends HttpServlet  {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     /*   ServletContext servletContext = req.getServletContext();
        String pinpai = servletContext.getInitParameter("pinpai");
        System.out.println(pinpai);
        String pingmu = servletContext.getInitParameter("pingmu");
        System.out.println(pingmu);
        String jianpan = (String) servletContext.getAttribute("jianpan");
        System.out.println("jianpan"+jianpan);*/
        System.out.println("myServlet  执行了service方法");
        resp.setContentType("text/html;charset=Utf-8");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("myServlet 返回响应数据");

    }
}
