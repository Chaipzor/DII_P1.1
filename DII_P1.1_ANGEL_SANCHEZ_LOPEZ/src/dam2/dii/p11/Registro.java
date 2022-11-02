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
@WebServlet("/registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registro() {
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
		boolean existe = false;
		
		String referencia = "/jsp/registro.jsp";
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");

		do {
			// Si el nombre introducido existe.
			if(nombre.equals(almacen.getListaUsuarios().get(contador).getNombre())) {
				existe = true;
			}
			contador++;
		}while(almacen.getListaUsuarios().size()>contador);
		if(existe) {
			texto = "El usuario " + nombre + " ya existe";
			request.setAttribute("texto", texto);
		} else {
			Usuario usuario = new Usuario(nombre,pass,pass2);
			almacen.setListaUsuarios(usuario);
			referencia = "/jsp/saludo.jsp";
			texto = "Hola " + nombre;
			request.setAttribute("texto", texto);
		}
		
		request.getRequestDispatcher(referencia).forward(request, response);
	}
}
