<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>

	<label>Welcome to Videos Section</label>
	<br>
	<br>
	<br>

	<iframe width="560" height="315"
		src="https://www.youtube-nocookie.com/embed/7mT8El4mBVw" frameborder="0"
		allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>
	<br>
	<br>
	<form action="Logout" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>