<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resumen Curso</title>
<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div class="box">
				<!-- /.row -->
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						resumen de <strong>curso</strong>
					</h2>
					<hr>


					<ul id="ulErroresEnPagina"></ul>

					<c:choose>
						<c:when test="${not empty mensaje }">
							<p class="error">${mensaje }</p>
						</c:when>
					</c:choose>

					<div>
						<img alt="Foto" src="imagenes/addressbook_add_128.png" width=10%>
					</div>
					<div>
						<div class="form-group col-lg-4">

							<h2 class="intro-text">Nombre del curso:${param.nom}</h2>
							<h2 class="intro-text">Categoria:${param.categoria}</h2>
							<h2 class="intro-text">Descripcion:${param.descripcion}</h2>
							<h2 class="intro-text">Numero de horas:${param.horas}</h2>
							<h2 class="intro-text">Desde:${param.f_inicio}</h2>
							<h2 class="intro-text">Hasta: ${param.f_inicio}</h2>
							<h2 class="intro-text">Temario:${param.temario}</h2>
							<h2 class="intro-text">Profesor:${param.profesor}</h2>
							<h2 class="intro-text">Dificultad:${param.dificultad}</h2>
							<h2 class="intro-text">Cierre curso:${param.cierre_curso}</h2>
							<h2 class="intro-text">Precio:${param.precio}</h2>




							<a href="matriculacionDeCurso.jsp"><button type="button"
									class="btn btn-default">Matricularse</button></a>
						</div>
					</div>




				</div>
			</div>
		</div>
		</div>

		<!-- jQuery -->
		<script src="js/jquery.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="js/bootstrap.min.js"></script>


		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>