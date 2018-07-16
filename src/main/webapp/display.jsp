
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Request page</title>
</head>
<body>
<h1 align="center">Welcome in display.jsp</h1>
<%
System.out.print(request.getAttribute("res"));

%>
<h2 align="center">
    Result is: ${res}
</h2>
</body>
</html>
