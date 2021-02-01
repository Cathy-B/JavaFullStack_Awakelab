<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/CSS/estilo.css" rel="stylesheet">
<title>Contacto</title>
</head>
<body>
	<header class="col-6 col-s-5">
		<nav class="nav_diseño">
			<a href="<%=request.getContextPath()%>/">Página de Inicio</a>|
			<a href="<%=request.getContextPath()%>/creacapacitacion">Crear Capacitación</a>|
			<a href="<%=request.getContextPath()%>/listacapacitaciones">Listar Capacitación</a>| 
			<a href="<%=request.getContextPath()%>/listausuarios">Listado Usuarios</a>
		</nav>
	</header>
	<br/>
	<h1>Formulario de Contacto</h1>
	<form name="frmcrearcon" id="frmcrearcon" method="post" action='<c:out value="${pageContext.request.contextPath}"/>/procesacontacto' >

        <table id="tabla">
            <tr>
                <td>Ingrese nombre:</td>
                <td> <input  type="text" name="nombre" id="nombre"> </td>
            </tr>

            <tr>
                <td>Ingrese correo electrónico:</td>
                <td> <input  type="text" name="correo" id="correo"></td>
            </tr>

            <tr>
                <td>Ingrese teléfono:</td>
                <td> <input  type="text" name="telefono" id="telefono"> </td>
            </tr>

            <tr>
                <td> Ingrese mensaje: </td>
                <td> <textarea  name="mensaje" id="mensaje"></textarea></td>
            </tr>

           
            <tr>
                <td colspan="2"><button type="submit" name="btnvalidar" id="btnvalidar" class="centrado">Enviar</button></td>

            </tr>


        </table>
    </form>
</body>
</html>