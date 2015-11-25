<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<c:set var="cursoS" scope="session" value="${perfilCurso}"></c:set>
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





				



					<div style="margin: 0px 0px 0px 200px">
						<form onSubmit="return comprobarMatriculacion(this)" id="formularioMat" action="controlMatriculacion"
							method="post" enctype="multipart/form-data">
							<input type="text" name="distribucionMatriculacion"
								value="crearMatriculacion" style="display: none" />

							
							<div class="form-group col-lg-4">

								<label id="lblprecio" for="precio">Precio</label> <input
									type="text" class="form-control" name="precio" id="precio"
									maxlength="8" readonly value="${cursoS.precio}€" /><br />
								
								
								
								<label id="txtTelefono" for="telefono">Telefono *</label> <input
									type="text" class="form-control" name="telefono" id="telefono" 
									maxlength="9" placeholder="Ej.: 123456789"/> <br />
									
									
									
									 <label id="txtGenero" for="genero">Genero *</label>
								<select id="genero" name="genero" class="form-control">
									<option value="">Elija su sexo</option>
									<option value="Hombre">Hombre</option>
									<option value="Mujer">Mujer</option>
								</select><br />
								<label id="txtDNI" for="DNI">DNI *</label><input type="text"
									           placeholder="Ej.: 12345678G / sin guion" class="form-control" name="DNI" id="DNI" maxlength="10" /><br />

								
								 <label id="txtFormaPago" for="formaPago">Forma
									de pago *</label> <select class="form-control" id="formaPago"
									name="formaPago">
									<option value="">Elija una forma de pago</option>
									<option value="Transferencia">Transferencia</option>
									<option value="Tarjeta">Tarjeta</option>
									<option value="Paypal">Paypal</option>
								</select><br /> <label id="txtImagen" for="fecha">Imagen de
									Perfil</label><input type="file" name="imagen" id="imagen" size="60" /><br />




								

							</div>
							<div class="form-group col-lg-1"></div>

							<div class="form-group col-lg-4">

								<label id="lblnombreCurso" for="nombreCurso">Nombre del
									curso</label> <input type="text" class="form-control"
									name="nombreCurso" id="nombreCurso" maxlength="30" readonly
									value="${cursoS.nom}" /><br />
								<label id="txtCalle" for="calle">Calle *</label><input type="text"
									placeholder="Ej.: avenida de la Universidad" class="form-control" name="calle" id="calle" maxlength="50" /><br />


								<label id="txtLocalidad" for="localidad">Localidad *</label><input
									type="text" placeholder="Ej.: Colmenarejo" class="form-control" name="localidad" 
									id="localidad" maxlength="30" /><br /> <label
									id="txtCodigoPostal" for="codigopostal">Codigo Postal *</label><input
									type="text" placeholder="Ej.: 12349" class="form-control" name="codigopostal" 
									id="codigopostal" maxlength="5" /><br /> <label
									id="txtProvincia" for="provincia">Provincia *</label><input
									type="text" placeholder="Ej.: Madrid" class="form-control" name="provincia"
									id="provincia" maxlength="30" /><br />
									
									
									
									<label id="txtAceptar" for="aceptar">Acepto los
									terminos *&nbsp;&nbsp; </label><input type="checkbox" value="SI" name="aceptar"
									id="aceptar" /><br />
									
									</div>
									<div class="form-group col-lg-12" style="margin: 0px 0px 0px 300px">
									
									 <input id="btnEnviar"
									type="submit" class="btn btn-default" value="Enviar" />
						</div>
						</form>
						</div>
					</div>
				</div>
			</div>
		</div>


















	
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
