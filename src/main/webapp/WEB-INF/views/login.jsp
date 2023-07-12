<%@page import="java.util.Date , java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yahoo!!!! from jsp</title>
<%
System.out.println("hello head-> i am java code form jsp using scriptlet");
System.out.println(request.getParameter("name"));
%>
</head>
<body>
My jsp ${name1} <!-- expression language -->

<%
System.out.println("hello body -> i am java code form jsp using scriptlet");
System.out.println(request.getParameter("name"));
//java.util.Date date = new java.util.Date();
Date date = new Date();
%>

<div>Current date is <%=date%></div>
</body>
</html>