<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Creacion del curso</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

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

		<!-- Page Heading -->
		<div class="row">
			<div class="box">
			<!-- /.row -->
 <hr>
                    <h2 class="intro-text text-center">crear
                        <strong>curso</strong>
                    </h2>
                    <hr>
			<div style="margin: 10px 0px 10px 0px">

				<ul id="ulErroresEnPagina"></ul>

				<form onSubmit="return validarCurso(this)" role="form"
					action="Cursos" method="post">
					<input type="text" name="action" value="rellenar_formulario"
						style="display: none"> <br />
					<div class="form-group">

						<!--<c:choose>
	<c:when test="${not empty mensaje }">
		<p class="error">${mensaje }</p>
	</c:when>
	<c:otherwise>
		<br/>
	</c:otherwise>
</c:choose>-->
						<label for="nom">Nombre de curso </label> <input
							class="form-control" type="text" id="nom" name="nom"
							placeholder="Ej.: Matematicas" /><br>
					</div>
					<!-- <br/>
 <div class="form-group">
<label for="rama">Campo de enseñanza</label>
<input class="form-control" type="text" name="rama" id="rama" />
 </div>-->
					<br />
					<div class="form-group">
						<label>Descripcion del curso</label>
						<textarea class="form-control" rows="3" type="text"
							name="descripcion" id="descripcion"
							placeholder="Ej.: bases de datos"></textarea>
					</div>
					<br /> <br />
					<div class="form-group">
						<label>Listado del contenido del curso</label>
						<textarea class="form-control" rows="3" type="text" name="temario"
							id="temario" placeholder="Ej.: titulos de los temas"></textarea>
					</div>
					<br />
					<div class="form-group">
						<label>Listado de secciones del curso</label>
						<textarea class="form-control" rows="3" type="text"
							name="secciones" id="secciones"
							placeholder="Ej.: bloque 1, bloque2,..."></textarea>
					</div>
					<div class="form-group">
						<label>Listado de lecciones del curso</label>
						<textarea class="form-control" rows="3" type="text"
							name="lecciones" id="lecciones"
							placeholder="Ej.: tema1, tema2,..."></textarea>
					</div>
					<br />
					<div class="form-group">
						<label>Precio</label> <input class="form-control" type="number"
							name="precio" id="precio" placeholder="Ej.: 300">
					</div>
					<br />

					<div class="form-group">
						<label>Numero de horas</label> <input class="form-control"
							type="number" name="horas" id="horas"
							placeholder="Ej.: 0053 (cuatro digitos)">
					</div>
					<br />

					<div class="form-group">
						<label>Nombre del profesor</label> <input class="form-control"
							type="text" name="profesor" id="profesor" placeholder="Ej.: Pepe">
					</div>
					<br />
					<div class="form-group">
						<label>Fecha inicio del curso</label> <input class="form-control"
							type="text" name="f_inicio" id="f_inicio"
							placeholder="01/01/2016">
					</div>
					<br />
					<div class="form-group">
						<label>Fecha fin del curso</label> <input class="form-control"
							type="text" name="f_fin" id="f_fin" placeholder="01/02/2016">
					</div>
					<br />
					<div class="form-group">
						<label>Fecha de cierre del curso</label> <input
							class="form-control" type="text" name="cierre_curso"
							id="cierre_curso" placeholder="01/03/2016">
					</div>
					<br />
					<div class="form-group">
						<label>Categoria del curso</label> <input class="form-control"
							type="text" name="categoria" id="categoria"
							placeholder="Rama del curso">
					</div>
					<br />
					<div class="form-group">
						<label>Dificultad del curso</label> <input class="form-control"
							type="text" name="dificultad" id="dificultad"
							placeholder="Alta, Media o Baja">
					</div>
					<br />

					<div class="form-group">
						<label>Imagen del curso</label> <input type="file" name="imagen"
							id="imagen">
					</div>
					<br /> <br />
					<div class="form-group">
						<label>Acepta los terminos de creacion de curso</label> <label
							class="checkbox-inline"> <input type="checkbox"
							name="terminos" id="terminos">
						</label>
					</div>
					<div>
						<button type="submit" name="accion" id="accion"
							class="btn btn-default">Vista previa</button>
						<button type="reset" class="btn btn-default">Deshacer
							todo</button>
					</div>
				</form>


			</div>

</div>
		</div>
		<!-- /.container-fluid -->

	</div>
	<!-- /#page-wrapper -->

	<!-- /#wrapper -->

	<div id="dialogo" title="Hay Errores en el Formulario">
		<p>Por favor, corrija los siguientes errores y reenvíe el
			formulario:</p>
		<ul id="ulErrores"></ul>
	</div>
	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
