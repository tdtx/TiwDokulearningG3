<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Crear Curso</title>

  <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<script src="js/validarCurso.js"> </script>

</head>
<body>

<h1><%="Formulario de Cursos" %></h1>


<div id="page-wrapper">

            <div class="container-fluid">
<div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Introducir datos del curso
                        </h1>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">


<form role="form" action="Cursos" method="post">
<br/>
<div class="form-group">
<label for="nom">Nombre de curso </label>
<input class="form-control" type="text" id="nom" name="nom" /></br>
</div>
<br/>
 <div class="form-group">
<label for="rama">Campo de enseñanza</label>
<input class="form-control" type="text" name="rama" id="rama" />
<c:choose>
	<c:when test="${not empty mensaje }">
		<p class="error">${mensaje }</p>
	</c:when>
	<c:otherwise>
		<br/>
	</c:otherwise>
</c:choose>

 </div>
 
 <br/>
<div class="form-group">
<label>Descripcion del curso</label>
<textarea class="form-control" rows="3" type="text" name="descripcion" id="descripcion"></textarea>
</div>
<br/>
  <div class="form-group">
                                <label>Text area</label>
                                <textarea class="form-control" rows="3"></textarea>
                            </div>

 <br/>
 <div class="form-group">
<label>Listado del contenido del curso</label>
<textarea class="form-control" rows="3" type="text" name="temario" id="temario"></textarea>
</div>
<br/>
 
 <div class="form-group">
<label>Precio</label>
<input class="form-control" type="number" name="precio" id="precio">
</div>
<br/>
 
 <div class="form-group">
<label>Numero de horas</label>
<input class="form-control" type="number" name="horas" id="horas">
</div>
<br/>

 <div class="form-group">
<label>Nombre del profesor</label>
<input class="form-control" type="text" name="profesor" id="profesor"> 
</div>
<br/>
 <div class="form-group">
<label>Fecha inicio del curso</label>
<input class="form-control" type="text" name="f_inicio" id="f_inicio">
</div>
<br/>
 <div class="form-group">
<label>Fecha fin del curso</label>
<input class="form-control" type="text" name="f_fin" id="f_fin">
</div>
<br/>
 <div class="form-group">
<label>Fecha de cierre del curso</label>
<input class="form-control" type="text" name="cierre_curso" id="cierre_curso">
</div>
<br/>


<div class="form-group">
<label>Imagen del curso</label>
<input type="file" name="imagen" id="imagen">
</div>
<br/>
<br/>
<div class="form-group">
                                <label>Acepta los terminos de creacion de curso</label>
                                <label class="checkbox-inline">
                                    <input type="checkbox" name="terminos" id="terminos">
</div>                                </label>
	
                            <div>
                            <button type="submit" name= "accion" id= "accion" class="btn btn-default">Enviar</button>
                            <button type="reset" class="btn btn-default">Deshacer todo</button>
							</div>
                        </form>  
                            </div>
                </div>
                  </div>
                  </div>      
                        
</body>
</html>