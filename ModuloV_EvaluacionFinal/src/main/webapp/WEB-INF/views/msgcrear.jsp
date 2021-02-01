<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear</title>
</head>
<body>
	<h2>Crear </h2>
	<p><c:out value="${msgcrearcap}" /></p>
	<p><c:out value="${msgcrearcon}" /></p>
	<p><c:out value="${msgcrearusu}" /></p>
	<br/><br/>
	<a href='<c:out value="${pageContext.request.contextPath}" />/'>Ir a la pagina principal</a>
</body>
</html>