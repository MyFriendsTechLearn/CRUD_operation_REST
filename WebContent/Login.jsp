<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<form action="LoginServlet" method="doget">
<table border="1">
<thead><center>Login User</center></thead>
<tr><td> <b>User ID</b></td><td><input type="text" name=uid></td></tr>
<tr><td><b>PassWord</b></td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table></form></center>
</body>
</html>