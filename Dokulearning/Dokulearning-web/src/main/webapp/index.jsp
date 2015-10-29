<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/boostrap.min.css" rel="stylesheet" type="text/css">
<link href="css/miestilo.css" rel="stylesheet" type="text/css">

<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300,700,800,600,400'
	rel='stylesheet' type='text/css'>
<link href="css/owl.carousel.css" rel="stylesheet" type="text/css"
	media="all" />
<script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="js/responsive-nav.js" type="text/javascript"></script>
<script src="js/owl.carousel.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {

		$("#owl-demo").owlCarousel({

			navigation : true,
			slideSpeed : 300,
			paginationSpeed : 400,
			singleItem : true

		});

	});
</script>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link href="css/dialogo.css" rel="stylesheet" type="text/css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>Pagina principal</title>
</head>

<body>

	<!----inicio-header----->
	<div class="header">
		<div class="wrap">
			<div class="top-header">
				<div class="logo">
					<img src="images/logo.png">
				</div>
			</div>


			<!---inicio-top-nav---->
			<div class="top-nav">
				<div class="top-nav-left">
					<ul>

						<li class="active"><a href="index.index">IleXion</a></li>
						<li><a href="index.index">Inicio </a></li>
						<li><a href="ofertas.jsp">Ofertas</a></li>
						<li><a href="item.html">Item por definir</a></li>
						<li><a href="contacto.html">Contacto</a></li>

					</ul>

					<script>
						var navigation = responsiveNav("#nav");
					</script>

				</div>
				<div class="top-nav-right">
<button class="btn btn-info btn-xs" data-toggle="modal"
                                                data-toggle="tooltip" data-placement="left"
                                                title="Editar Registrado" data-target="#myModal">                           
                                                <span class="glyphicon glyphicon-pencil"></span>
                                            </button>
<div class="modal fade" id="myModal" tabindex="-1"
                                        role="dialog" aria-labelledby="myModalLabel"
                                        aria-hidden="true">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">
                                                        <span aria-hidden="true">&times;</span><span
                                                            class="sr-only">Close</span>
                                                    </button>
                                                    <h4 class="modal-title" id="myModalLabel">Editar
                                                        Registrado de ${registrado.correo}</h4>
                                                </div>
                                                <div class="modal-body">
                                                    <div class="">
    <!---Form Registrado --------------------------><form  onSubmit="return validarR(this)" action="gestionRegistrado" method="post"
                                                            class="form-horizontal" role="form">
                                                            <input type="text" name="id" value="${registrado.correo}"
                                                                style="display: none">
                                                            <div class="row">
                                                                <div class="form-group col-md-1"></div>
                                                                <div class="form-group col-md-5" id="columnas62">
                                                                    <label for="nickR">Nick </label> <input type="text"
                                                                        class="form-control" id="nickR" name="nickR"
                                                                        value="${registrado.nick}">
                                                                </div>
                                                                <div class="form-group col-md-5">
                                                                    <label for="nombreR">Nombre</label> <input
                                                                        type="text" class="form-control" id="nombreR"
                                                                        name="nombreR" 
                                                                        value="${registrado.nombre}">
                                                                </div>
                                                            </div>
                                                          
                                                            <div class="modal-footer">
                                                    <div>
                                                                <button type="submit" class="btn btn-primary">Guardar
                                                                    Cambios</button>
                                                                <button type="button" class="btn btn-primary"
                                                                    data-dismiss="modal">Cerrar</button>
                                                            </div>                              
                                                </div>
                                                        </form>
                                                    </div>
                                                </div>
                                                
                                            </div>
                                        </div>
                                    </div>


					<ul>

						<li class="entrar-registar"><a href="cuadrodialogo_entrar.jsp">Entrar 
						</a></li>
						<li class="entrar-registar"><a href="#">Registrate </a></li>
					</ul>


				</div>

				<div class="clear"></div>
			</div>
			<!---End-top-nav---->
		</div>
	</div>
	<!----final-header----->

	<!------ Slider ------------>
	<div class="banner">
		<div class="wrap">
			<div class="banner-text">

				 <div id="owl-demo" class="owl-carousel owl-theme">
					<div class="item">
						<div class="banner-desc">
							<h2>Curso de Excel Avanzado</h2>
							<p>
								En este curso aprenderas <br />lo que nadie sabe sobre Excel
							</p>
						</div>
					</div>
					<div class="item">
						<div class="banner-desc">
							<h2>Curso de Egiptologia</h2>
							<p>
								¿Te gusta el Antiguo Egipto? <br />Este es tu curso
							</p>
						</div>
					</div>
					<div class="item">
						<div class="banner-desc">
							<h2>Curso de Guitarra</h2>
							<p>
								Aprende a tocar la guitarra <br />como Jimmy Page en pocas
								semanas
							</p>
						</div>
					</div>
				</div> 
				
			</div>

			<div class="portada">
				<img src="images/portada.jpg" alt="Imagen de una mujer estudiosa"
					width="55%" />
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<!------final Slider ------------>




	<!---inicio-footer---->
	  
	<div class="footer">
		<div class="wrap">
			<div class="foot-nav"></div>

			<div class="copy-right">
				<p>2015 Copyright (c). TCRAM</p>
			</div>
			
			<div class="clear"></div>
		</div>
	</div>
	
	<!---final-footer---->


</body>
</html>
