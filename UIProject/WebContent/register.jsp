<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Registration</title>
</head>
<body>
	<form action="Register" method="post">
		<h2>Welcome to Registration Page..</h2>
		<br />
		<table>
			<tr>
				<td>Enter name</td>
				<td><input type="text" name="username" /><br /></td>

			</tr>
			<tr>
				<td>Enter email</td>
				<td><input type="email" name="useremail" /><br></td>

			</tr>
			<tr>
				<td>Enter password</td>
				<td><input type="password" name="userpassword" id="" placeholder="Password"><br></td>

			</tr>
			<tr>
				<td>Enter age</td>
				<td><input type="text" name="userage" /><br /></td>

			</tr>
			<tr>
				<td>Select gender</td>
				<td><select name="gender" id="">
						<option value="male">Male</option>
						<option value="female">Female</option>
						<option value="other">Other</option>
				</select></td>

			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>



