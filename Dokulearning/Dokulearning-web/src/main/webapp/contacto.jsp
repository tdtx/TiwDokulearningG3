<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">


<script src="js/contanto.js"></script>
<link href="css/ventanaDialog.css" rel="stylesheet">
<link href="css/clienteNV.css" rel="stylesheet">

  
    
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
    

<body>


	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">

		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						Formulario de <strong>contacto</strong>
					</h2>
					<hr>

					<div class="row">

						<form onSubmit="return validarK(this)" id="formularioCon"
							enctype="multipart/form-data">

							<div class="form-group col-lg-4">
								<label id="etiqNombre">Nombre *</label> <input type="text"
									id="nombreC" class="form-control" placeholder="ej.: David">
							</div>
							<div class="form-group col-lg-4">
								<label id="etiqCorreo">Correo electonico *</label> <input
									type="email" id="correoC" class="form-control"
									placeholder="ej.: algo@algo.es">
							</div>
							<div class="form-group col-lg-4">
								<label id="etiqTLF">Numero de telefono *</label> <input
									type="tel" id="telefonoC" class="form-control" maxlength="9"
									placeholder="9 digitos">
							</div>
							<div class="clearfix"></div>
							<div class="form-group col-lg-12">
								<label id="etiqMEnsaj">Mensaje *</label>
								<textarea class="form-control" id="mensajeC" rows="6"></textarea>
							</div>
							<div class="form-group col-lg-12 botones">
								<input type="hidden" name="save" value="contact">
								<button type="submit" class="btn btn-default">Enviar</button>
							</div>
						</form>
					</div>


					<div class="modal fade" id="dialogo" tabindex="-1" role="dialog"
						title="informacion" aria-labelledby="myModalLabel"
						aria-hidden="true">
						<div class="container">
							<div id="infodialog" style="margin-top: 50px;"
								class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">

								<div class="panel dialog-info">
									<div class="cabeceraDialog">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
										</button>
										<div class="dialog-title">Informacion</div>
									</div>
									<div class="modal-body">
										<p>Mensaje enviado</p>

									</div>

								</div>
							</div>
						</div>
					</div> 
				









				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>


</body>

</html>
