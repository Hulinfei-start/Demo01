package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.service.JspService;
import com.msb.service.impl.JspServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.EmptyStackException;
import java.util.List;

@WebServlet(urlPatterns = "/jspController.do")
public class JspController extends HttpServlet {

    //创建service对象
    JspService jspService =new JspServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List emps = jspService.findEmps();
            resp.setContentType("text/html;charset=UTF-8");
            resp.setCharacterEncoding("UTF-8");
            req.setAttribute("emps",emps);
             req.setAttribute("empDi","低收入人群");
             req.setAttribute("empZhong","中收入人群");
             req.setAttribute("empGao","高收入人群");
            //相应重定向
            req.getRequestDispatcher("index.jsp").forward(req,resp);

        } catch (ParseException e) {
            System.out.println("chucuole");
        }

    }
}
