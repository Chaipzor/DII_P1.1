<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Saludo</title>
</head>
<body>

	<!--  Obtenemos el texto del form.java -->
	<% String texto = (String) request.getAttribute("texto");%>


	<div class="caja">

		<div class="contenedor">
			<div class="separador"></div>
			<div class="titulo">
				<%out.println(texto); %>
			</div>
			<div class="login-item">
                <form action="<%=request.getContextPath()%>/listar" method="post" class="form form-login">
                    <div class="form-field">
                        <input type="submit" name="boton" value="Ver listado de usuarios.">
                    </div>
                </form>
            </div>
            <div class="separador"></div>
        </div>
    </div>

</body>
</html>