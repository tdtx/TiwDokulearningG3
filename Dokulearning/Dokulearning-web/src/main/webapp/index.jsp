<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
	<c:when test="${not empty mensaje }">
		<h1>${mensaje}</h1>
	</c:when>
	<c:otherwise>
		<h1>Hello World!</h1>
	</c:otherwise>
</c:choose>
    </body>
</html>