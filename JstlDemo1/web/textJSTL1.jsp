<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/27
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c"  uri ="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%
        //随机生成一个数字 放入session域中
       int number = new Random().nextInt(101);
       request.getSession().setAttribute("number",number);
  %>

   <%--
    test属性 为判断条件 如果text属性的值为true 则显示后边内容 否则不显示
    c:if     可以将结果存放到指定的域中
     scope   指定的域
     var     数据名
   --%>

   分数 <h2>${sessionScope.number}</h2>
    <c:if test="${sessionScope.number ge 90}"><h3>成绩优秀<h3/></c:if>
    <c:if test="${sessionScope.number ge 60 and sessionScope.number lt 90}"><h3>成绩良好<h3/></c:if>
    <c:if test="${sessionScope.number lt 60}"><h3>成绩不及格<h3/></c:if>

     <%-- 输出分数是否及格--%>
     <c:if test="${sessionScope.number ge 60}" scope="session" var ="fenshu">及格</c:if>
     <c:if test="${!sessionScope.fenshu}">不及格</c:if><hr/>

                <%--只执行一次--%>
               <c:choose>
                        <c:when test="${number ge 90}">优秀</c:when>
                        <c:when test="${number ge 70}">良好</c:when>
                        <c:when test="${number ge 60}">及格</c:when>
                        <c:when test="${number ge 0}">不及格</c:when>
               </c:choose>


</body>
</html>
