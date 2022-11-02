<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
<p>Las contraseñas no coinciden.</p>
<p>Vuelva a intentarlo: </p>

<form action="<%=request.getContextPath()%>/form" method="post">
		<input type="text" name="nombre" placeholder="Introduce tu usuario">
		<br/>
		<br/>
		<input type="password" name="pass" placeholder="Introduce tu contraseña">
		<br/>
		<br/>
		<input type="password" name="pass2" placeholder="Confirma la contraseña">
		<br/>
		<br/>
		<input type="submit" name="boton" value="Enviar">
	</form>
	
</body>
</html>