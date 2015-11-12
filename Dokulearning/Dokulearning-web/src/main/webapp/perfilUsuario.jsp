<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="shotcut icon" href="fonts/Captura_de_pantallaico_2015-10-08_a_las_17.ico" type="image/x-icon"> -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>iLexion</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<!-- jQuery desplejable-->
<script src="js/jquery.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>


	<!-- Navigation -->


	<div class="container">



		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						perfil <strong>usuario</strong>
					</h2>
					<hr>


					<div>
						<img alt="logo" src="fonts/users_folder_128.png" width="10%">
					</div>


					<div>
						<div class="form-group col-lg-4">
							<label id="lblnick" for="nick">Nick</label> <input type="text"
								class="form-control" name="nick" id="nick" maxlength="8"
								value="${param.nick}" /> <label id="lblnombre" for="nombre">Nombre</label>
							<input type="text" class="form-control" name="nombre" id="nombre"
								maxlength="20" value="${param.nombre}" /> <label
								id="lblapellido1" for="apellido1">Primer apellido</label> <input
								type="text" class="form-control" name="apellido1" id="apellido1"
								maxlength="20" value="${param.apellido1}" /> <label
								id="lblapellido2" for="apellido2">Segundo apellido</label> <input
								type="text" class="form-control" name="apellido2" id="apellido2"
								maxlength="20" value="${param.apellido2}" /> <label
								id="lblcorreo" for="correo">Correo electronico</label> <input
								type="text" class="form-control" name="correo" id="correo"
								maxlength="20" value="${param.correo}" /></br></br>

							<button class="btn btn-default" data-toggle="modal"
								data-toggle="tooltip" data-placement="left"
								title="Cambiar contraseña" data-target="#miDialog">
								<span>Cambiar contraseña</span>
							</button>
							</br></br>
								<a href="formularioCurso.jsp"><button type="button"
								class="btn btn-default">Crear curso</button></a>




						</div>
						<!-- <label id="lblclave1" for="clave1">Contraseña:</label><input type="password" name="clave1" id="clave1" maxlength="20" value="${param.clave1}" /><br /> -->
						<%-- 
	<label id="lblcorreo" for="clave">Correo electronico:</label>
	<input type="text" name="clave" id="clave" maxlength="30"
		value="${param.clave1}" />
	<br /> --%>
						



						<!-- <div class="signupboxt"> -->
						<div class="form-group col-lg-4">


								<label id="lblprecio" for="precio">Precio
								del curso</label> <input type="text" class="form-control" name="precio"
								id="precio" value="${param.precio}" /> <label
								id="lblnombreCurso" for="nombreCurso">Nombre del curso</label> <input
								type="text" class="form-control" name="nombreCurso"
								id="nombreCurso" maxlength="30" value="${param.nombreCurso}" />


							<label id="txtTelefono" for="telefono">Telefono</label> <input
								type="text" class="form-control" name="telefono" id="telefono"
								maxlength="9" value="${param.telefono}" /> <label
								id="txtGenero" for="genero">Genero</label> <input type="text"
								class="form-control" name="genero" id="genero"
								value="${param.genero}" /> <label id="txtCalle" for="calle">Calle</label>
							<input type="text" class="form-control" name="calle" id="calle"
								maxlength="30" value="${param.calle}" /> <label
								id="txtLocalidad" for="localidad">Localidad</label> <input
								type="text" class="form-control" name="localidad" id="localidad"
								maxlength="30" value="${param.localidad}" /> <label
								id="txtCodigoPostal" for="codigopostal">Codigo postal</label> <input
								type="text" class="form-control" name="codigopostal"
								id="codigopostal" maxlength="5" value="${param.codigopostal}" />


							<label id="txtProvincia" for="provincia">Provincia</label> <input
								type="text" class="form-control" name="provincia" id="provincia"
								maxlength="30" value="${param.provincia}" /> <label
								id="txtFormaPago" for="formaPago">Forma de pago</label> <input
								type="text" class="form-control" name="formaPago" id="formaPago"
								value="${param.formaPago}" /> <label id="txtDNI" for="DNI">DNI</label>
							<input type="text" class="form-control" name="DNI" id="DNI"
								value="${param.DNI}" /> 
								
								





						</div>
						
					
					</div>

					<%-- <c:choose>
			<c:when test="${not empty sessionScope.usuario.Matriculacion }">
			
						<label id="txtTelefono" for="telefono">Telefono:</label><input
							type="text" name="telefono" id="telefono" /><br /> <label
							id="txtGenero" for="genero">Genero:</label> <select id="genero"
							name="genero" >
							<option value="">Elija su sexo</option>
							<option value="hombre" ${sessionScope.usuario.Matriculacion.sexo == "hombre" ? 'selected="selected"' : ''}>Hombre</option>
							<option value="mujer" ${sessionScope.usuario.Matriculacion.sexo == "mujer" ? 'selected="selected"' : ''}>Mujer</option>
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
								type="text" name="provincia" id="provincia"
								value="${sessionScope.usuario.Matriculacion.calle}" /><br />

						</fieldset>



						<label id="txtFormaPago" for="formaPago">Forma de pago:</label> <select
							id="formaPago" name="formaPago">
							<option value="">Elija una forma de pago</option>
							<option value="transferencia" ${sessionScope.usuario.Matriculacion.formaPago == "transferencia" ? 'selected="selected"' : ''}>Transferencia</option>
							<option value="tarjeta" ${sessionScope.usuario.Matriculacion.formaPago == "tarjeta" ? 'selected="selected"' : ''}>Tarjeta</option>
							<option value="paypal" ${sessionScope.usuario.Matriculacion.formaPago == "paypal" ? 'selected="selected"' : ''}>Paypal</option>
						</select><br /> <label id="txtImagen" for="fecha">Imagen de Perfil:</label><input
							type="file" name="imagen" id="imagen" /><br /> 
						<label
							id="txtFecha" for="fecha">Fecha de Nacimiento:</label><input
							type="text" name="fecha" id="fecha" /><br /> 
						<label id="txtDNI"
							for="DNI">DNI:</label><input type="text" name="DNI" id="DNI" value="${sessionScope.usuario.Matriculacion.DNI}" /><br />
			</c:when>
		</c:choose> --%>

					<!--  <button type="submit" class="btn btn-primary">Guardar Cambios</button>
	<button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>-->




					<div class="modal fade" id="miDialog" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">
										<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
									</button>
									<h4 class="modal-title" id="myModalLabel">Editar
										contraseña de ${param.nick}</h4>
								</div>
								<div class="modal-body">

									<!---Form Registrado -------------------------->
									<form action="registroWeb" method="post"
										class="form-horizontal" role="form">
										<input type="text" name="distribucion" value="cambiarClave"
											style="display: none">


										<div class="row">
											<div class="form-group col-md-1"></div>
											<div class="form-group col-md-5" id="columnas62">
												<label for="claveActual">Contraseña actual </label> <input
													type="password" class="form-control" id="claveActual"
													name="claveActual">
											</div>

										</div>
										<br>
										<div class="row">
											<div class="form-group col-md-1"></div>
											<div class="form-group col-md-5" id="columnas62">
												<label for="claveNueva">Nueva contraseña </label> <input
													type="password" class="form-control" id="claveNueva"
													name="claveNueva">
											</div>
											<div class="form-group col-md-5">
												<label for="RclaveNueva">Repita la nueva contraseña</label>
												<input type="password" class="form-control" id="RclaveNueva"
													name="RclaveNueva">
											</div>
										</div>
										<br>

										<div class="modal-footer">
											<div>
												<button type="submit" class="btn btn-primary">Guardar
													cambios</button>
												<button type="button" class="btn btn-primary"
													data-dismiss="modal">Cerrar</button>
											</div>
										</div>
									</form>



								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>