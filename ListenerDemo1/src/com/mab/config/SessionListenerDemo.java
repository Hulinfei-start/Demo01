package com.mab.config;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//这是监听器的实现方法
@WebListener
public class SessionListenerDemo  implements HttpSessionListener {

    private  int a=1;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        //这里是监视session的访问
        //统计在线人数
        HttpSession session = httpSessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        Object account = servletContext.getAttribute("account");
        if (null == account){
            servletContext.setAttribute("account",1);
        }else{
            servletContext.setAttribute("account",+(int)account+1);
        }

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

        System.out.println("11111111111");
        //这里是监视session的销毁
        HttpSession session = httpSessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        int account = (int)servletContext.getAttribute("account");
        servletContext.setAttribute("account",--account);
    }
}
