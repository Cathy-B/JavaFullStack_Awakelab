<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Edición</title>
		<link rel="stylesheet" href='<c:out value="${pageContext.request.contextPath}"/>/resources/css/estilos.css' />
	</head>
	<body>
		<h1>Edición de producto</h1>
		<p><c:out value="${msge}" /></p>
		<br/><br/>
		<a href='<c:out value="${pageContext.request.contextPath}" />'>Ir a la página principal</a><br/>
	</body>
</html>