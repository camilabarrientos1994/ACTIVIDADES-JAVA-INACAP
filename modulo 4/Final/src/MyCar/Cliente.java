package MyCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String rut;
	private String email;
	private String fono;

	Scanner sc = new Scanner(System.in);
	
	public Cliente() {}
	
	
	public Cliente(String nombre1, String nombre2, String apellido1, String apellido2, String rut, String email,
			String fono) {
		super();
		
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.rut = rut;
		this.email = email;
		this.fono = fono;
		
//		registrarCliente();
	}
	
//	public void registrarCliente() {
//		 Informacion info = new Informacion();
//	}

	public void  datos() {
		System.out.println("****datos cliente registrado:************************************************************************************");
		System.out.println("nombre completo: " +this.nombre1+" "+ this.nombre2+" "+this.apellido1+" "+this.apellido2);
		System.out.println("rut: "+this.rut);
		System.out.println("email: "+this.email);
		System.out.println("fono: "+this.fono);
		System.out.println("******************************************************************************************************");

	}
	public String listaDatos() {
		return "nombre completo: " +this.nombre1+" "+ this.nombre2+" "+this.apellido1+" "+this.apellido2+" rut: "+this.rut+" email: "+this.email+ " fono: "+this.fono;

	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFono() {
		return fono;
	}
	public void setFono(String fono) {
		this.fono = fono;
	}


//	public void setClientes(Cliente cli) {
//		for(int i=0;i<Cliente.clientes.size();i++) {
//			if(clientes.get(i).rut.equals(cli.getRut())) {
//				System.out.println("El cliente ya existe");
//			}else {
//				clientes.add(cli);
//				System.out.println("Cliente creado con exito");

//			}
//		}
		
//	}

	

}
