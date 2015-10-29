<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form onSubmit="return validarCurso(this)" role="form" action="Cursos" method="post">
<input type ="text" name = "action" value="vistaPrevia" style="display:none">


  <div>
 <button type="submit" name= "enviarValidar" id= "enviarValidar">Enviar a validar</button>
 <a href="formularioCurso.jsp">Volver atras</a>
</div>
</form>


</body>
</html>