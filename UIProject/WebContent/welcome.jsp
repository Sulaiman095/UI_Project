<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Killer</title>
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


	<h3>Welcome ${username}</h3>
	<br>
	<a href="videos.jsp">Videos</a>
	<br>
	<br>
	<form action="Logout" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>