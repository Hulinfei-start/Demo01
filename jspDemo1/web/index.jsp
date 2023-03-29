<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/26
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 此处设置为true时 ,是处理其他页面异常时使用的-->
<%@ page  isErrorPage="true" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <%
   //九大域对象
        //四个域对象
        pageContext.setAttribute("pagename","zhangsan");//page域  四个域中最小的
        request.setAttribute("requestname","lisi");//request域 这个在一次请求中的域
        session.setAttribute("sessionname","王五");//session域  这个是在一次的会话中存在的域 `
        application.setAttribute("contextname","赵六");//最大的域 这个是随服务的的启动创建和销毁的
       //响应对象
        response.setHeader("","");
        //输出流对象
        out.print("");
        //三个打酱油的
        config.getInitParameter("");//serviceConfig对象
        page.getClass();
        exception.getMessage();//异常对象
 %>
  </body>
</html>
