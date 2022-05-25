package modelo;

import java.util.ArrayList;
import java.util.List;


public class RegistroVehiculo { //solid

	public RegistroVehiculo(List<Auto> lista) {
		super();
		this.lista = lista;
	}
	public RegistroVehiculo() {
           lista = new ArrayList();  
	}


	private List<Auto> lista;

	public List<Auto> getLista() {
		return lista;
	}

	public void setLista(List<Auto> lista) {
		this.lista = lista;
	}
	
	public boolean agregar(Auto auto) {
		if(buscar(auto.getPatente()) == null) {
			return getLista().add(auto);
		}
		else {
			return false;
		}
	}
	
	
	public Auto buscar(String patente) {
		for(Auto a: getLista()) {
			if(a.getPatente().equals(patente)) {
				return a;
			}
		} return null;
	}
	public boolean eliminar(String patente) {
		return getLista().remove(buscar(patente));
	}
	
	public void modificar(Auto auto) {
		int pos = getLista().indexOf(buscar(auto.getPatente()));
		getLista().set(pos,auto);
	}
}
