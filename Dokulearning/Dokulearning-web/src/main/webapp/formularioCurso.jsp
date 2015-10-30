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

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">iLexion</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
					class="caret"></b></a>
				<ul class="dropdown-menu message-dropdown">
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="http://placehold.it/50x50" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>John Smith</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur...</p>
								</div>
							</div>
					</a></li>
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="http://placehold.it/50x50" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>John Smith</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur...</p>
								</div>
							</div>
					</a></li>
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="http://placehold.it/50x50" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>John Smith</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur...</p>
								</div>
							</div>
					</a></li>
					<li class="message-footer"><a href="#">Read All New
							Messages</a></li>
				</ul></li>

			<!--campanita-->
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-bell"></i> <b
					class="caret"></b></a>
				<ul class="dropdown-menu alert-dropdown">
					<li><a href="#">Alert Name <span
							class="label label-default">Alert Badge</span></a></li>
					<li class="divider"></li>
					<li><a href="#">View All</a></li>
				</ul></li>


			<!-- usuario log -->
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a></li>
					<li><a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
					</li>
					<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
					</li>
					<li class="divider"></li>
					<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Log
							Out</a></li>
				</ul></li>
		</ul>
		<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav side-nav">
				<li><a href="index.html"><i class="fa fa-fw fa-dashboard"></i>
						Dashboard</a></li>
				<li><a href="javascript:;" data-toggle="collapse"
					data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i>
						Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo" class="collapse">
						<li><a href="#">Dropdown Item</a></li>
						<li><a href="#">Dropdown Item</a></li>
					</ul></li>

			</ul>
		</div>
		<!-- /.navbar-collapse --> </nav>

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
