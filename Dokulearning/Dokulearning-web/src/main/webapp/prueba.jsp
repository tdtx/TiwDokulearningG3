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

<table border="1">
<tr>
<th>nick</th>
<th>nombre</th>
<th>apellido1</th>
<th>apellido2</th>
<th>clave1</th>
<th>clave2</th>
<th>correo</th>
</tr>
<c:forEach items="${registrados }" var="usuario"> <!-- recorremos todos los objetos de la coleccion usuarios y cada objeto devuelto lo asignamos a la variable usuario -->
<tr>
	<td>${usuario.nick }</td> <!-- Usuario es un POJO por lo que podemos acceder a sus propiedades sin necesidad de get/set -->
	<td>${usuario.nombre }</td>
	<td>${usuario.apellido1 }</td>
	<td>${usuario.apellido2 }</td>
	<td>${usuario.clave1 }</td>
	<td>${usuario.clave2 }</td>
	<td>${usuario.correo }</td>
	
</tr>

</c:forEach>
</table>
<p><a href="login.jsp">Volver</a></p>
</div>
</body>
</html>