<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Matriculacion del curso</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<script src="js/jquery.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="js/matriculacion.js"></script>
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
			<a class="navbar-brand" href="index.html">MATRICULACION DE CURSO</a>
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
				<div class="row"></div>
				<!-- /.row -->










				<div style="margin: 100px 0px 100px 0px">

					<ul id="ulErroresEnPagina"></ul>

					<form id="formularioMat" action="controlMatriculacion"
						method="post">

						<c:choose>
							<c:when test="${not empty mensaje }">
								<p class="error">${mensaje }</p>
							</c:when>
						</c:choose>


						<!-- <label for="nick">Nick:</label><input type="text" name="nick" id="nick"/><br/>
<label for="nombre">Nombre:</label><input type="text" name="nombre" id="nombre" /><br/>
<label for="apellido1">Primer apellido:</label><input type="text" name="apellido1" id="apellido1" /><br/>
<label for="apellido2">Segundo apellido:</label><input type="text" name="apellido2" id="apellido2" /><br/>
<label for="correo">Correo electronico:</label><input type="text" name="correo" id="correa" /><br/>
<label for="clave1">Contraseña:</label><input type="password" name="clave1" id="clave1" /><br/>
<label for="clave2">Repita su contraseña:</label><input type="password" name="clave2" id="clave2" /><br/>
<label for="terminos">Acepto los terminos:</label><input type="checkbox" value="SI" name="terminos" id="terminos" /><br/> -->

						<label id="txtTelefono" for="telefono">Telefono:</label><input
							type="text" name="telefono" id="telefono" /><br /> <label
							id="txtGenero" for="genero">Genero:</label> <select id="genero"
							name="genero">
							<option value="">Elija su sexo</option>
							<option value="hombre">Hombre</option>
							<option value="mujer">Mujer</option>
						</select><br />

						<fieldset>
							<legend>Direccion</legend>
							<label id="txtCalle" for="calle">Calle:</label><input type="text"
								name="calle" id="calle" /><br /> <label id="txtLocalidad"
								for="localidad">localidad:</label><input type="text"
								name="localidad" id="localidad" /><br /> <label
								id="txtCodigoPostal" for="codigopostal">Codigo Postal:</label><input
								type="text" name="codigopostal" id="codigopostal" /><br /> <label
								id="txtProvincia" for="provincia">Provincia:</label><input
								type="text" name="provincia" id="provincia" /><br />

						</fieldset>



						<label id="txtFormaPago" for="formaPago">Forma de pago:</label> <select
							id="formaPago" name="formaPago">
							<option value="">Elija una forma de pago</option>
							<option value="transferencia">Transferencia</option>
							<option value="tarjeta">Tarjeta</option>
							<option value="paypal">Paypal</option>
						</select><br /> <label id="txtImagen" for="fecha">Imagen de Perfil:</label><input
							type="file" name="imagen" id="imagen" /><br /> <label
							id="txtFecha" for="fecha">Fecha de Nacimiento:</label><input
							type="text" name="fecha" id="fecha" /><br /> <label id="txtDNI"
							for="DNI">DNI:</label><input type="text" name="DNI" id="DNI" /><br />

						<label id="txtAceptar" for="aceptar">Acepto los terminos:</label><input
							type="checkbox" value="SI" name="aceptar" id="aceptar" /><br />

						<input id="btnEnviar" type="button" value="Enviar" />

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