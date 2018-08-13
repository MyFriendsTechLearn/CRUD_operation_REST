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
		<form method="doget" action="RegisterServlet">
			<table border="1">
				<thead>
					<h2>Enter Details</h2>
				</thead>
				<tr>
					<td><b>User ID</b></td>
					<td><input type="text" name=uid></td>
				</tr>
				<tr>
					<td><b>User Name</b></td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td><b>Password</b></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><b>Date Of Birth</b></td>
					<td><input type="date" name="bday"></td>
				</tr>
				<tr>
					<td><b>Select Gender</b><input type="radio" name=gender
						value="male">:Male <input type="radio" name=gender
						value="female">:Female</td>
				</tr>
				<tr>
					<td><b>City</b> <select name="myselect">
							<option>select</option>
							<option value="Bangalore">Bangalore</option>
							<option value="Hyderabad">Hyderabad</option>
							<option value="Chennai">Chennai</option>
							<option value="Pune">Pune</option>
					</select></td>
				</tr>
				<br>
				<tr>
					<td><center>
							<input type="submit" value="Submit">
						</center></td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>