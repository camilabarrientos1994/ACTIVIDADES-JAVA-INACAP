package models;

public class Mantencion {

	private String mantencion;
	private String observacion;
	private int precio;
	public Mantencion(String mantencion, String observacion, int precio) {
		super();
		this.mantencion = mantencion;
		this.observacion = observacion;
		this.precio = precio;
	}
	public String getMantencion() {
		return mantencion;
	}
	public void setMantencion(String mantencion) {
		this.mantencion = mantencion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
