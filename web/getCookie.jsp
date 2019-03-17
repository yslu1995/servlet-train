<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/9
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>getCookie</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="javax.servlet.http.Cookie" isELIgnored="false"%>

<%
    Cookie[] cookies = request.getCookies();
    if (null != cookies)
        for (int d = 0; d <= cookies.length - 1; d++) {
            System.out.println(cookies[d].getName() + ":" + cookies[d].getValue());
        }
%>
</body>
</html>
