<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yahoo!!!! from jsp</title>

</head>
<body>
My jsp ${name1} <!-- expression language -->
<p><font color="red">${errorMeassage}</font>
<form action="/login.do" method="post">
Enter your name :
<input type="text" name="name">
Enter your Password :
<input type="password" name="password">
Login
<input type="submit">
</form>
</body>
</html>