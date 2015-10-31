<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="es">
<head>
<link rel="shotcut icon" href="fonts/Captura_de_pantallaico_2015-10-08_a_las_17.ico" type="image/x-icon">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>iLexion</title>


<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">
<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="css/otro.css" rel="stylesheet">
<link href="css/miestilo.css" rel="stylesheet">
<!-- jQuery desplejable-->
<script src="js/jquery.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
</head>

<body>


	<div id="wrapper">
		<!-- Navigation -->
	
<ul class="nav navbar-right top-nav">
				<li><a href="#" data-toggle="modal"
                                                title="Iniciar sesi&oacuten" data-target="#myModal">Iniciar Sesion 
                        </a></li>
			</ul>
			<div class="modal fade" id="myModal" tabindex="-1"
                                        role="dialog" aria-labelledby="myModalLabel"
                                        aria-hidden="true">
                                        <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Iniciar sesion</div>
                        <!-- para implementacion futura -->
                        <!-- <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div> -->
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="usuario" value="" placeholder="correo electronico">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="contraseña" placeholder="contraseña">
                                    </div>
                                    

                                <!-- Implementacion futura -->
                            <!-- <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div> -->


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->


                                    <div class="col-sm-12 controls centrado">
                                      
                                      <a id="btn-login" href="#" class="btn btn-success" >Iniciar sesion </a>
                                      <a id="btn-fblogin" href="#" class ="btn btn-primary" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                            Registrarse
                                        </a>
                                      
                                      
                                       

                                    </div>
                                </div>


                               
                            </form>     



                        </div>                     
                    </div>  
        </div>
        <div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <div class="panel-title">Registro</div>
                            <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Iniciar sesion</a></div>
                        </div>  
                        <div class="panel-body" >
                            <form id="signupform" class="form-horizontal" role="form">
                                
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>
                                    
                                
                                  
                                <div class="form-group">
                                    <label for="correo" class="col-md-3 control-label">Correo</label> 
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="correo" id="correo" placeholder="Ej.:algo@algo.es">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label for="nick" class="col-md-3 control-label">Nick</label> 
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="nick" id="nick" placeholder="Ej.: Johny90">
                                    </div>
                                </div>
                              
                                                                   
                                    
                                <div class="form-group">
                                    <label for="nombre" class="col-md-3 control-label">Nombre</label>  
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ej.: Juan">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="primerapellido" class="col-md-3 control-label">1º apellido</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="primerapellido" id="primerapellido" placeholder="Ej.: Perez">
                                    </div>
                                </div>
                                  <div class="form-group">
                                    <label for="segundoapellido" class="col-md-3 control-label">2º apellido *</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="segundoapellido"  id="segundoapellido" placeholder="Ej.: Osborne">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="clave1" class="col-md-3 control-label">Contraseña</label> 
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="clave1" id="clave1" placeholder="Ej.: contraseñahipersegura">
                                    </div>
                                </div>
                                 <div class="form-group">
                                    <label for="clave2" class="col-md-3 control-label">Repetir Contraseña</label> 
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="clave2" id="clave2" placeholder="Ej.: contraseñahipersegura">
                                    </div>
                                </div>
                                
                                <div class="row centrado">
                                                                <div class="form-group col-md-3"></div>
                                                                <div class="form-group col-md-5" id="columnas62">
                                                                    <label for="mayoredad">Declaro ser mayor de edad : </label> <input type="checkbox" name="mayoredad" id="mayoredad">
                                                                </div>
                                                                <div class="form-group col-md-5">
                                                                    <label for="termino">Acepto los terminos web : </label> <input type="checkbox"  name="terminos" id="termino">
                                                                </div>
                                                            </div>
                                

                                
                                
                                    
                                    <!-- Codigo no necesario actualmente -->
                                <!-- <div class="form-group">
                                    <label for="icode" class="col-md-3 control-label">Invitation Code</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="icode" placeholder="">
                                    </div>
                                </div> -->

                                <div class="form-group centrado">
                                                                           
                                    <div >
                                        <button id="btn-signup" type="button" class="btn btn-info"><i class="icon-hand-right"></i> Registrarse</button>
                                        <span style="margin-left:8px;"></span>  
                                    </div>
                                </div>
                                
                               <!--  <div style="border-top: 1px solid #999; padding-top:20px"  class="form-group">
                                    
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-fbsignup" type="button" class="btn btn-primary"><i class="icon-facebook"></i> Iniciar sesion</button>
                                    </div>                                           
                                        
                                </div> -->
                                
                                
                                
                            </form>
                         </div>
                    </div>

               
               
                
         </div> 
    </div>
                                    </div>

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
			
			<!-- Top Menu Items 
			<ul class="nav navbar-right top-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> Iniciar sesion <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="login?accion=salir"><i
								class="fa fa-fw fa-power-off"></i> Cerrar sesion</a></li>
					</ul></li>
			</ul>-->
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">
					<li><a href="#"> Inicio</a></li>
					<li><a href="#"> Oferta de Cursos</a></li>
					<li><a href="#"> Cursos</a></li>
					<li><a href="#"> Contactos</a></li>
					<!-- aqui van las redireciones entre li a -->
					
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
		
	</div>

	<!-- /#wrapper -->
	
</body>
</html>