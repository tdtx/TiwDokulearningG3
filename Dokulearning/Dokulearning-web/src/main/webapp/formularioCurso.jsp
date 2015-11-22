<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Creacion del curso</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="js/jquery.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script src="js/validarCurso2.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>


<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">


</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>


	<div class="container">

		<!-- Page Heading -->
		<div class="row">
			<div class="box">
				<!-- /.row -->
				<hr>
				<h2 class="intro-text text-center">
					crear <strong>curso</strong>
				</h2>
				<hr>

				<ul id="ulErroresEnPagina"></ul>

				<form onSubmit="return validarCurso(this)" role="form"
					action="Cursos" method="post">
					<input type="text" name="action" value="rellenar_formulario"
						style="display: none"> <br />


					<div style="margin: 0px 0px 0px 200px">

						<div class="form-group col-lg-4">



							<label id="labelNombre" for="nom">Nombre de curso </label> <input
								class="form-control" type="text" id="nom" name="nom"
								placeholder="Ej.: Matematicas" /><br /> 
								
							<label id="labelDescripcion" >Descripcion
								del curso</label>
							<textarea class="form-control" rows="3" name="descripcion"
								id="descripcion" placeholder="Ej.: bases de datos"></textarea>
							<br /> 
							
							
							<label>Listado del contenido del curso</label>
							<textarea class="form-control" rows="3" name="temario"
								id="temario" placeholder="Ej.: titulos de los temas"></textarea>
							<br /> <label>Listado de secciones del curso</label>
							<textarea class="form-control" rows="3" name="secciones"
								id="secciones" placeholder="Ej.: bloque 1, bloque2,..."></textarea>
							<br /> <label>Listado de lecciones del curso</label>
							<textarea class="form-control" rows="3" name="lecciones"
								id="lecciones" placeholder="Ej.: tema1, tema2,..."></textarea>
							<br /> <label>Imagen del curso</label> <input type="file"
								name="imagen" id="imagen">


						</div>
						<div class="form-group col-lg-1"></div>

						<div class="form-group col-lg-4">

							<label>Precio</label> <input class="form-control" type="number"
								name="precio" id="precio" placeholder="Ej.: 300"> <br />

							<label>Numero de horas</label> <input class="form-control"
								type="number" name="horas" id="horas"
								placeholder="Ej.: 0053 (cuatro digitos)"> <br /> <label>Nombre
								del profesor</label> <input class="form-control" type="text"
								name="profesor" id="profesor" placeholder="Ej.: Pepe"> <br />
							<label>Fecha inicio del curso</label> <input class="form-control"
								type="text" name="f_inicio" id="f_inicio"
								placeholder="Ej: 20/11/2015"> <br /> <label>Fecha
								fin del curso</label> <input class="form-control" type="text"
								name="f_fin" id="f_fin" placeholder="Ej: 01/12/2015"> <br />
							<label>Fecha de cierre del curso</label> <input
								class="form-control" type="text" name="cierre_curso"
								id="cierre_curso" placeholder="Ej: 02/12/2015"> <br /> <label>Categoria
								del curso</label> <input class="form-control" type="text"
								name="categoria" id="categoria" placeholder="Rama del curso">
							<!-- <br /> <label>Dificultad del curso</label> <input
								class="form-control" type="text" name="dificultad"
								id="dificultad" placeholder="Alta, Media o Baja"> <br /> -->
								
								<br /><label id="txtDif" for="dificultad">Dificultad del curso</label>
								<select id="dificultad" name="dificultad" class="form-control">
									<option value="">--Seleccione--</option>
									<option  value="Baja">Baja</option>
									<option  value="Media">Media</option>
									<option  value="Alta">Alta</option>
									
								</select>
<br />
							<input type="checkbox" name="terminos" id="terminos"><label> &nbsp; &nbsp;Acepto los <a data-toggle="modal" data-target="#Modal">t&eacute;rminos</a></label> <label>
								
							</label>
						<!-- Trigger the modal with a button -->

  <!-- Modal -->
  <div class="modal" id="Modal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Terminos y condiciones de creacion de curso</h4>
        </div>
        <div class="modal-body">
          <p>-Para la creacion de un curso en nuestro portal se deberan cumplir las siguientes normas:</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>

						</div>

						<div class="form-group col-lg-12"
							style="margin: 0px 0px 0px 200px">
							<button type="submit" name="accion" id="accion"
								class="btn btn-default">Vista previa</button>
							<button type="reset" class="btn btn-default">Deshacer
								todo</button>
						</div>

					</div>
				</form>


			</div>
		</div>

	</div>

	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>


	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
