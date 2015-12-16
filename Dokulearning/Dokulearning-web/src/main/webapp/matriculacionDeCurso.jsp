<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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
						<form onSubmit="return comprobarMatriculacion(this)"
							id="formularioMat" action="controlMatriculacion" method="post"
							enctype="multipart/form-data">
							<input type="text" name="distribucionMatriculacion"
								value="crearMatriculacion" style="display: none" />


							<div class="form-group col-lg-4">

								<label id="lblprecio" for="precio">Precio en €</label> <input
									type="text" class="form-control" name="precio" id="precio"
									maxlength="8" readonly value="${cursoS.precio}" /><br /> <label
									id="txtTelefono" for="telefono">Telefono *</label> <input
									type="text" class="form-control" name="telefono" id="telefono"
									maxlength="9" placeholder="Ej.: 123456789" /> <br /> <label
									id="txtGenero" for="genero">Genero *</label> <select
									id="genero" name="genero" class="form-control">
									<option value="">Elija su sexo</option>
									<option value="Hombre">Hombre</option>
									<option value="Mujer">Mujer</option>
								</select><br /> <label id="txtDNI" for="DNI">DNI *</label><input
									type="text" placeholder="Ej.: 12345678G / sin guion"
									class="form-control" name="DNI" id="DNI" maxlength="9" /><br />


					
								<br /> <label id="txtImagen" for="fecha">Imagen de
									Perfil</label><input type="file" name="imagen" id="imagen" size="60" /><br />






							</div>
							<div class="form-group col-lg-1"></div>

							<div class="form-group col-lg-4">

								<label id="lblnombreCurso" for="nombreCurso">Nombre del
									curso</label> <input type="text" class="form-control"
									name="nombreCurso" id="nombreCurso" maxlength="30" readonly
									value="${cursoS.titulo}" /><br /> <label id="txtCalle"
									for="calle">Calle *</label><input type="text"
									placeholder="Ej.: avenida de la Universidad"
									class="form-control" name="calle" id="calle" maxlength="50" /><br />


								<label id="txtLocalidad" for="localidad">Localidad *</label><input
									type="text" placeholder="Ej.: Colmenarejo" class="form-control"
									name="localidad" id="localidad" maxlength="30" /><br /> <label
									id="txtCodigoPostal" for="codigopostal">Codigo Postal *</label><input
									type="text" placeholder="Ej.: 12349" class="form-control"
									name="codigopostal" id="codigopostal" maxlength="5" /><br />
								<label id="txtProvincia" for="provincia">Provincia *</label><input
									type="text" placeholder="Ej.: Madrid" class="form-control"
									name="provincia" id="provincia" maxlength="30" /><br /> <input
									type="checkbox" id="aceptarterm" value="SI" name="aceptarterm"><label
									id="txtAceptar" for="aceptarterm"> &nbsp; &nbsp;Acepto
									<a data-toggle="modal" data-target="#ModalMatric">t&eacute;rminos
										y condiciones</a> *
								</label>



								<div class="modal fade" id="ModalMatric" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="container">

										<div id="loginbox" style="margin-top: 50px;"
											class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
											<div class="panel dialog-info">
												<div class="cabeceraDialog">
													<button type="button" class="close" data-dismiss="modal">
														<span aria-hidden="true">&times;</span><span
															class="sr-only">Close</span>
													</button>
													<div class="dialog-title">Terminos y condiciones de
														uso</div>
												</div>
												<div class="modal-body">
													<div style="height: 450px; overflow: scroll">
														<p>Las presentes condiciones generales de uso del
															portal regulan el acceso y la utilización del portal,
															incluyendo los contenidos y los servicios puestos a
															disposición de los usuarios en y/o a través del portal,
															bien por el portal, bien por sus usuarios, bien por
															terceros. No obstante, el acceso y la utilización de
															ciertos contenidos y/o servicios puede encontrarse
															sometido a determinadas condiciones específicas.</p>
														<p>La empresa se reserva la facultad de modificar en
															cualquier momento las condiciones generales de uso del
															portal. En todo caso, se recomienda que consulte
															periódicamente los presentes términos de uso del portal,
															ya que pueden ser modificados.</p>
														<p>El usuario deberá respetar en todo momento los
															términos y condiciones establecidos en las presentes
															condiciones generales de uso del portal. De forma expresa
															el usuario manifiesta que utilizará el portal de forma
															diligente y asumiendo cualquier responsabilidad que
															pudiera derivarse del incumplimiento de las normas. Así
															mismo, el usuario no podrá utilizar el portal para
															transmitir, almacenar, divulgar promover o distribuir
															datos o contenidos que sean portadores de virus o
															cualquier otro código informático, archivos o programas
															diseñados para interrumpir, destruir o perjudicar el
															funcionamiento de cualquier programa o equipo informático
															o de telecomunicaciones.</p>
													</div>
													<br>
													<button type="button" class="btn boton-secundario"
														data-dismiss="modal">Cerrar</button>
												</div>

											</div>

										</div>

									</div>

								</div>





							</div>
				<div class="form-group col-lg-12" style="text-align: center">
			
								<input id="btnEnviar" type="submit" class="btn btn-default"
									value="Enviar" />
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
