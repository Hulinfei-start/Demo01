package com.msb.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.msb.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@WebServlet(urlPatterns = "/myServlet1.do")
public class MyServlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ajax中存放的内容
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        //输出检测
        System.out.println(userName);
        System.out.println(passWord);

        //自己编写字符串
       String user = "{\"userName\":\"小红\",\"passWord\":\"456123\"}";

        //使用工具类自动转json
        GsonBuilder gson=new GsonBuilder();
        gson.setDateFormat("yyyy-MM-dd");
        List <Student> list =new ArrayList<>();
        Student student1 = new Student("xiaohu1",170,"男","28");
        Student student2 = new Student("xiaohu2",171,"男","28");
        Student student3 = new Student("xiaohu3",172,"男","28");
        Student student4 = new Student("xiaohu4",173,"男","28");
        Student student5 = new Student("xiaohu5",174,"男","28");
        Collections.addAll(list,student1,student2,student3,student4,student5);
        Gson gson1 = gson.create();
        String s = gson1.toJson(list);

        //编码格式设置
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //返回浏览器
       // resp.getWriter().println("myServlet1 返回响应数据");
        resp.getWriter().println(s);
        resp.getWriter().println(user);
    }
}
