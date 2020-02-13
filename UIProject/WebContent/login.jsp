<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login</title>
</head>
<body>
	<form action="Login" method="post">
		<h3>Please login..</h3>
		<table>
			<tr>
				<td>Email</td>
				<td><input type="text" name="useremail" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="userpassword" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
