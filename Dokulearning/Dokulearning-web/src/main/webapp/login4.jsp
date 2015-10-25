<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 label{font-weight: bold;}
 .error { color: red;}
</style>
</head>
<body>
<!-- El siguiente ejemplo de JSTL muestra como usar un if-else mediante la libreria cor: si hay atributo mensaje se muestra en color rojo dicho mensaje, en caso contrario un texto par el formulario  -->
<c:choose>
	<c:when test="${not empty mensaje }">
		<p class="error">${mensaje }</p>
	</c:when>
	<c:otherwise>
		<p>Introduce tu usuario y clave para entrar</p>
	</c:otherwise>
</c:choose>
<!-- el siguiente formulario  envia los datos al LoginServlet. Los parametros contienen el atributo name -->
<form action="registroWeb" method="post">


<label for="usuario">Usuario:</label><input type="text" name="correo" id="correo"/><br/>
<label for="password">Password:</label><input type="password" name="clave1" id="clave1" />
<input type="submit" value="Enviar"/>

</form>
</body>
</html>