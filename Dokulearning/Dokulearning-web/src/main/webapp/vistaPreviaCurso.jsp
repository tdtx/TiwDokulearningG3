<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vista previa curso</title>
<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">
<script type="text/javascript">
function val(){
	alert("Curso enviado para validar");
}
</script>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

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
<jsp:include page="header.jsp"></jsp:include>
	<div id ="wrapper">
		<div id="page-wrapper">

			<div class="container-fluid">
		<div class="col-lg-6">
				<!-- /.row -->
				<h1>${param.nom}</h1><p>${param.categoria}</p>
				
				<div style="margin: 100px 0px 100px 0px">

					<ul id="ulErroresEnPagina"></ul>
			<h4>${param.descripcion}</h4>
			<br>
			<div> 
			
			
			
	<div class="container" style="margin-right: 300px">
  <h2>Temario</h2>
  <div class="panel-group" style="margin-right: 35%">
    <div class="panel panel-default" style="margin-right: 35%">
      <div class="panel-heading">${param.secciones}</div>
      <div class="panel-body" style="margin-right: 35%">${param.lecciones}</div>
      <div class="panel-body" style="margin-right: 35%">${param.lecciones}</div>
      <div class="panel-body" style="margin-right: 35%">${param.lecciones}</div>
    </div>
    <div class="panel panel-default" style="margin-right: 35%">
      <div class="panel-heading">${param.secciones}</div>
      <div class="panel-body" style="margin-right: 35%">${param.lecciones}</div>
      <div class="panel-body" style="margin-right: 35%">${param.lecciones}</div>
    </div>
    <div class="panel panel-default" style="margin-right: 35%">
      <div class="panel-heading">${param.secciones}</div>
      <div class="panel-body" style="margin-right: 35%">${param.lecciones}</div>
    </div>
  </div>		
</div>
</div>
</div>
</div>
<div class="col-lg-6">
<div style="margin: 100px 250px 150px 150px"><img alt="Foto" src="imagenes/addressbook_add_128.png" width="80%"> </div>
<div style="margin: 50px 50px 100px 50px">
<div class="container" style="margin-right: 50px">
  			<div class="container-fluid" style="margin-right: 50px">
			<div class="panel panel-info" style="margin-right: 50px">
      <div class="panel-heading">Informacion</div>
      <div class="panel-body" style="margin-left: 50px">Fecha inicio curso: ${param.f_inicio}</div>
       <div class="panel-body" style="margin-left: 50px">Fecha fin curso: ${param.f_fin}</div>
        <div class="panel-body" style="margin-left: 50px">Numero de horas: ${param.horas}</div>
         <div class="panel-body" style="margin-left: 50px">Dificultad del curso: ${param.dificultad}</div>
         <div class="panel-body" style="margin-left: 50px">Profesor: ${param.profesor}</div>
         <div class="panel-body" style="margin-left: 50px">Temario: ${param.temario}</div>
         
					
    	</div>
		</div>
			</div>
</div>
 <nav class="navbar navbar-inverse navbar-fixed-bottom">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">iLexion</a>
    </div>
    <div>
	<form onSubmit="return validarCurso(this)" role="form" action="Cursos" method="post">
	<input type ="text" name = "action" value="vistaPrevia" style="display:none">
	  <div style="margin-left: 50%">
 	<button type="submit" name= "enviarValidar" id= "enviarValidar" OnClick= "val()">Enviar a validar</button>
 	<a href="formularioCurso.jsp">Volver atras</a>
	</div>
	</form>
    </div>
  </div>
</nav>



</div>
</div>

			<!--<div class="container-fluid" style="margin-left: 75%">
			<div class="panel panel-info">
      <div class="panel-heading">Informacion</div>
      <div class="panel-body">Fecha inicio curso: ${param.f_inicio}</div>
       <div class="panel-body">Fecha fin curso: ${param.f_fin}</div>
        <div class="panel-body">Numero de horas: ${param.horas}</div>
         <div class="panel-body">Dificultad del curso: ${param.dificultad}</div>
         <div class="panel-body">temario: ${param.temario}</div>
    	</div>
			
</div>  -->		
</div>	
</div>
	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>