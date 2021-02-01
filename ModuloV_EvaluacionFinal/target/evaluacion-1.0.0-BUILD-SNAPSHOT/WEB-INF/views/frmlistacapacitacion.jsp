<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/CSS/estilo.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.js"></script>
<script
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap.min.js"></script>
	
<script type="text/javascript" src = "${pageContext.request.contextPath}/resources/JS/funciones.js"></script>
<title>Listado Capacitaciones</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/">Página de Inicio</a>|
			<a href="<%=request.getContextPath()%>/creacontacto">Contacto</a> |
			<a href="<%=request.getContextPath()%>/creacapacitacion">Crear Capacitación</a>|
			<a href="<%=request.getContextPath()%>/listausuarios">Listado Usuarios</a>
			
		</nav>
	</header>
	<table id="tbl" class= "table table-striped table-bordered" style="width:100%">
		<thead>
        <tr>
          <th>ID de Capacitación</th>
          <th>Fecha de capacitación</th>
          <th>Hora de capacitación</th>
          <th>Lugar de capacitación</th>
          <th>Duración de la capacitación</th>
          <th>Rut del cliente</th>
        </tr>
        </thead>
        
        <tbody>
        <c:forEach items="${lcapacitaciones}" var="cap">
        <tr>
          <td><c:out value="${cap.getIdcapacitacion()}" /></td>
          <td><c:out value="${cap.getCapfecha()}" /></td>
          <td><c:out value="${cap.getCaphora()}" /></td>
          <td><c:out value="${cap.getCaplugar()}" /></td>
          <td><c:out value="${cap.getCapduracion()}" /></td>
          <td><c:out value="${cap.getCliente_rutCliente()}" /></td>
        </tr>
        </c:forEach>
        </tbody>
      </table>
</body>
</html>