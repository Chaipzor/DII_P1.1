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
@WebServlet("/listar")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Listar() {
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
		ArrayList<Usuario> listado = new ArrayList<>();
		int contador = 0;
		
		do {
			listado = almacen.getListaUsuarios();
			contador++;
		}while(almacen.getListaUsuarios().size()>contador);

		request.setAttribute("listado", listado);
		request.getRequestDispatcher("/jsp/listar.jsp").forward(request, response);
	}
}
