package dam2.dii.p11;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		// Utilizamos un objeto de "base de datos" para poder almacenar los usuarios y añadir nuevos.
		Almacen almacen = new Almacen();

		String texto;
		int contador = 0;
		boolean repetir = false;
		boolean existe = false;
		boolean passCorrectas = false;

		String referencia = "/jsp/saludo.jsp";
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");

		do { 
			// Si el nombre introducido existe.
		if(nombre.equals(almacen.getListaUsuarios().get(contador).getNombre())) {
			existe = true;
			// Si las contraseñas coinciden a la vez que el nombre.
			if(almacen.getListaUsuarios().get(contador).comprobarPass(pass, pass2)) {
				passCorrectas = true;
			}
		}
		contador++;
	}while(almacen.getListaUsuarios().size()>contador);
		
		if(existe && passCorrectas)
			texto = "Hola " + nombre;
		
		else if(existe && !passCorrectas) {
			texto = "Contraseñas incorrectas. Vuelva a intentarlo.";
			repetir = true;
			referencia = "/index.jsp";
		} 
		// Si el usuario no existe vamos al formulario de registro de usuarios.
		else {
			texto = "El usuario no existe. Registro:";
			referencia = "/jsp/registro.jsp";
		}		

		request.setAttribute("repetir", repetir);
		request.setAttribute("texto", texto);
		request.getRequestDispatcher(referencia).forward(request, response);
	}

}
