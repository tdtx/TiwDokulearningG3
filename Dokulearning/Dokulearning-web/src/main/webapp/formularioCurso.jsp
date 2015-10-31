<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<div id="wrapper">

		<div id="page-wrapper">

			<div class="container-fluid">

				<!-- Page Heading -->
				<div class="row">
				
				</div>
				<!-- /.row -->
				<h1>Crear Curso</h1>

				<div style="margin: 100px 0px 100px 0px">

					<ul id="ulErroresEnPagina"></ul>

<form onSubmit="return validarCurso(this)" role="form" action="Cursos" method="post">
<input type ="text" name = "action" value="rellenar_formulario" style="display:none">
<br/>
<div class="form-group">

 <!--<c:choose>
	<c:when test="${not empty mensaje }">
		<p class="error">${mensaje }</p>
	</c:when>
	<c:otherwise>
		<br/>
	</c:otherwise>
</c:choose>-->
<label for="nom">Nombre de curso </label>
<input class="form-control" type="text" id="nom" name="nom" /><br>
</div>
<!-- <br/>
 <div class="form-group">
<label for="rama">Campo de enseñanza</label>
<input class="form-control" type="text" name="rama" id="rama" />
 </div>-->
 <br/>
<div class="form-group">
<label>Descripcion del curso</label>
<textarea class="form-control" rows="3" type="text" name="descripcion" id="descripcion"></textarea>
</div>
<br/>
 <br/>
 <div class="form-group">
<label>Listado del contenido del curso</label>
<textarea class="form-control" rows="3" type="text" name="temario" id="temario"></textarea>
</div>
<br/>
  <div class="form-group">
<label>Listado de secciones del curso</label>
<textarea class="form-control" rows="3" type="text" name="secciones" id="secciones"></textarea>
</div>
 <div class="form-group">
<label>Listado de lecciones del curso</label>
<textarea class="form-control" rows="3" type="text" name="lecciones" id="lecciones"></textarea>
</div>
<br/>
 <div class="form-group">
<label>Precio</label>
<input class="form-control" type="number" name="precio" id="precio">
</div>
<br/>
 
 <div class="form-group">
<label>Numero de horas</label>
<input class="form-control" type="number" name="horas" id="horas">
</div>
<br/>

 <div class="form-group">
<label>Nombre del profesor</label>
<input class="form-control" type="text" name="profesor" id="profesor"> 
</div>
<br/>
 <div class="form-group">
<label>Fecha inicio del curso</label>
<input class="form-control" type="text" name="f_inicio" id="f_inicio">
</div>
<br/>
 <div class="form-group">
<label>Fecha fin del curso</label>
<input class="form-control" type="text" name="f_fin" id="f_fin">
</div>
<br/>
 <div class="form-group">
<label>Fecha de cierre del curso</label>
<input class="form-control" type="text" name="cierre_curso" id="cierre_curso">
</div>
<br/>
 <div class="form-group">
<label>Categoria del curso</label>
<input class="form-control" type="text" name="categoria" id="categoria">
</div>
<br/>
 <div class="form-group">
<label>Dificultad del curso</label>
<input class="form-control" type="text" name="dificultad" id="dificultad">
</div>
<br/>

<div class="form-group">
<label>Imagen del curso</label>
<input type="file" name="imagen" id="imagen">
</div>
<br/>
<br/>
	<div class="form-group">
           <label>Acepta los terminos de creacion de curso</label>
           <label class="checkbox-inline">
           <input type="checkbox" name="terminos" id="terminos">
	       </label>
	</div> 
                            <div>
                            <button type="submit" name= "accion" id= "accion" class="btn btn-default">Vista previa</button>
                            <button type="reset" class="btn btn-default">Deshacer todo</button>
							</div>
                        </form>


				</div>














				<div class="row"></div>
				<!-- /.row -->

			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
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
