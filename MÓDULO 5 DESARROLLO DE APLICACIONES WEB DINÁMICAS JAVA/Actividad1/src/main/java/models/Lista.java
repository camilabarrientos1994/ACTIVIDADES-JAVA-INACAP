package models;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<Solicitud> lista;
	
	public Lista(List<Solicitud> lista) {
		super();
		this.lista = lista;
	}
	
	public Lista() {
		lista = new ArrayList();
	}

	public List<Solicitud> getLista() {
		return lista;
	}

	public void setLista(List<Solicitud> lista) {
		this.lista = lista;
	}
	
	public Solicitud buscar(Solicitud solicitud) {
		for(Solicitud s :getLista()) {
			if(s.equals(solicitud) ) {
				return s;
			}
		}return null;
	}
	public Solicitud buscarId(String id) {
		for(Solicitud s :getLista()) {
			if(s.getId().equals(id) ) {
				return s;
			}
		}return null;
	}
	public boolean agregar(Solicitud solicitud) {
		if(buscar(solicitud) == null) {
			return getLista().add(solicitud);
		}else {
			return false;
		}
	}



}
