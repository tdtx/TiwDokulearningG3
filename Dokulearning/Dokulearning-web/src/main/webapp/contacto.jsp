<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contacto</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<script src="js/jquery.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="js/contanto.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<h1>Contacto</h1>

	<div id="wrapper">


		<div id="page-wrapper">
			<form onSubmit="return validarR(this)" role="form">
				<label for="nombreJ">Nombre:</label> <input type="text"
					name="nombreJ" id="nombreJ"><br /> <label
					id="etiqemail" for="email">Correo electrónico:</label> <input
					type="text" name="email" id="email" maxlength="80"> <br />


				<label id="etiqmensaje" for="mensajee">Mensaje:</label>
				<textarea name="mensajee" id="mensajee"></textarea>
				<br /> 
				<a href="index.jsp">  <button type="submit" value="Enviar" >Enviar</button></a>

			</form>


		</div>
		<!-- /#page-wrapper -->
	</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>