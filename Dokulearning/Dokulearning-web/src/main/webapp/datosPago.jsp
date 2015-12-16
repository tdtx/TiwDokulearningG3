<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Datos de pago</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/migasPan.css" rel="stylesheet">


<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<script src="js/jquery.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="js/validarDatosPago.js"></script>


<style type="text/css">
a:link {
	text-decoration: none;
	color: #DDB888;
	
} /* Link no visitado*/
a:visited {
	text-decoration: none;
	color: #DDB888;
	
} /*Link visitado*/
a:active {
	text-decoration: none;
	color: #DDB888;
	
} /*Link activo*/
a:hover {
	text-decoration: none;
	color: #DDB888;

} /*Mause sobre el link*/
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

					<ol class="breadcrumb" style="background-color: #F9F4EF">
						<li><a href="matriculacionDeCurso.jsp" class="letras">Matriculacion</a></li>
						<li class="active" style="text-decoration: bold; font-size: 18px">Datos de pago</li>
						<li class="desactivado"  style="font-size: 18px" >Resumen</li>
					</ol>
					<hr>
					<h2 class="intro-text text-center">
						datos de <strong>pago</strong>
					</h2>
					<hr>


					<ul id="ulErroresEnPagina"></ul>

					<c:choose>
						<c:when test="${not empty mensaje }">
							<p class="error">${mensaje }</p>
						</c:when>
					</c:choose>

					<div style="margin: 0px 0px 0px 200px">
						<form onSubmit="return validacionDatosPago(this)"
							id="formularioPago" action="controlMatriculacion" method="post">
							<input type="text" name="distribucionMatriculacion"
								value="pagar" style="display: none" />


							<div class="form-group col-lg-4">
								<label id="lblnickUsuario" for="nickUsuario">Nick de
									usuario</label> <input type="text" class="form-control"
									name="nickUsuario" id="nickUsuario" readonly
									value="${estVal}" /><br /> <label id="txtTarjeta"
									for="tarjeta">Tarjeta *</label> <input type="text"
									class="form-control" name="tarjeta" id="tarjeta" maxlength="20"
									placeholder="Ej.: A1111111111111111111" /> <br />
							</div>
							<div class="form-group col-lg-1"></div>

							<div class="form-group col-lg-4">

								<label id="lblnombreCurso" for="nombreCurso">Nombre del
									curso</label> <input type="text" class="form-control"
									name="nombreCurso" id="nombreCurso" maxlength="30" readonly
									value="${cursoS.titulo}" /><br /> <label id="txtVale"
									for="vale">Vale de descuento</label><input type="text"
									placeholder="Ej.: VALEyyyymmddhhssSSSSXXZZ"
									class="form-control" name="vale" id="vale" maxlength="24" /><br />
							</div>
							<div class="form-group col-lg-12">
								<div class="form-group col-lg-3"></div>

								<div class="form-group col-lg-3">


									<label id="lblprecio" for="precio">Precio en €</label> <input
										type="text" class="form-control" name="precio" id="precio"
										maxlength="8" readonly value="${cursoS.precio}" /><br />
								</div>

								<div class="form-group col-lg-12"
									style="margin: 0px 0px 0px 190px">

									<a href="matriculacionDeCurso.jsp" ><input id="atras" style="margin-right: 25px" type="button"
										class="btn btn-default" value="Atras" /></a> <input
										id="btnEnviarPago" type="submit" class="btn btn-default"
										value="Confirmar compra" />
								</div>
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
