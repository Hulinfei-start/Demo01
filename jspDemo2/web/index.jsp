<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      table{
        border: 5px solid blueviolet;
        width: 60%;
        margin: 0px auto;
      }
      th,td{
        border: 1px solid aquamarine;
      }
    </style>
  </head>
  <body>
      <table cellpadding="0px" cellspacing="0px">
            <tr>
              <th>编号</th>
              <th>姓名</th>
              <th>上级编号</th>
              <th>职务</th>
              <th>入职日期</th>
              <th>薪资</th>
              <th>补助</th>
              <th>部门号</th>
              <th>薪资等级</th>
          </tr>
          <%--  <%
              List<Emp> emps = (List<Emp>)request.getAttribute("emps");
              for (Emp emp : emps) {
          %>
                  <tr>
                      <th><%=emp.getEmpno()%></th>
                      <th><%=emp.getEname()%></th>
                      <th><%=emp.getJob()%></th>
                      <th><%=emp.getMgr()%></th>
                      <th><%=emp.getHiredate()%></th>
                      <th><%=emp.getSal()%></th>
                      <th><%=emp.getComm()%></th>
                      <th><%=emp.getDeptno()%></th>
                      <th>
                          <%
                              if (emp.getSal() < 5000){
                                %>  ${requestScope.empDi}
                              <%}else if(emp.getSal() < 8000){
                              %> ${requestScope.empZhong}
                          <%}else{
                            %>    ${requestScope.empGao}
                              <%}
                          %>
                      </th>
                  </tr>
          <%
              }
          %>--%>
<%--
        c:foreach
            items  要遍历的数组/list 可以通过El表达式取出集合之后更改属性赋值
            var    中间变量的名称
            varStatus  记录每一个对象的设置
                    count 个数
                    index 索引
                    first 判断是不是第一个,为true  否则为false
                    last   判断是不是最后一个个,为true  否则为false
                    current 返回对象本身
--%>
          <c:forEach items="emps" var="emp">
          <tr>
              <th>${emp.getEmpno}</th>
              <th>${emp.getEname}</th>
              <th>${emp.getJob}</th>
              <th>${emp.getMgr}</th>
              <th>

                  <fmt:formatDate value="${emp.getHiredate}" pattern="yyyy年MM月dd日"></fmt:formatDate>
              </th>
              <th>${emp.getSal}</th>
              <th>${emp.getComm}</th>
              <th>${emp.getDeptno}</th>
              <th><c:choose>
                  <c:when test="${emp.getSal ge 80000}">低收入人群</c:when>
                  <c:when test="${emp.getSal ge 50000}">低收入人群</c:when>
                  <c:when test="${emp.getSal ge 10000}">低收入人群</c:when>
              </c:choose></th>
           <tr/>
          </c:forEach>
      </table>
  </body>
</html>
