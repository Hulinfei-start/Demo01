<%@ page import="com.msb.pojo.Emp" %>
<%@ page import="java.util.List" %>
<%@ page import="jdk.nashorn.internal.objects.annotations.Where" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/27
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
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
            <%
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
          %>
      </table>
  </body>
</html>
