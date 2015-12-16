<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resumen Curso</title>
<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
<c:set var="cursoS" scope="session" value="${perfilCurso}"></c:set>
	<c:set var="estPro" scope="session" value="${profesor}"></c:set>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div class="box">
				<!-- /.row -->
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						resumen del curso <strong>${cursoS.titulo}</strong>
					</h2>
					<hr>


					<ul id="ulErroresEnPagina"></ul>

					<c:choose>
						<c:when test="${not empty mensaje }">
							<p class="error">${mensaje }</p>
						</c:when>
					</c:choose>
							<div class="form-group col-lg-1"></div>
														<div class="form-group col-lg-1"></div>
							

					<div class="form-group col-lg-4">
					<div  style="text-align:center">
						<img alt="Foto" src="imagenes/addressbook_add_128.png" width=60%>
					</div>
					<div style="text-align:center">
					<br /><br /><br /><br />
					<c:if test="${estadoValidacion==null}">
						<a href="Cursos?accion=${cursoS.titulo}&estado=matricularse"><button type="button"
									class="btn btn-default" style="text-align:center" >Matricularse</button></a>
									</c:if>
									<c:if test="${estadoValidacion!=null}">
						<a href="chat.jsp"><button type="button"
									class="btn btn-default" style="text-align:center" >Chat</button></a>
										<c:if test="${profesor!=null}">
											<button type="button"
									class="btn btn-default" style="text-align:center" data-toggle="modal" data-toggle="tooltip" data-placement="left" data-target="#miDialog${cursoS.id}">Editar Curso</button>
									<div class="modal fade" id="miDialog${cursoS.id}" tabindex="-1"
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
														Curso de ${cursoS.titulo}</h4>
												</div>
												<div class="modal-body">
													<div class="">
														<form onSubmit="return validarC(this)" action="Cursos" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="action" value="${cursoS.titulo}"
																style="display: none">																	
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																
																<label for="tituloC">Titulo</label> <span class="red">*</span><input
																		type="text" class="form-control" id="tituloC"
																		name="tituloC"
																		value="${cursoS.titulo}">																	
																<div>  &nbsp</div>
																	<label for="usuarioC">Profesor</label> <span class="red">*</span><input
																		type="text" class="form-control" id="usuarioC" readonly
																		name="usuarioC" 
																		value="${cursoS.usuario}">
																</div>
												
																<div class="text-center">
																<img alt="fotoU" src="${cursoS.idImagen}">																		
																	</div>
															</div>
														
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="descripcionC">Descripcion </label> <span class="red">*</span><input type="text"
																		class="form-control" id="descripcionC" name="descripcionC"
																		value="${cursoS.descripcion}">
																</div>
																<div class="form-group col-md-5">
																	<label for="horasC">Numero de horas</label> <span class="red">*</span><input
																		type="text" class="form-control" id="horasC" maxlength="4"
																		name="horasC"
																		value="${cursoS.horas}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="temarioC">Temario </label> <span class="red">*</span><input type="text"
																		class="form-control" id="temarioC" name="temarioC"
																		value="${cursoS.temario}">
																</div>
																
																<div class="form-group col-md-5">
																
																<label id="txtcertif" for="certificadoC">Certificado</label><span class="red">*</span>
																		<select id="certificadoC" name="certificadoC" class="form-control">
																			<option value="${cursoS.certificado}">${cursoS.certificado}</option>
																			<option value="Si">Si</option>
																			<option value="No">No</option>											
																		</select>
																
																</div>
															</div>
												
											
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="categoriaC">Categoria </label> <span class="red">*</span><input type="text"
																		class="form-control" id="categoriaC" name="categoriaC"
																		value="${cursoS.categoria}">
																</div>
																<div class="form-group col-md-5">
																
																
																	<label id="txtdestacado" for="destacadoC">Destacado</label><span class="red">*</span>
																		<select id="destacadoC" name="destacadoC" class="form-control">
																			<option value="${cursoS.destacado}">${cursoS.destacado}</option>
																			<option value="Si">Si</option>
																			<option value="No">No</option>											
																		</select>
																
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	 
																	 <label id="txtValidacion" for="validacionC">Validacion</label><span class="red">*</span>
																		<select id="validacionC" name="validacionC" class="form-control">
																			<option value="${cursoS.validacion}">${cursoS.validacion}</option>
																			<option value="A eliminar">A eleminar</option>
																			<option value="Validado">Validado</option>	
																			<option value="Pendiente">Pendiente</option>																														
																		</select>

																</div>
																<div class="form-group col-md-5">
																	<label for="precioC">Precio</label> <span class="red">*</span><input
																		type="text" class="form-control" id="precioC"
																		name="precioC" 
																		value="${cursoS.precio}">
																</div>
															</div>
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	
																	<label id="txtoferta" for="tipoOfertaC">Tipo de oferta</label><span class="red">*</span>
																		<select id="tipoOfertaC" name="tipoOfertaC" class="form-control">
																			<option value="${cursoS.tipoOferta}">${cursoS.tipoOferta}</option>
																			<option value="Si">Si</option>
																			<option value="No">No</option>											
																		</select>
													
																</div>
																<div class="form-group col-md-5">
																	
																	
																	
																	 <label id="txtDif" for="nivelC">Nivel</label><span class="red">*</span>
																		<select id="nivelC" name="nivelC" class="form-control">
																			<option value="${cursoS.nivel}">${cursoS.nivel}</option>
																			<option value="A eliminar">Medio</option>
																			<option value="Validado">Bajo</option>	
																			<option value="Pendiente">Alto</option>																														
																		</select>
															
																</div>
															</div>
													<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																 <label for="fechaInicioC">Fecha Inicial </label> <input type="text"
																		class="form-control" id="fechaInicioC" name="fechaInicioC" readonly
																		value="${cursoS.fechaInicio}"> 
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaFInC">Fecha FIn</label> <input
																		type="text" class="form-control" id="fechaCaducidadC" readonly
																		name="fechaCaducidadC" 
																		value="${cursoS.fechaCaducidad}">
																</div>
															</div>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																 <label for="contadorC">Contador </label><input type="text"
																		class="form-control" id="contadorC" name="contadorC" readonly
																		value="${cursoS.contador}"> 
																</div>
															<div class="form-group col-md-5">
																	<label for="idC">ID</label><input
																		type="text" class="form-control" id="idC"
																		name="idC" readonly
																		value="${cursoS.id}">
																</div>
															</div>
													
													
														
																<div class="modal-footer">
													<div>
																<button type="submit" class="btn btn-primary" >Guardar
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
										</c:if>
									</c:if>
					</div>
					</div>
					<div>
						<div class="form-group col-lg-4">

							<!-- <div class="form-group"> <label>Nombre del curso:</label>${param.titulo}</div> -->
							
							<div class="form-group"> <label>Categoria:</label> ${cursoS.categoria}</div>
							<div class="form-group"> <label>Descripcion:</label> ${cursoS.descripcion}</div>
							<div class="form-group"> <label>Horas del curso:</label> ${cursoS.horas}</div>
							<div class="form-group"> <label>Empieza el:</label> ${cursoS.fechaInicio}</div>
							<div class="form-group"> <label>El temario sera:</label> ${cursoS.temario}</div>
							<div class="form-group"> <label>Profesor:</label> ${cursoS.usuario}</div>
							<div class="form-group"> <label>Nivel del curso:</label> ${cursoS.nivel}</div>
							<div class="form-group"> <label>Precio:</label> ${cursoS.precio} €</div>
						
						
							




							
						</div>
					</div>




				</div>
			</div>
		</div>
		</div>

		<!-- jQuery -->
		<script src="js/jquery.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="js/bootstrap.min.js"></script>


		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>