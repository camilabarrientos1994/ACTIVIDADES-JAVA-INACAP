package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Ficha {
//	private List<Object> todo;
//	private String id;
//	
//	public Ficha(Cliente cli,Auto a,Mantencion m,Fecha f) {
//		super();
//		generarId();
//	}
//	public Ficha(Cliente cli) {
//		super();
//		generarId();
//	}
//
//	public void generarId(){
//	    UUID uuid = UUID.randomUUID();
//	    String id= uuid.toString();
//	    this.id = id;
//	}
//	
	private ArrayList<Cliente> clientes;

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Ficha(ArrayList<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}
	public boolean buscar(Cliente cli) {
		if(clientes.contains(cli)) {
			return true;
		}return false;
	}
}
