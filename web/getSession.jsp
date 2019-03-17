<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>getSession</title>
</head>
<body>
<%
    String name = (String)session.getAttribute("name");
%>

session中的name: <%=name%>
</body>
</html>
