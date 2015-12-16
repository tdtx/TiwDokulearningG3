
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">

<link href="css/imagen_index.css" rel="stylesheet">

<body>
   <jsp:include page="header.jsp"></jsp:include>

    <div class="container">

        <div class="row">
            <div class="box">
                <div class="col-lg-12 text-center">
                 <hr>
                    <h2 class="intro-text text-center">Cursos 
                        <strong>destacados</strong>
                    </h2>
                    <hr>
                    <div id="carousel-example-generic" class="carousel slide">
                        <!-- Indicators -->
                        <ol class="carousel-indicators hidden-xs">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="4"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="5"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="6"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active image">
                               <a href="Cursos?accion=Chino"> <img class="img-responsive img-full" src="imagenes/chino.jpg" alt=""></a>
                               <h3><span>Curso de chino</span></h3>
                            </div>
                            <div class="item">
                               <a href="Cursos?accion=Arquitectura de computadores"> <img class="img-responsive img-full" src="imagenes/arcos.png" alt=""></a>
                               <h3><span>Curso arquitectura de computadores</span></h3>
                            </div>
                            <div class="item">
                               <a href="Cursos?accion=ADE"> <img class="img-responsive img-full" src="imagenes/ADE.jpg" alt=""></a>
  								<h3><span>Curso de ADE</span></h3>                          
                            </div>
                            <div class="item">
                                <a href="Cursos?accion=Programacion"><img class="img-responsive img-full" src="imagenes/programacion.jpg" alt=""></a>
                                <h3><span>Curso de programacion</span></h3>
                            </div>
                            <div class="item">
                                <a href="Cursos?accion=Francia"><img class="img-responsive img-full" src="imagenes/frances.jpg" alt=""></a>
                                <h3><span>Curso de frances</span></h3>
                            </div>
                             <div class="item">
                                <a href="Cursos?accion=Calculo"><img class="img-responsive img-full" src="imagenes/calculo.png" alt=""></a>
                                <h3><span>Curso de calculo</span></h3>
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                            <span class="icon-prev"></span>
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                            <span class="icon-next"></span>
                        </a>
                    </div>
                    
                    <h2>
                        <small> 
                            <strong> </strong>
                        </small>
                    </h2>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Sobre
                        <strong>Nosotros</strong>
                    </h2>
                    <hr>
                    <img class="img-responsive img-border img-left" src="images/logo.png" alt="" width="20%">
                    <hr class="visible-xs">
                    
                   <p></br>Somos una empresa creada para hacer mas facil el hecho de poder aprender desde casa. Somos un portal de cursos on-line, en el que te podras matricular en cualquier curso, incluso podras crear tus propios cursos y convertirte en profesor.</p>           </br></br>     </div>
                  
                   </div>
            </div>
        </div>

        

    <!-- /.container -->

       <jsp:include page="footer.jsp"></jsp:include>
    
</body>

</html>
