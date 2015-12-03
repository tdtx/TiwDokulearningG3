<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">







<head>
<link rel="shotcut icon"
	href="fonts/Captura_de_pantallaico_2015-10-08_a_las_17.ico"
	type="image/x-icon">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>iLexion</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/business-casual.css" rel="stylesheet">
<link href="css/otro.css" rel="stylesheet">

<link href="css/ventanaDialog.css" rel="stylesheet">
<!-- Fonts -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic"
	rel="stylesheet" type="text/css">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">



</head>
<body>
	<c:set var="estVal" scope="session" value="${estadoValidacion}"></c:set>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<c:if test="${estadoValidacion==null}">
			<div class="user-menu-small row tam">
				<ul class="navbar-right top-nav">
					<li><a href="#" data-toggle="modal"
						title="Iniciar sesi&oacuten" data-target="#myModal"
						onClick="$('#loginbox').show(); $('#signupbox').hide()"><i
							class="fa fa-user"></i> Iniciar Sesion </a></li>
				</ul>
			</div>
		</c:if>
		<c:if test="${estadoValidacion!=null}">
			<div class="user-menu-small row tam">
				<ul class="navbar-right top-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><i class="fa fa-user"></i> <c:out
								value="${estVal}"></c:out> <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="registroWeb?action=perfil&estado=${estVal}"><i
									class="fa fa-fw fa-user"></i> Perfil</a></li>
							<li><a href="registroWeb?action=salir"><i
									class="fa fa-fw fa-power-off"></i> Cerrar sesion</a></li>
						</ul>
				</ul>
			</div>
		</c:if>

	</nav>
	<br>
	<br>
	<br>
	<br>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="container">
			<div id="loginbox" style="margin-top: 50px;"
				class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<div class="panel dialog-info">
					<div class="cabeceraDialog">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<div class="dialog-title">Iniciar sesion</div>
						<!-- para implementacion futura -->
						<!-- <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div> -->

					</div>

					<div style="padding-top: 30px" class="panel-body">

						<div style="display: none" id="login-alert"
							class="alert alert-danger col-sm-12"></div>


						<form action="registroWeb" method="post" class="form-horizontal"
							role="form">
							<input type="text" name="distribucion" value="iniciarSesion"
								style="display: none" />


							<div style="margin-bottom: 25px" class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user"></i></span> <input id="correo"
									type="text" class="form-control" name="correo" value=""
									placeholder="correo electronico">
							</div>

							<div style="margin-bottom: 25px" class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span> <input
									id="login-password" type="password" class="form-control"
									name="clave1" id="clave1" placeholder="contrasenia">

							</div>


							<div style="margin-bottom: 25px" class="input-group">
								<a href="registro.jsp"> Registrarse </a>

							</div>
							<!-- Implementacion futura -->
							<!-- <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div> -->


							<div style="margin-top: 10px" class="form-group">
								<!-- Button -->


								<div class="col-sm-12 controls centrado">
									<button id="btn-login" class="btn boton-principal"
										type="submit">
										<i class="icon-hand-right"></i> iniciar Sesion
									</button>
									<span style="margin-left: 8px;"></span> <a id="btn-fblogin"
										href="#" class="btn boton-secundario" data-dismiss="modal">
										Cerrar </a>




								</div>
							</div>



						</form>




					</div>
				</div>
			</div>


			





			
		</div>
	</div>










	<div class="logoilexion">

		<a href="index.jsp"><img alt="logo" src="fonts/logoIlexion.png"
			width="18%"></a>


	</div>
	<!--<div class="address-bar">Aprende en un click</div>

	 Navigation -->
	<nav class="navbar navbar-default" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
				<a class="navbar-brand" href="index.jsp">Ilexion</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="index.jsp">Inicio</a></li>
					<li><a href="Cursos?accion=cursos">Cursos</a></li>
					<li><a href="Cursos?accion=ofertas">Ofertas</a></li>
					<li><a href="Cursos?accion=destacados">Destacados</a></li>
					<li><a href="contacto.jsp">Contacto</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>


</body>

</html>