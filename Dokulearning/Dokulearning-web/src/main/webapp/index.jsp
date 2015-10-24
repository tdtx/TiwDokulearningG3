<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
						<li><a href="item.html">Item a definir</a></li>
						<li><a href="contacto.html">Contacto</a></li>

					</ul>

					<script>
						var navigation = responsiveNav("#nav");
					</script>

				</div>
				<div class="top-nav-right">


					<ul>

						<li class="entrar-registar"><a href="#">Entrar </a></li>
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
