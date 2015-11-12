
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
	<jsp:include page="header.jsp"></jsp:include>


	<div class="container">

		<!-- Page Heading -->
		<div class="row">
			<div class="box">
				<!-- /.row -->
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						matriculacion de <strong>curso</strong>
					</h2>
					<hr>


					<ul id="ulErroresEnPagina"></ul>

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




					<div style="margin: 0px 0px 0px 200px">
						<form id="formularioMat" action="controlMatriculacion"
							method="post" enctype="multipart/form-data">
							<input type="text" name="distribucionMatriculacion"
								value="crearMatriculacion" style="display: none" />

							<%-- 
						<label id="lblclave1" for="clave1">Correo electronico:</label><input
							type="text" name="clave1" id="clave1" maxlength="30"
							value="${sparam.clave1}"/><br />
							
							<label id="lblcorreoo" for="correoo">Correo electronico:</label><input
							type="text" name="correoo" id="correoo" maxlength="30"
							value="${sparam.correo}"/><br />
							<br />
							<br />
							<br />
							<br />
 --%>


							<%-- <label id="lblnick" for="nick">Nick:</label><input type="text"
							name="nick" id="nick" maxlength="8" value="${param.nick}"
							readonly /><br /> <label id="lblnombre" for="nombre">Nombre:</label><input
							type="text" name="nombre" id="nombre" maxlength="20"
							value="${param.nombre}" readonly /><br /> <label
							id="lblapellido1" for="apellido1">Primer apellido:</label><input
							type="text" name="apellido1" id="apellido1" maxlength="20"
							value="${param.apellido1}" readonly /><br /> <label
							id="lblapellido2" for="apellido2">Segundo apellido:</label><input
							type="text" name="apellido2" id="apellido2" maxlength="20"
							value="${sparam.apellido2}" readonly /><br /> <label
							id="lblcorreo" for="correo">Correo electronico:</label><input
							type="text" name="correo" id="correo" maxlength="30"
							value="${sparam.correo}" readonly /><br />  --%>
							<div class="form-group col-lg-4">

								<label id="lblprecio" for="precio">Precio</label> <input
									type="text" class="form-control" name="precio" id="precio"
									maxlength="8" readonly value="${param.precio}" /><br />
								<label id="txtTelefono" for="telefono">Telefono</label> <input
									type="text" class="form-control" name="telefono" id="telefono"
									maxlength="9" /> <br /> <label id="txtGenero" for="genero">Genero</label>
								<select id="genero" name="genero" class="form-control">
									<option value="">Elija su sexo</option>
									<option value="hombre">Hombre</option>
									<option value="mujer">Mujer</option>
								</select><br />
								<label id="txtDNI" for="DNI">DNI:</label><input type="text"
									class="form-control" name="DNI" id="DNI" maxlength="10" /><br />

								
								 <label id="txtFormaPago" for="formaPago">Forma
									de pago</label> <select class="form-control" id="formaPago"
									name="formaPago">
									<option value="">Elija una forma de pago</option>
									<option value="transferencia">Transferencia</option>
									<option value="tarjeta">Tarjeta</option>
									<option value="paypal">Paypal</option>
								</select><br /> <label id="txtImagen" for="fecha">Imagen de
									Perfil</label><input type="file" name="imagen" id="imagen" size="60" /><br />


								<!--  <label
							id="txtFecha" for="fecha">Fecha de Nacimiento:</label><input
							type="text" name="fecha" id="fecha" /><br />  -->


								

							</div>
							<div class="form-group col-lg-1"></div>

							<div class="form-group col-lg-4">

								<label id="lblnombreCurso" for="nombreCurso">Nombre del
									curso</label> <input type="text" class="form-control"
									name="nombreCurso" id="nombreCurso" maxlength="30" readonly
									value="${param.nombreCurso}" /><br />
								<label id="txtCalle" for="calle">Calle</label><input type="text"
									class="form-control" name="calle" id="calle" maxlength="50" /><br />


								<label id="txtLocalidad" for="localidad">Localidad</label><input
									type="text" class="form-control" name="localidad"
									id="localidad" maxlength="30" /><br /> <label
									id="txtCodigoPostal" for="codigopostal">Codigo Postal</label><input
									type="text" class="form-control" name="codigopostal"
									id="codigopostal" maxlength="5" /><br /> <label
									id="txtProvincia" for="provincia">Provincia</label><input
									type="text" class="form-control" name="provincia"
									id="provincia" maxlength="30" /><br />
									<label id="txtAceptar" for="aceptar">Acepto los
									terminos&nbsp;&nbsp; </label><input type="checkbox" value="SI" name="aceptar"
									id="aceptar" /><br />
									
									</div>
									<div class="form-group col-lg-12" style="margin: 0px 0px 0px 300px">
									
									 <input id="btnEnviar"
									type="button" class="btn btn-default" value="Enviar" />
						</div>
						</form>
						</div>
					</div>
				</div>
			</div>
		</div>


















	<div class="row"></div>
	<!-- /.row -->

	</div>
	<!-- /.container-fluid -->


	<!-- <div id="dialogo" title="Hay Errores en el Formulario">
		<p>Por favor, corrija los siguientes errores y reenvíe el
			formulario:</p>
		<ul id="ulErrores"></ul>
	</div> -->
	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
