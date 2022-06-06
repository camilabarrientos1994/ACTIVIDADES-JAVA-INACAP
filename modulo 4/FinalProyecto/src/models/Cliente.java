package models;

public class Cliente {
	private String nombres;
	private String apellidos;
	private String rut;
	private String mail;
	private String fono;


	public Cliente(String nombres, String apellidos, String rut, String mail, String fono) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.mail = mail;
		this.fono = fono;
		
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getFono() {
		return fono;
	}
	public void setFono(String fono) {
		this.fono = fono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
