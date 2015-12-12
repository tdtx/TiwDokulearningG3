<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">


<link href="css/chat.css" rel="stylesheet">
  
    
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
    

<body>


	<jsp:include page="header.jsp"></jsp:include>



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




	<div class="container">

		<div class="row">
			<div class="box altura">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						debe <strong>iniciar sesion</strong>
					</h2>
					<hr>

					<div class="row">
					<br>
					<p style="text-align: center">Para poder realizar el pago debe tener la sesion iniciada</p>
					<br>

					
					
					<div class="form-group col-lg-12 botones">
									
									 <input id="atras" 
									type="button" class="btn btn-default" value="Atras" />
									
									
									<a href="#" data-toggle="modal"
						title="Iniciar sesi&oacuten" data-target="#myModal"
						onClick="$('#loginbox').show(); $('#signupbox').hide()">  <button id="IniciarSesion"
									type="button" class="btn btn-default">Iniciar sesion</button></a>
							
							
									
									<a href="registro.jsp">
									 <button id="registrarse" 
									type="button" class="btn btn-default">Registrarse</button></a>
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
