<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vista previa curso</title>
<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/miestilo.css" rel="stylesheet">


<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">
<script type="text/javascript">
	function val() {
		alert("Curso enviado para validar");
	}
</script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<script src="js/jquery.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="js/validarCurso2.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>


<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">

		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						Vista previa del curso <strong>del curso</strong>
					</h2>
					<hr>
				
					<div class="form-group col-lg-4">
						<h2 class="intro-text"> Nombre del curso </h2><label>nombre aqui${param.nom}</label>
						<h2 class="intro-text">Categoria</h2><label>categoria aqui ${param.categoria}</label>
						
						<div>
						<br />
							<img alt="Foto" src="imagenes/addressbook_add_128.png" width=60%>
						</div>
						
						
						</div>
							<div class="form-group col-lg-4">

								<!-- <div class="container" style="margin-right: 300px"> -->
								<h2 class="intro-text">Temario</h2>
								<div class="panel-group">
									<div class="panel panel-default">
										<div class="panel-heading">secciones ${param.secciones}</div>
										<div class="panel-body">
											lecciones ${param.lecciones}</div>
										<div class="panel-body">
											lecciones ${param.lecciones}</div>
										<div class="panel-body">
											lecciones ${param.lecciones}</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">secciones ${param.secciones}</div>
										<div class="panel-body" >
											lecciones ${param.lecciones}</div>
										<div class="panel-body">
											lecciones ${param.lecciones}</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">secciones ${param.secciones}</div>
										<div class="panel-body">
											lecciones ${param.lecciones}</div>
									</div>
								</div>
							</div>
								<div class="form-group col-lg-4">
<h2 class="intro-text">Informacion</h2>
												<div class="panel panel-default">
																				
												<div class="panel-heading">Profesor: ${param.profesor}</div>
													<div class="panel-body" >Fecha
														inicio curso: ${param.f_inicio}</div>
													<div class="panel-body">Fecha
														fin curso: ${param.f_fin}</div>
													<div class="panel-body">Numero
														de horas: ${param.horas}</div>
													<div class="panel-body">Dificultad
														del curso: ${param.dificultad}</div>
												

								</div>

												</div>
											</div>
										</div>
									</div>
									<nav class=" navbar-foot  navbar-fixed-bottom">
											
											<div>
												<form onSubmit="return validarCurso(this)" role="form"
													action="Cursos" method="post">
													<input type="text" name="action" value="vistaPrevia"
														style="display: none">
														
													<div style="text-align: center" >
														<button type="submit" class="btn btn-default" name="enviarValidar"
															id="enviarValidar" OnClick="val()">Enviar a
															validar</button>
														<a href="formularioCurso.jsp" style="color: white"><strong>Volver atras</strong></a>
													</div>
												</form>
											</div>

									</nav>
																			</div>
									


	
</div>  -->

					<!-- jQuery -->
					<script src="js/jquery.js"></script>

					<!-- Bootstrap Core JavaScript -->
					<script src="js/bootstrap.min.js"></script>


					<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>