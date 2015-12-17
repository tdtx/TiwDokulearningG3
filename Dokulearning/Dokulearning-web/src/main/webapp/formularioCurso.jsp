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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

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
<c:set var="miperfil" scope="session" value="${cursos}"></c:set>

	<jsp:include page="header.jsp"></jsp:include>


	<div class="container">

		<!-- Page Heading -->
		<div class="row">
			<div class="box">
				<!-- /.row -->
				<hr>
				<h2 class="intro-text text-center">
					crear <strong>curso</strong>
				</h2>
				<hr>

				<ul id="ulErroresEnPagina"></ul>

				<form onSubmit="return validarCurso(this)" role="form"
					action="Cursos" method="post">
					<input type="text" name="action" value="rellenar_formulario"
						style="display: none"> <br />


					<div style="margin: 0px 0px 0px 200px">

						<div class="form-group col-lg-4">



							<label id="labelNombre" for="nom">Nombre de curso </label> <input
								class="form-control" type="text" id="nom" name="nom" maxlength="30"
								placeholder="Ej.: Matematicas" /><br /> 
								
							<label
								id="labelDescripcion">Descripcion del curso</label>
							<textarea class="form-control" rows="3" name="descripcion" maxlength="200"
								id="descripcion" placeholder="Ej.: bases de datos"></textarea>
							<br />
							
							<label id="labelListado">Listado del contenido del curso</label>
							<textarea class="form-control" rows="3" name="temario" maxlength="200"
								id="temario" placeholder="Ej.: titulos de los temas"></textarea>
							<br /> 
							
							<label id="labelPrecio">Precio</label> <input class="form-control" type="text"
								name="precio"  maxlength="4" id="precio" placeholder="Ej.: 300"> <br />
							
							
							<label>Imagen del curso</label> <input type="file"
								name="imagen" id="imagen">


						</div>
						<div class="form-group col-lg-1"></div>

						<div class="form-group col-lg-4">

							
							<label id="labelNumHoras">Numero de horas</label> <input class="form-control"
								type="text" name="horas" id="horas"
								maxlength="4" placeholder="Ej.: 0053 (cuatro digitos)"> <br /> 
								
							<label id="labelNombreProf">Nombre
								del profesor</label> <input class="form-control" type="text"
								name="profesor" id="profesor" readonly value="${miperfil.nick}"> <br />
				
							
							<label id="labelFechaIni">Fecha inicio del curso</label> <input class="form-control"
								type="text" name="fInicio" id="fInicio" maxlength="10"
								placeholder="Ej: 20/12/2015"> <br /> 
								
							<label id="labelFechaFin">Fecha
								fin del curso</label> <input class="form-control" type="text"
								name="f_fin" id="fFin" maxlength="10" placeholder="Ej: 24/12/2015"> <br />
							
							
							<label id="labelCategoria">Categoria del curso</label> <input class="form-control"
								type="text" name="categoria" id="categoria" maxlength="40"
								placeholder="Rama del curso">
							<br />
							<label id="txtDif" for="dificultad">Dificultad del curso</label>
							<select id="dificultad" name="dificultad" class="form-control">
								<option value="">--Seleccione--</option>
								<option value="Baja">Baja</option>
								<option value="Media">Media</option>
								<option value="Alta">Alta</option>

							</select> <br /> <input type="checkbox" name="terminos" id="terminos"><label id="lblTerminos">
								&nbsp; &nbsp;Acepto los <a data-toggle="modal"
								data-target="#Modal">t&eacute;rminos</a>
							</label>
							<!-- Trigger the modal with a button -->

							<div class="modal fade" id="Modal" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="container">

									<!-- Modal content-->
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
												<div style="height: 400px; overflow: scroll">
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

						<div class="form-group col-lg-12"
							style="margin: 0px 0px 0px 200px">
							<button type="submit" name="accion" id="accion"
								class="btn btn-default">Vista previa</button>
							<button type="reset" class="btn btn-default">Deshacer
								todo</button>
						</div>

					</div>
				</form>


			</div>
		</div>

	</div>

	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
