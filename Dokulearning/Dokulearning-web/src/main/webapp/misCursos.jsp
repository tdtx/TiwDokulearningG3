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
                    <h2 class="intro-text text-center">mis 
                        <strong>cursos y alumnos</strong>
                    </h2>
                    <hr>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Titulo del curso</th>
										<th>Alumno</th>									
									</tr>
								</thead>
								<tbody>
                               <c:forEach items="${matriculados}" var="matriculadosM">
                                    <tr>
                                        <td><a href="Cursos?accion=${matriculadosM.curso}&estado=${matriculadosM.usuario}">${matriculadosM.curso}</a></td>
                                        <td>${matriculadosM.usuario}</td>
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