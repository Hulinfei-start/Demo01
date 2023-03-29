package com.msb.file;

import com.msb.pojo.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/myServlet.do",initParams = {@WebInitParam(name="realname",value="xiaoming")})
public class File0_FileService implements Filter {
    //@WebInitParam(name="realname",value="xiaoming")
    //这个是将参数传入FilterConfig对象中 ,可以在init方法中获取参数

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化方法
        System.out.println("过滤器进行了初始化方法");
        String realname = filterConfig.getInitParameter("realname");
        System.out.println(realname);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //做出过滤的方法
        HttpServletResponse  resp=(HttpServletResponse)servletResponse;
        HttpServletRequest req=(HttpServletRequest)servletRequest;

        // post乱码的处理
        req.setCharacterEncoding("UTF-8");



        System.out.println("Filter doFilter 对请求做出过滤");
        ServletContext servletContext = req.getServletContext();
        User user =new User("xiaofang","123456");
        servletContext.setAttribute("realname2",user);
        //放行操作
        filterChain.doFilter(servletRequest, servletResponse);

        resp.getWriter().write("<hr/>");
        resp.getWriter().write("过滤器返回数据");
        System.out.println("过滤器返回数据");


        //对返回数据进行乱码处理
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

    }

    @Override
    public void destroy() {
        //销毁方法
        System.out.println("过滤器进行了销毁");
    }

}
