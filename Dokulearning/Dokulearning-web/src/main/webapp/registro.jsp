<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro usuario</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">



<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<script src="js/jquery.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="js/registro.js"></script>
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
						registro de <strong>usuario</strong>
					</h2>
					<hr>


					<ul id="ulErroresEnPagina"></ul>

					<c:choose>
						<c:when test="${not empty mensaje }">
							<p class="error">${mensaje }</p>
						</c:when>
					</c:choose>

					<div style="margin: 0px 0px 0px 200px">
						<form onSubmit="return pwdIguales(this)" id="formularioMat"
							action="registroWeb" method="post" >
							<input type="text" name="distribucion" value="crearRegistrado"
								style="display: none" />                  


							<div class="form-group col-lg-4">

								<label id="txtNickReg" for="nick">Nick *</label> <input
									type="text" class="form-control" name="nick" id="nick"
									maxlength="8" placeholder="Ej.: Johny90"> <br /> <label
									id="txtApellido1Reg" for="apellido1">Primer apellido *</label> <input
									type="text" class="form-control" name="apellido1"
									id="apellido1" maxlength="30" placeholder="Ej.: Perez">
								<br /> <label id="txtCorreoReg" for="correoR">Correo *</label> <input
									type="text" class="form-control" name="correoR" id="correoR"
									maxlength="30" placeholder="Ej.:algo@algo.es"><br /> <label
									id="txtclave1Reg" for="clave1">Contraseña *</label> <input
									type="password" class="form-control" name="clave1" id="clave"
									maxlength="30" placeholder="Ej.: contraseniahipersegura">

									

							</div>

							<div class="form-group col-lg-1"></div>

							<div class="form-group col-lg-4">


								<label id="txtNombreReg" for="nombre">Nombre *</label> <input
									type="text" class="form-control" name="nombre" id="nombre"
									maxlength="30" placeholder="Ej.: Juan"> <br /> <label
									id="txtApellido2Reg" for="apellido2">Segundo apellido</label> <input
									type="text" class="form-control" name="apellido2"
									id="apellido2" maxlength="30" placeholder="Ej.: Osborne">
								<br /> <label id="txtFechaReg" for="fechanac">Fecha de
									nacimiento</label> <input type="text" class="form-control"
									name="fechanac" id="fechanac" maxlength="10"
									placeholder="Ej.:DD/MM/AAAA"> <br /> <label
									id="txtclave2Reg" for="clave2">Repita la contraseña *</label> <input
									type="password" class="form-control" name="clave2" id="clave2"
									maxlength="30" placeholder="Ej.: contraseniahipersegura">



							</div>

							<div class="form-group col-lg-12"
								style="margin: 20px 0px 0px 190px">
							
								<input type="checkbox" id="aceptarterm" name="terminos" ><label id="txtterminos"
									for="terminos"> &nbsp; &nbsp;Acepto <a
									data-toggle="modal" data-target="#ModalRegistro">t&eacute;rminos
										y condiciones</a> *
								</label> 
								
								
								
								
								<div class="modal fade" id="ModalRegistro" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="container">

					<div id="loginbox" style="margin-top: 50px;"
						class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
						<div class="panel dialog-info">
							<div class="cabeceraDialog">
								<button type="button" class="close" data-dismiss="modal">
									<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
								</button>
								<div class="dialog-title">Terminos y condiciones de uso</div>
							</div>
							<div class="modal-body">
								<div style="height: 450px; overflow: scroll">
									<p>Las presentes condiciones generales de uso del portal
										regulan el acceso y la utilización del portal, incluyendo los
										contenidos y los servicios puestos a disposición de los
										usuarios en y/o a través del portal, bien por el portal, bien
										por sus usuarios, bien por terceros. No obstante, el acceso y
										la utilización de ciertos contenidos y/o servicios puede
										encontrarse sometido a determinadas condiciones específicas.</p>
									<p>La empresa se reserva la facultad de modificar en
										cualquier momento las condiciones generales de uso del portal.
										En todo caso, se recomienda que consulte periódicamente los
										presentes términos de uso del portal, ya que pueden ser
										modificados.</p>
									<p>El usuario deberá respetar en todo momento los términos
										y condiciones establecidos en las presentes condiciones
										generales de uso del portal. De forma expresa el usuario
										manifiesta que utilizará el portal de forma diligente y
										asumiendo cualquier responsabilidad que pudiera derivarse del
										incumplimiento de las normas. Así mismo, el usuario no podrá
										utilizar el portal para transmitir, almacenar, divulgar
										promover o distribuir datos o contenidos que sean portadores
										de virus o cualquier otro código informático, archivos o
										programas diseñados para interrumpir, destruir o perjudicar el
										funcionamiento de cualquier programa o equipo informático o de
										telecomunicaciones.</p>
								</div>
								<br>
										<button type="button" class="btn boton-secundario"
													data-dismiss="modal">Cerrar</button>
							</div>

						</div>

					</div>

				</div>

			</div>
								
								
								
								
								
 <br /><br />
								<input id="btnEnviar" type="submit" class="btn btn-default"
									value="Registrarse" />
									
									<a type="button" class="btn btn-default" style="margin: 0px 0px 0px 30px" href="index.jsp">
															Cancelar</a>
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