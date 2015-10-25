<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

	<h1>PERFIL</h1>
	<form id="reg" action="registroWeb" method="post">

		<label id="lblnick" for="nick">Nick:</label><input type="text" name="nick" id="nick" maxlength="8" value="${sessionScope.usuario.nick}" /><br /> 
		
		<label id="lblnombre" for="nombre">Nombre:</label><input type="text" name="nombre" id="nombre" maxlength="20" value="${sessionScope.usuario.nombre}" /><br /> 
		<label id="lblapellido1" for="apellido1">Primer apellido:</label><input type="text" name="apellido1" id="apellido1" maxlength="20" value="${sessionScope.usuario.apellido1}" /><br /> 
		<label id="lblapellido2" for="apellido2">Segundo apellido:</label><input type="text" name="apellido2" id="apellido2" maxlength="20" value="${sessionScope.usuario.apellido2}" /><br />
		<label id="lblcorreo" for="correo">Correo electronico:</label><input type="text" name="correo" id="correo" maxlength="30" value="${sessionScope.usuario.correo}" /><br /> 
		<label id="lblclave1" for="clave1">Contraseña:</label><input type="password" name="clave1" id="clave1" maxlength="20" value="${sessionScope.usuario.clave1}" /><br /> 

		<c:choose>
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
		</c:choose>
		
	<button type="submit" class="btn btn-primary">Guardar Cambios</button>
	<button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
	</form>





</body>
</html>