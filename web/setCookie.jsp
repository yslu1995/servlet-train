<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/9
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>SetCookie</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="javax.servlet.http.Cookie"%>

<%
    Cookie c = new Cookie("qq", "469899431");
    c.setMaxAge(60 * 24 * 60);
    c.setPath("/");
    response.addCookie(c);
%>

<a href="getCookie.jsp">跳转到获取cookie的页面</a>
</body>
</html>
