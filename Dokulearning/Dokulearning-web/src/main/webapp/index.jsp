
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/otro.css" rel="stylesheet">
</head>
<body>

	 <jsp:include page="header.jsp"></jsp:include>
	 <%--
	<div id="wrapper">
		<div id="page-wrapper">
		<div class="indexbody" 	style="background-image:url(img/marcoO.jpg);" >
                         <div class="centrado">
                         <br></br> <br></br> 
                         	<h2>Bienvenido a ILEXION</h2>
                         	<p>Sus cursos online y cada dia los de mas gente</p>
				           <div class="centro">
							<img alt="logo" src="fonts/Captura de pantalla 2015-10-08 a las 17.44.51.png" width="25%">
						</div>
                       </div>    
                       </div>    
           </div>           
	</div>
	 --%>
<div id="wrapper">
		<div id="page-wrapper">
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12 ">
						<h1 class="page-header">Cursos en Oferta</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Titulo</th>
										<th>Precio</th>									
									</tr>
								</thead>
								<tbody>
                               <c:forEach items="${cursos }" var="curso">
                                    <tr>
                                        <td><a href="#">${curso.nom}</a></td>
                                        <td>${curso.precio} €</td>
                                    </tr>
                                  
                                    </c:forEach>
                                    </tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12 ">
						<h1 class="page-header">Cursos Destacados</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Titulo</th>
										<th>Precio</th>									
									</tr>
								</thead>
								<tbody>
                               <c:forEach items="${cursos }" var="cursoD">
                                    <tr>
                                        <td><a href="#">${cursoD.nom}</a></td>
                                        <td>${cursoD.precio} €</td>
                                    </tr>
                                  
                                    </c:forEach>
                                    </tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>

</html>