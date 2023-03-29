package com.msb.controller;

import com.google.gson.Gson;
import com.msb.pojo.Area;
import com.msb.service.AreaService;
import com.msb.service.impl.AreaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.URIParameter;
import java.util.List;

@WebServlet(urlPatterns = "/areaController.do")
public class AreaController  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建service实体类 调用service包梳理业务逻辑
        AreaService areaService= new AreaServiceImpl();
        //从request 中获取传进来的参数
        int sercletID = Integer.valueOf(req.getParameter("servletID"));
        List<Area> areas= areaService.findAll(sercletID);
        //转换成JSON格式的字符串
       String gson =new Gson().toJson(areas);

        System.out.println(areas);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().print(gson);
    }
}
