<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.80.0">
<title>Certificacion- Talento Digital</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/checkout/">



<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/5.0/dist/css/bootstrap.min.css"
	rel="stylesheet" />

<!-- Favicons -->
<link rel="apple-touch-icon"
	href="https://getbootstrap.com/docs/5.0/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon"
	href="https://getbootstrap.com/docs/5.0/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon"
	href="https://getbootstrap.com/docs/5.0/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest"
	href="https://getbootstrap.com/docs/5.0/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="https://getbootstrap.com/docs/5.0/assets/img/favicons/safari-pinned-tab.svg" />
<link rel="icon"
	href="https://getbootstrap.com/docs/5.0/assets/img/favicons/favicon.ico">
<meta name="theme-color" content="#7952b3">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>


<!-- Custom styles for this template -->
<link
	href="https://getbootstrap.com/docs/5.0/examples/checkout/form-validation.css"
	rel="stylesheet">
</head>
<body class="bg-light">

	<div class="container">
		<main>
			<div class="py-5 text-center">
				<img class="d-block mx-auto mb-4"
					src="https://getbootstrap.com/docs/5.0/assets/brand/bootstrap-logo.svg"
					alt="" width="72" height="57">
				<h2>Certificación</h2>
			</div>

			<div class="row g-3">

				<div class="col-md-12 col-lg-12">
					<h3 class="mb-3">Búsqueda de Películas</h3>
					
					<hr class="my-4">
					
					<form class="needs-validation" action="reporte" method="post" novalidate>
						<div class="row g-3">

							<div class="col-sm-3">
								<label for="idcategoria" class="form-label">Categoría</label> 
								<select name="idcategoria" id="idcategoria" 
									class="form-control" required>
									<option value="">Seleccione Categoría</option>
									<c:forEach items="${lcategoria}" var="lcat">
										<option value='<c:out value="${lcat.getIdcategoria()}" />'><c:out value="${lcat.getNombre()}" /></option>
									</c:forEach>
								</select>
								<div class="invalid-feedback">Seleccione una categoría</div>
							</div>
							
							<div class="col-sm-6">
								<label for="titulo" class="form-label">Título</label> 
								<input type="text"  name="titulo" id="titulo" placeholder="Ingrese título" class="form-control" required>
								<div class="invalid-feedback">Ingrese un título o palabra de busqueda</div>
							</div>
							
						
						<div class="col-sm-3">
							<button class="w-100 btn btn-primary btn-lg" type="submit">Buscar</button>
						</div>
						
						</div>

						
					</form>
				</div>

						<hr class="my-4">
				

			</div>
			
			<div class="table-responsive">
						        <table class="table table-striped">
						          <thead>
						            <tr>
										<th scope="col">Categoria</th>
										<th scope="col">Id Film</th>
										<th scope="col">Título</th>
										<th scope="col">Duración</th>
										<th scope="col">Rating</th>
										<th scope="col">Precio</th>
										<th scope="col">Duración Arriendo</th>
										<th scope="col">Acción</th>
						            </tr>
						          </thead>
						          <tbody>
									<c:forEach items="${lpeliculas}" var="lpe" >	
									<tr>
										<td><c:out value="${lpe.getCategoria()}" /></td>
										<td><c:out value="${lpe.getIdpelicula()}" /></td>
										<td><c:out value="${lpe.getTitulo()}" /></td>
										<td><c:out value="${lpe.getDuracion()}" /></td>
										<td><c:out value="${lpe.getRating()}" /></td>
										<td><c:out value="${lpe.getPrecio()}" /></td>
										<td><c:out value="${lpe.getDuracionarriendo()}" /></td>
										<td><button type="button" class="btn btn-default btn-xs">Ver</button></td>
									</tr>
									</c:forEach>
						          </tbody>
						        </table>
						      </div>
      
		</main>

		<footer class="my-5 pt-5 text-muted text-center text-small">
			<p class="mb-1">&copy; 2021 Awakelab - CB</p>
			<ul class="list-inline">
				<li class="list-inline-item"><a href="http://www.awakelab.cl" target="_blank">Awakelab</a></li>
				<li class="list-inline-item"><a href="https://talentodigitalparachile.cl" target="_blank">Talento Digital</a></li>
				<li class="list-inline-item"><a href="http://www.adalid.cl" target="_blank">Adalid</a></li>
			</ul>
		</footer>

	</div>


	<script
		src="https://getbootstrap.com/docs/5.0/dist/js/bootstrap.bundle.min.js"></script>

	<script
		src="https://getbootstrap.com/docs/5.0/examples/checkout/form-validation.js"></script>

</body>
</html>