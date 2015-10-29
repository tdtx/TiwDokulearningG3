<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error{color:red;}
</style>
</head>
<body>
<!-- Inclusión de una cabecera que muestra/oculta la opción Logout -->

<table border="1">
<tr>
<th>telefono</th>
<th>calle</th>
<th>localidad</th>
<th>codigopostal</th>
<th>provincia</th>
<th>DNI</th>
<th>fechaNacimiento</th>
</tr>
<c:forEach items="${matriculados }" var="usuario"> <!-- recorremos todos los objetos de la coleccion usuarios y cada objeto devuelto lo asignamos a la variable usuario -->
<tr>
	<td>${usuario.telefono }</td> <!-- Usuario es un POJO por lo que podemos acceder a sus propiedades sin necesidad de get/set -->
	<td>${usuario.calle }</td>
	<td>${usuario.localidad }</td>
	<td>${usuario.codigoPostal }</td>
	<td>${usuario.provincia }</td>
	<td>${usuario.DNI }</td>
	<td>${usuario.fechaNacimiento }</td>
</tr>

</c:forEach>
</table>

</body>
</html>