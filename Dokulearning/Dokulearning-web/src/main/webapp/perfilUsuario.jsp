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
<link href="css/ventanaDialog.css" rel="stylesheet">

<script src="js/ValidacionPwd.js"></script>
<script src="js/validarEditarPerfil.js"></script>

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

	<c:set var="registrado" scope="session" value="${perfilRegistrado}"></c:set>
	<!-- Navigation -->
<c:set var="estRol" scope="session" value="${estadoRol}"></c:set>

	<div class="container">



		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						perfil de &nbsp;&nbsp;<strong>${registrado.nick}</strong>
					</h2>
					<hr>


					<div class="form-group col-lg-4">
						<img alt="logo" src="fonts/users_folder_128.png" width="50%">


						</br> </br>

						<button class="btn btn-default" data-toggle="modal"
							data-toggle="tooltip" data-placement="left" title="editar perfil"
							data-target="#miDialog">
							<span>Cambiar contraseña</span>
						</button>
						</br> </br>


						<button class="btn btn-default" data-toggle="modal"
							data-toggle="tooltip" data-placement="left"
							title="Cambiar contraseña" data-target="#editPerfil">
							<span>Editar Perfil</span>
						</button>

						</br> </br> <a href="Cursos?accion=crearCurso&estado=${registrado.nick}"><button
								type="button" class="btn btn-default">Crear curso</button></a> </br> </br>
					<c:if test="${estadoRol!=null}">
						<a href="controlMatriculacion?accion=${estRol}&estado=misCursos"><button class="btn btn-default" title="mis cursos">Mis
							Cursos</button></a>						
					</c:if>

					</div>


					<div>
						<div class="form-group col-lg-4">


							<div class="form-group">
								<label>Nick:&nbsp;&nbsp;</label>${registrado.nick}</div>
							<div class="form-group">
								<label>Nombre:&nbsp;&nbsp;</label>${registrado.nombre}</div>
							<div class="form-group">
								<label>Primer apellido:&nbsp;&nbsp;</label>${registrado.apellido1}</div>
							<div class="form-group">
								<label>Segundo apellido:&nbsp;&nbsp;</label>${registrado.apellido2}</div>
							<div class="form-group">
								<label>Correo electronico:&nbsp;&nbsp;</label>${registrado.correo}</div>
							<div class="form-group">
								<label>Fecha de nacimiento:&nbsp;&nbsp;</label>${registrado.fechanac}</div>
							<div class="form-group">
								<label>Descripcion:&nbsp;&nbsp;</label>${registrado.descripcion}</div>
							<div class="form-group">
								<label>Aficiones:&nbsp;&nbsp;</label>${registrado.aficiones}</div>
							<div class="form-group">
								<label>Rol:&nbsp;&nbsp;</label>${registrado.rol}</div>

						</div>

						<div class="signupboxt">
							<div class="form-group col-lg-4">


								<label id="lblprecio" for="precio">Precio del curso</label> <input
									type="text" class="form-control" name="precio" id="precio"
									value="${param.precio}" /> <label id="lblnombreCurso"
									for="nombreCurso">Nombre del curso</label> <input type="text"
									class="form-control" name="nombreCurso" id="nombreCurso"
									maxlength="30" value="${param.nombreCurso}" /> <label
									id="txtTelefono" for="telefono">Telefono</label> <input
									type="text" class="form-control" name="telefono" id="telefono"
									maxlength="9" value="${param.telefono}" /> <label
									id="txtGenero" for="genero">Genero</label> <input type="text"
									class="form-control" name="genero" id="genero"
									value="${param.genero}" /> <label id="txtCalle" for="calle">Calle</label>
								<input type="text" class="form-control" name="calle" id="calle"
									maxlength="30" value="${param.calle}" /> <label
									id="txtLocalidad" for="localidad">Localidad</label> <input
									type="text" class="form-control" name="localidad"
									id="localidad" maxlength="30" value="${param.localidad}" /> <label
									id="txtCodigoPostal" for="codigopostal">Codigo postal</label> <input
									type="text" class="form-control" name="codigopostal"
									id="codigopostal" maxlength="5" value="${param.codigopostal}" />


								<label id="txtProvincia" for="provincia">Provincia</label> <input
									type="text" class="form-control" name="provincia"
									id="provincia" maxlength="30" value="${param.provincia}" /> <label
									id="txtFormaPago" for="formaPago">Forma de pago</label> <input
									type="text" class="form-control" name="formaPago"
									id="formaPago" value="${param.formaPago}" /> <label
									id="txtDNI" for="DNI">DNI</label> <input type="text"
									class="form-control" name="DNI" id="DNI" value="${param.DNI}" />







							</div>

						</div>
					</div>




					<!-- DIALOG CAMBIO DE CONTRASEÑA -->




					<div class="modal fade" id="miDialog" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="container">
							<div id="loginbox" style="margin-top: 50px;"
								class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">

								<div class="panel dialog-info">

									<%-- 
								<c:when test="${not empty mensaje }">
		<p class="error">${mensaje }</p>
	</c:when>
								 --%>

									<div class="cabeceraDialog">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
										</button>
										<div class="dialog-title">Cambio de contraseña de
											${registrado.nick}</div>
									</div>
									<div class="modal-body">

										<!---Form Registrado ------------------------
										
										<form onSubmit="return pwdIguales(this)" id="formularioMat"
							action="registroWeb" method="post" >-->

										<form onSubmit="return validarPassword(this)"
											action="registroWeb" method="post" class="form-horizontal"
											role="form">
											<input type="text" name="distribucion" value="cambiarClave"
												style="display: none">



											<div class="row">





												<div class="form-group col-md-12"></div>
												<div class="form-group col-md-6">
													<label for="lblClaveActual">Contraseña actual </label> <input
														type="password" class="form-control" id="claveActual"
														name="claveActual">
												</div>

												<br>
												<div class="form-group col-md-12"></div>

												<div class="form-group col-md-6">
													<label for="lblClaveNueva">Nueva contraseña </label> <input
														type="password" class="form-control" id="claveNueva"
														name="claveNueva">
												</div>
												<div class="form-group col-md-1"></div>
												<div class="form-group col-md-1"></div>


												<div class="form-group col-md-6">
													<label for="lblRClaveNueva">Repita la nueva
														contraseña</label> <input type="password" class="form-control"
														id="RclaveNueva" name="RclaveNueva">
												</div>


												<div class="form-group col-lg-12 botones">


													<button type="submit" class="btn boton-principal">Guardar
														cambios</button>
													<button type="button" style="margin-left: 8px"
														class="btn boton-secundario" data-dismiss="modal">Cerrar</button>
												</div>
											</div>
										</form>



									</div>

								</div>
							</div>
						</div>
					</div>



					<!-- DIALOG editar perfil -->

					<div class="modal fade" id="editPerfil" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="container">
							<div id="loginbox" style="margin-top: 50px;"
								class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">

								<div class="panel dialog-info">
									<div class="cabeceraDialog">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
										</button>
										<div class="dialog-title">Editar perfil</div>
									</div>
									<div class="modal-body">

										<!---Form Registrado -------------------------->
										<form action="registroWeb" onSubmit="return validarPerfil(this)" method="post"
											class="form-horizontal" role="form">
											<input type="text" name="distribucion" value="editarPerfil"
												style="display: none">


											<div class="row">
												<div class="form-group col-md-6">
													<div>
														<label for="nickActual" id="labelNick">Nick: </label> <input type="text"
															class="form-control" id="nickActual" name="nickActual"
															value="${registrado.nick}">

													</div>
													<div>
														<label for="nombreActual" id="labelNombre"><br>Nombre: </label> <input
															type="text" class="form-control" id="nombreActual"
															name="nombreActual" value="${registrado.nombre}">

													</div>
													<div>
														<label for="correoActual" id="labelCorreo"><br>Correo
															electronico: </label> <input type="text" class="form-control"
															id="correoActual" name="correoActual"
															value="${registrado.correo}">

													</div>

												</div>

												<div class="form-group col-md-1"></div>
												<div class="form-group col-md-1"></div>

												<div class="form-group col-md-6">
													<div>
														<label for="apellido1Actual" id="labelApell">Primer apellido: </label> <input
															type="text" class="form-control" id="apellido1Actual"
															name="apellido1Actual" value="${registrado.apellido1}">
													</div>

													<div>
														<label for="apellido2Actual"><br>Segundo
															apellido: </label> <input type="text" class="form-control"
															id="apellido2Actual" name="apellido2Actual"
															value="${registrado.apellido2}">
													</div>

													<div>
														<label for="descripcionActual"><br>Descripcion:
														</label> <input type="text" class="form-control"
															id="descripcionActual" name="descripcionActual"
															value="${registrado.descripcion}">
													</div>

													<div>
														<label for="aficionesActual"><br>Aficiones: </label>
														<input type="text" class="form-control"
															id="aficionesActual" name="aficionesActual"
															value="${registrado.aficiones}">
													</div>

												</div>
												<div class="form-group col-lg-12 botones">
													<div>

														<button type="submit" class="btn boton-principal">Guardar
															cambios</button>
														<button type="button" style="margin-left: 8px"
															class="btn boton-secundario" data-dismiss="modal">Cerrar</button>
													</div>
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
	</div>



	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
