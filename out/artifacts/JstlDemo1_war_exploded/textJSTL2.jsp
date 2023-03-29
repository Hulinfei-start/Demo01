<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="i" begin="1" end="9" step="1">
    <c:forEach var="j" begin="1" end="${i}" step="1">
        ${i}* ${j} = ${i*j}&nbsp;
    </c:forEach><br/>
</c:forEach>
</body>
</html>
