<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>index</title>
</head>
<body>

<% 
String texto;
// El título del formulario será "Inicio de sesión" a menos que recibamos otro texto de form.
if(request.getAttribute("texto")!=null)
	texto = (String) request.getAttribute("texto");
else
	texto = "Inicio de sesión";

 %>

	<div class="caja">

        <div class="contenedor">
            <div class="separador"></div>
            <div class="titulo"><%out.println(texto); %></div>
            <div class="login-item">
                <form action="<%=request.getContextPath()%>/form" method="post" class="form form-login">
                    <div class="form-field">

                        <label class="user" for="login-username"></label>
                        <input name="nombre" id="login-username" type="text" class="form-input" placeholder="Usuario" required>
                    </div>

                    <div class="form-field">
                        <label class="lock" for="login-password"></label>
                        <input name="pass" id="login-password" type="password" class="form-input" placeholder="Primera contraseña" required>
                    </div>
                    
                    <div class="form-field">
                        <label class="lock" for="login-password"></label>
                        <input name="pass2" id="login-password" type="password" class="form-input" placeholder="Segunda contraseña" required>
                    </div>

                    <div class="form-field">
                        <input type="submit" name="boton" value="Acceder">
                    </div>
                </form>
            </div>
            <div class="separador"></div>
        </div>
    </div>
	
</body>
</html>