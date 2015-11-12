<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


			<div class="container">
				<!-- Page Heading -->
				<div class="row">
					<div class="box">
				
					<div class="col-lg-12 ">
					 <hr>
                    <h2 class="intro-text text-center">Cursos 
                        <strong>destacados</strong>
                    </h2>
                    <hr>
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
                                        <td><a href="Cursos?accion=${cursoD.horas}">${cursoD.nom}</a></td>
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
		<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>
