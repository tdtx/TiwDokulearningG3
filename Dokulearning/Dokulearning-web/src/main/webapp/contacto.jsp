<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">


<script src="js/contanto.js"></script>

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
							
							<input type="text" name="distribucionMatriculacion"
								value="crearMatriculacion" style="display: none" />
							<div class="form-group col-lg-4">
								<label id="etiqNombre" >Nombre *</label> <input type="text"  id="nombreC" class="form-control"
									placeholder="ej.: David">
							</div>
							<div class="form-group col-lg-4">
								<label  id="etiqCorreo">Correo electonico *</label> <input type="email" id="correoC"
									class="form-control" placeholder="ej.: algo@algo.es">
							</div>
							<div class="form-group col-lg-4">
								<label  id="etiqTLF">Numero de telefono *</label> <input type="tel" id="telefonoC" 
									class="form-control" maxlength="9" placeholder="9 digitos">
							</div>
							<div class="clearfix"></div>
							<div class="form-group col-lg-12">
								<label  id="etiqMEnsaj">Mensaje *</label>
								<textarea class="form-control" id="mensajeC" rows="6"></textarea>
							</div>
							<div class="form-group col-lg-12">
								<input type="hidden" name="save" value="contact">
								<button type="submit" class="btn btn-default">Enviar</button>
							</div>
							</form>
						</div>
					
				</div>
			</div>
		</div>

	</div>
	<!-- /.container -->

	<jsp:include page="footer.jsp"></jsp:include>


</body>

</html>
