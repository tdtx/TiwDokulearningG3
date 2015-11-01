<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resumen Curso</title>
<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<div id="wrapper">

		

		<div id="page-wrapper">

			<div class="container-fluid">
		<div>
		<div style="margin-left: 5px"><img alt="Foto" src="imagenes/addressbook_add_128.png" width=250px> </div>
				<!-- /.row -->
     </div>
     <div>
<div><h1>Nombre:${param.nom}</h1></div>
<div><h2>categoria:${param.categoria}</h2></div>
<div>Descripcion:${param.descripcion}</div>
<div>Numero de horas:${param.horas}</div>
<div>Desde:${param.f_inicio}</div>
<div>Hasta: ${param.f_inicio}</div>
<div>Temario:${param.temario}</div>
<div>Profesor:${param.profesor}</div>
<div>Dificultad:${param.dificultad}</div>
<div>Cierre curso:${param.cierre_curso}</div>
<div>Precio:${param.precio}</div>
</div>
<a href="matriculacionDeCurso.jsp"><button type="button" class="btn btn-info">Matricularse</button></a>

</div>

<div>

	<label id="lblnick" for="nick">nom:</label>
	<input type="text" name="nick" id="nick" maxlength="8"
		value="${param.nom}" />
	<br />


	<label id="lblnombre" for="nombre">categoria:</label>
	<input type="text" name="nombre" id="nombre" maxlength="20"
		value="${param.categoria}" />
	<br />
	<label id="lblapellido1" for="apellido1">descripcion:</label>
	<input type="text" name="apellido1" id="apellido1" maxlength="20"
		value="${param.descripcion}" />
	<br />
	<label id="lblapellido2" for="apellido2">temario:</label>
	<input type="text" name="apellido2" id="apellido2" maxlength="20"
		value="${param.temario}" />
	<br />
	<label id="lblcorreo" for="correo">horas:</label>
	<input type="text" name="correo" id="correo" maxlength="30"
		value="${param.horas}" />
	<br />
	<!-- <label id="lblclave1" for="clave1">Contraseña:</label><input type="password" name="clave1" id="clave1" maxlength="20" value="${param.clave1}" /><br /> -->

	<label id="lblcorreo" for="clave">f_inicio:</label>
	<input type="text" name="clave" id="clave" maxlength="30"
		value="${param.f_inicio}" />
	<br />

</div>

		
</div>  	
</div>	
	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>