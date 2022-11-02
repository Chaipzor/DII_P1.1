<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dam2.dii.p11.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Listado</title>
</head>
<body>

	<!--  Obtenemos el texto del form.java -->
	<%
		String texto = (String) request.getAttribute("texto");
	%>


	<div class="caja">

		<div class="contenedor">
			<div class="separador"></div>
			<div class="titulo">Listado</div>




			<%
				ArrayList<Usuario> lista = (ArrayList<Usuario>) request.getAttribute("listado");

				if (lista != null) {
			%>
			<ol type="1">
				<%
					for (int i = 0; i < lista.size(); i++) {
				%>
				<li id="listado">
					<%
						out.println(lista.get(i).getNombre());
					%>
				</li>
				<%
					}
				%>
			</ol>
			<%
				}
			%>
			<div class="login-item">
				<form action="<%=request.getContextPath()%>/index.jsp" method="post"
					class="form form-login">
					<div class="form-field">
						<input type="submit" name="botonVolver"
							value="Volver a inicio de sesión">
					</div>
				</form>
			</div>
			<div class="separador"></div>
		</div>
	</div>

</body>
</html>