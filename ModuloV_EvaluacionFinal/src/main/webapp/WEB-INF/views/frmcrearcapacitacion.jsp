<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link href="${pageContext.request.contextPath}/resources/CSS/estilo.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css" />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<title>Crear Capacitación</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/">Página de Inicio</a>|
			<a href="<%=request.getContextPath()%>/creacontacto">Contacto</a>|
			<a href="<%=request.getContextPath()%>/listacapacitaciones">Listar Capacitación</a>| 
			<a href="<%=request.getContextPath()%>/listausuarios">Listado Usuarios</a>
		</nav>
	</header>
	
	<form id="frmcrearcap" name="frmcrearcap" method="post" action='<c:out value="${pageContext.request.contextPath}"/>/procesacrear'>
	<table id="tabla">
	 <tr>
      <td>ID Capacitación:</td>
      <td><input type="text" name="id" id="id"></td>
    </tr>
    <tr>
      <td>Fecha Capacitación:</td>
      <td><input type="date" name="fecha" id="fecha"></td>
    </tr>
    <tr>
      <td>Hora de capacitación:</td>
      <td><input type="time" name="hora" id="hora"></td>
    </tr>
    <tr>
      <td>Lugar:</td>
      <td><input type="text" name="lugar" id="lugar"></td>
    </tr>
    <tr>
      <td>Duración:</td>
      <td><input type="text" name="duracion" id="duracion"></td>
    </tr>
    <tr>
      <td>Rut del Cliente:</td>
      <td><input type="text" name="rut" id="rut"></td>
    </tr>
    <tr>
       <td colspan="2"><button type="submit" class="centrado" name="btnvalidar" id="btnvalidar">Crear</button></td>
           
    </tr>
  </table>
  </form>
</body>
</html>