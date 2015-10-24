<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

	<h1>PERFIL</h1>


	<form id="reg" action="registroWeb" method="post">

		<label id="lblnick" for="nick">Nick:</label><input type="text" name="nick" id="nick" maxlength="8" value="${registrados.nick}" /><br /> 
		
		<label id="lblnombre" for="nombre">Nombre:</label><input type="text" name="nombre" id="nombre" maxlength="20" value="${registrados.nombre}" /><br /> 
		<label id="lblapellido1" for="apellido1">Primer apellido:</label><input type="text" name="apellido1" id="apellido1" maxlength="20" value="${registrados.apellido1}" /><br /> 
		<label id="lblapellido2" for="apellido2">Segundo apellido:</label><input type="text" name="apellido2" id="apellido2" maxlength="20" value="${registrados.apellido2}" /><br />
		<label id="lblcorreo" for="correo">Correo electronico:</label><input type="text" name="correo" id="correo" maxlength="30" value="${registrados.correo}" /><br /> 
		<label id="lblclave1" for="clave1">Contraseña:</label><input type="password" name="clave1" id="clave1" maxlength="20" value="${registrados.clave1}" /><br /> 
		
	<button type="submit" class="btn btn-primary">Guardar Cambios</button>
	<button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
	</form>





</body>
</html>