package dam2.dii.p11;

import java.util.ArrayList;
import java.util.Arrays;

public class Almacen {
	// Inicializamos con 3 usuarios.
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>() {{
			add(new Usuario("Juan","1","2"));
			add(new Usuario("Alberto","asd","asdf"));
			add(new Usuario("Ernesto","11","22"));
	}};

	public Almacen() {
		super();
	}

	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Usuario usuario) {
		this.listaUsuarios.add(usuario);
	}

}
