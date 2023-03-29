<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/3/26
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery.min.js"></script>
  </head>
  <body>
  <script>
    $(function() {
      show(0,"#provience")
    })
    function show(val,selectID){
      $.ajax(
              {
                type: "GET",
                url: "areaController.do",
                data: {servletID: val},
                dataType: "json",
                success: function (areas) {
                  //清楚上一次省份的数据
                  $(selectID).html("<option>-请选择-</option>")
                  $("#qu").html("<option>-请选择-</option>")
                  $.each(areas,function(i,e){
                    $(selectID).append('<option value="'+e.areaid+'">'+e.areaname+'</option>')
                  })
                }
              }
      )
    }
  </script>

  籍贯:
  <select id="provience" onchange="show(this.value,'#city')" >
    <option>-请选择-</option>
  </select>
  <select id="city" onchange="show(this.value,'#qu')">
    <option>-请选择-</option>
  </select>
  <select id="qu">
    <option>-请选择-</option>
  </select>
  </body>
</html>
