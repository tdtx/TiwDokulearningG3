<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Iniciar sesion</title>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link href="css/dialogo.css" rel="stylesheet" type="text/css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
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
                                                            <br>
                                                            <div class="row">
                                                                <div class="form-group col-md-1"></div>
                                                                <div class="form-group col-md-5" id="columnas62">
                                                                    <label for="apellido1R">Apellido 1 </label> <input type="text"
                                                                        class="form-control" id="apellido1R" name="apellido1R"
                                                                        value="${registrado.apellido1}">
                                                                </div>
                                                                <div class="form-group col-md-5">
                                                                    <label for="apellido2R">Apellido 2</label> <input
                                                                        type="text" class="form-control" id="apellido2R"
                                                                        name="apellido2R" 
                                                                        value="${registrado.apellido2}">
                                                                </div>
                                                            </div>
                                                            <br>
                                                            <div class="row">
                                                                <div class="form-group col-md-1"></div>
                                                                <div class="form-group col-md-5" id="columnas62">
                                                                    <label for="correoR">Correo </label> <input type="text"
                                                                        class="form-control" id="correoR" name="correoR"
                                                                        value="${registrado.correo}">
                                                                </div>
                                                                <div class="form-group col-md-5">
                                                                    <label for="fechaNcR">Fecha de nacimiento</label> <input
                                                                        type="text" class="form-control" id="fechaNcR"
                                                                        name="fechaNcR" 
                                                                        value="${registrado.fechaNc}">
                                                                </div>
                                                            </div>
                                                            <br>
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
</body>
</html>
       