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
<c:set var="cursoS" scope="session" value="${perfilCurso}"></c:set>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div class="box">
				<!-- /.row -->
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						resumen del curso <strong>${cursoS.titulo}</strong>
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
					<div  style="text-align:center">
						<img alt="Foto" src="imagenes/addressbook_add_128.png" width=60%>
					</div>
					<div style="text-align:center">
					<br /><br /><br /><br />
					<c:if test="${estadoValidacion==null}">
						<a href="Cursos?accion=${cursoS.titulo}&estado=matricularse"><button type="button"
									class="btn btn-default" style="text-align:center" >Matricularse</button></a>
									</c:if>
									<c:if test="${estadoValidacion!=null}">
						<a href="chat.jsp"><button type="button"
									class="btn btn-default" style="text-align:center" >Chat</button></a>
									</c:if>
					</div>
					</div>
					<div>
						<div class="form-group col-lg-4">

							<!-- <div class="form-group"> <label>Nombre del curso:</label>${param.titulo}</div> -->
							
							<div class="form-group"> <label>Categoria:</label> ${cursoS.categoria}</div>
							<div class="form-group"> <label>Descripcion:</label> ${cursoS.descripcion}</div>
							<div class="form-group"> <label>Horas del curso:</label> ${cursoS.horas}</div>
							<div class="form-group"> <label>Empieza el:</label> ${cursoS.fechaInicio}</div>
							<div class="form-group"> <label>El temario sera:</label> ${cursoS.temario}</div>
							<div class="form-group"> <label>Profesor:</label> ${cursoS.usuario}</div>
							<div class="form-group"> <label>Nivel del curso:</label> ${cursoS.nivel}</div>
							<div class="form-group"> <label>Precio:</label> ${cursoS.precio} €</div>
						
						
							




							
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