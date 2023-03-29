<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--
        c:scope 指定放数据的域  page  request  session  application
        var :  数据的名字
        value : 数据
  --%>
   <c:set scope="page" var="pageName" value="pageValue"></c:set>
   <c:set scope="request" var="requestName" value="requestName"></c:set>
   <c:set scope="session" var="sessionName" value="sessionName"></c:set>
   <c:set scope="application" var="applicationName" value="applicationValue"></c:set>
<%--
      c:remove 移除指定中的域
--%>
  <c:remove var="pageName" scope="page"></c:remove>

  <%--
     c: out   取出制定中的域
  --%>

  <c:out value="${pageContext.pageName}" default="默认值"></c:out>
  <%--
  通过El表达式取出来
  --%>
  <hr/>
  ${pageScope.pageName}<hr/>
  ${requestScope.requestName}<hr/>
  ${sessionScope.sessionName}<hr/>
  ${applicationScope.applicationName}<hr/>




  </body>
</html>
