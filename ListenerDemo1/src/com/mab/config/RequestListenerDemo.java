package com.mab.config;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

//request域对象的监视器
@WebListener
public class RequestListenerDemo  implements ServletRequestListener {
    private SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        //这是监视对象销毁的方法
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

        //这里是监视对象创建的方法
        //案例开发
        HttpServletRequest servletRequest = (HttpServletRequest)servletRequestEvent.getServletRequest();
        //获取请求对象的ip地址
        String remoteHost = servletRequest.getRemoteHost();
        //获取请求对象的路径
        StringBuffer requestURL = servletRequest.getRequestURL();
        //获取请求对象的访问时间
        String format = simpleDateFormat.format(new Date());

        try {
            PrintWriter printWriter= new PrintWriter(new FileOutputStream(new File("d:/mashibing.txt"),true));
            printWriter.println(remoteHost+requestURL+"   "+format);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
