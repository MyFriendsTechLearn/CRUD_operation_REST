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
<form action="UpdateServlet" method="get">
<table border="1" bgcolor="yellow">
<tr><td><b>Enter User Id</b></td><td> <input type="text" name="uid"></td></tr>

<tr><td><b>Enter New UserName</b></td><td><input type="text" name="uname"></td></tr>
<tr><td><b>Enter New Password</b></td><td> <input type="password" name="password"></td></tr>
<tr><td><input type="submit" value="Update" >


</table>


</form>

</center>
</body>
</html>