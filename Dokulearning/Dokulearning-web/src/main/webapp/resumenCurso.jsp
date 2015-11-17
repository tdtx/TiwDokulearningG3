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
						resumen del curso <strong>${param.nom}</strong>
					</h2>
					<hr>


					<ul id="ulErroresEnPagina"></ul>

					<c:choose>
						<c:when test="${not empty mensaje }">
							<p class="error">${mensaje }</p>
						</c:when>
					</c:choose>
							<div class="form-group col-lg-1"></div>
														<div class="form-group col-lg-1"></div>
							

					<div class="form-group col-lg-4">
					<div>
						<img alt="Foto" src="imagenes/addressbook_add_128.png" width=60%>
					</div>
					<div>
					<br /><br /><br /><br /><br /><br /><br />
						<a href="matriculacionDeCurso.jsp"><button type="button"
									class="btn btn-default" style="text-align:center" >Matricularse</button></a>
					</div>
					</div>
					<div>
						<div class="form-group col-lg-4">

							<!-- <div class="form-group"> <label>Nombre del curso:</label>${param.nom}</div> -->
							<div class="form-group"> <label>Categoria:</label>${param.categoria}</div>
							<div class="form-group"> <label>Descripcion:</label>${param.descripcion}</div>
							<div class="form-group"> <label>Horas del curso:</label>${param.horas}</div>
							<div class="form-group"> <label>Empieza el:</label>${param.f_inicio}</div>
							<div class="form-group"> <label>Acaba el:</label>${param.f_inicio}</div>
							<div class="form-group"> <label>El temario sera:</label>${param.temario}</div>
							<div class="form-group"> <label>El profesor es:</label>${param.profesor}</div>
							<div class="form-group"> <label>Dificultad del curso:</label>${param.dificultad}</div>
							<div class="form-group"> <label>El curso se cerrara:</label>${param.cierre_curso}</div>
							<div class="form-group"> <label>Precio:</label>${param.precio}</div>




							
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