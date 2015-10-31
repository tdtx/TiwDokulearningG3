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







<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">iLexion</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
					class="caret"></b></a>
				<ul class="dropdown-menu message-dropdown">
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="http://placehold.it/50x50" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>${param.profesor}</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur...</p>
								</div>
							</div>
					</a></li>
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="http://placehold.it/50x50" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>${param.profesor}</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur...</p>
								</div>
							</div>
					</a></li>
					<li class="message-preview"><a href="#">
							<div class="media">
								<span class="pull-left"> <img class="media-object"
									src="http://placehold.it/50x50" alt="">
								</span>
								<div class="media-body">
									<h5 class="media-heading">
										<strong>${param.profesor}</strong>
									</h5>
									<p class="small text-muted">
										<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
									</p>
									<p>Lorem ipsum dolor sit amet, consectetur...</p>
								</div>
							</div>
					</a></li>
					<li class="message-footer"><a href="#">Read All New
							Messages</a></li>
				</ul></li>

			<!--campanita-->
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-bell"></i> <b
					class="caret"></b></a>
				<ul class="dropdown-menu alert-dropdown">
					<li><a href="#">Alert Name <span
							class="label label-default">Alert Badge</span></a></li>
					<li class="divider"></li>
					<li><a href="#">View All</a></li>
				</ul></li>


			<!-- usuario log -->
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-user"></i> ${param.profesor} <b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a></li>
					<li><a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
					</li>
					<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
					</li>
					<li class="divider"></li>
					<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Log
							Out</a></li>
				</ul></li>
		</ul>
		<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav side-nav">
				<li><a href="index.html"><i class="fa fa-fw fa-dashboard"></i>
						Dashboard</a></li>
				<li><a href="javascript:;" data-toggle="collapse"
					data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i>
						Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo" class="collapse">
						<li><a href="#">Dropdown Item</a></li>
						<li><a href="#">Dropdown Item</a></li>
					</ul></li>

			</ul>
		</div>
		<!-- /.navbar-collapse --> </nav>

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
			
			
			
	<div class="container" style="margin-right: 25%">
  <h2>Temario</h2>
  <div class="panel-group" style="margin-right: 25%">
    <div class="panel panel-default" style="margin-right: 25%">
      <div class="panel-heading">${param.secciones}</div>
      <div class="panel-body" style="margin-right: 25%">${param.lecciones}</div>
      <div class="panel-body" style="margin-right: 25%">${param.lecciones}</div>
      <div class="panel-body" style="margin-right: 25%">${param.lecciones}</div>
    </div>
    <div class="panel panel-default" style="margin-right: 25%">
      <div class="panel-heading">${param.secciones}</div>
      <div class="panel-body" style="margin-right: 25%">${param.lecciones}</div>
      <div class="panel-body" style="margin-right: 25%">${param.lecciones}</div>
    </div>
    <div class="panel panel-default" style="margin-right: 25%">
      <div class="panel-heading">${param.secciones}</div>
      <div class="panel-body" style="margin-right: 25%">${param.lecciones}</div>
    </div>
  </div>		
</div>
</div>
</div>
</div>
<div class="col-lg-6">
<div style="margin: 100px 250px 50px 100px"><img alt="Foto" src="imagenes/addressbook_add_128.png" width="80%"> </div>
<div style="margin: 100px 100px 100px 100px">
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