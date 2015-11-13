<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">



<body>

    
	<jsp:include page="header.jsp"></jsp:include>

    <div class="container">

        

        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">Formulario de
                        <strong>contacto</strong>
                    </h2>
                    <hr>
                    <form role="form">
                        <div class="row">
                            <div class="form-group col-lg-4">
                                <label>Nombre</label>
                                <input type="text" class="form-control" placeholder="ej.: David">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Correo electonico</label>
                                <input type="email" class="form-control" placeholder="ej.: algo@algo.es">
                            </div>
                            <div class="form-group col-lg-4">
                                <label>Numero de telefono</label>
                                <input type="tel" class="form-control" placeholder="9 digitos">
                            </div>
                            <div class="clearfix"></div>
                            <div class="form-group col-lg-12">
                                <label>Mensaje</label>
                                <textarea class="form-control" rows="6"></textarea>
                            </div>
                            <div class="form-group col-lg-12">
                                <input type="hidden" name="save" value="contact">
                                <button type="submit" class="btn btn-default">Enviar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
    <!-- /.container -->

          <jsp:include page="footer.jsp"></jsp:include>
   

</body>

</html>
	