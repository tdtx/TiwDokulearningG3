<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">


<link href="css/migasPan.css" rel="stylesheet">


<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>


<style type="text/css">
a:link {text-decoration:none; color: #DDB888;  font-weight: bold; font-size: 18px;} /* Link no visitado*/
a:visited {text-decoration:none; color:#DDB888;   font-weight: bold;font-size: 18px;} /*Link visitado*/
a:active {text-decoration:none; color:#DDB888; font-weight: bold; font-size: 18px;} /*Link activo*/
a:hover {text-decoration:none; color:#DDB888;  font-weight: bold; font-size: 18px;} /*Mause sobre el link*/
</style>

<body>


	<jsp:include page="header.jsp"></jsp:include>



	<div class="container">

		<div class="row">
			<div class="box">
				<div class="col-lg-12">
				
				<ol class="breadcrumb" style="background-color:#F9F4EF">
  <li><a href="#" class="letras">Matriculacion</a></li>
  <li><a href="#">Datos de pago</a></li>
  <li class="active" style="text-decoration:bold; font-size: 18px"> Resumen</li>
</ol>
				
				
					<hr>
					<h2 class="intro-text text-center">
						resumen de <strong>operaci&oacute;n</strong>
					</h2>
					<hr>

					<div class="row"></div>
					<br>
					<h2 class="intro-text" style="text-align: center">La
						operaci&oacute;n de ha realizado con exito</h2>
					<br>
					<div class="form-group col-lg-3"></div>

					<div class="form-group col-lg-6">

						<!-- <div class="container" style="margin-right: 300px"> -->

						<div class="panel-group">
							<div class="panel panel-default">
								<div class="panel-heading">Resumen</div>
								<div class="panel-body">Nick de usuario: ${param.lecciones}</div>
								<div class="panel-body">Nombre del curso: ${param.lecciones}</div>
								<div class="panel-body">Importe del curso: ${param.lecciones}</div>
								<div class="panel-body">C&oacute;digo de la operaci&oacute;n: ${param.lecciones}</div>
								<div class="panel-body">C&oacute;digo de pedido: ${param.lecciones}</div>
								<div class="panel-body">Tarjeta: ${param.lecciones}</div>
								<div class="panel-body">Fecha: ${param.lecciones}</div>
								<div class="panel-body">Vale aplicado: ${param.lecciones}</div>
								
							</div>

						</div>
					</div>
					<div class="form-group col-lg-3"></div>


					

				</div>
				<div class="form-group col-lg-12" style="text-align: center">
				<a href="index.jsp">
						<button id="finalizar" type="button" class="btn btn-default">Finalizar</button>
					</a>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>


</body>

</html>
