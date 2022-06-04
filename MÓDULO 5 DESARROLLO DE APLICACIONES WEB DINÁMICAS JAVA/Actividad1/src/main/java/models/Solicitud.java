package models;

import java.sql.Date;
import java.util.UUID;

public class Solicitud {
	private String id;
	private String nombre;
	private String telefono;
	private String direccion;
	private String tipo;
	private String fecha;
	private String actualizacion;
	private String comentario;
	
	public Solicitud(String nombre, String telefono, String direccion, String tipo, String fecha, String actualizacion,String comentario) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.tipo = tipo;
		this.fecha = fecha;
		this.actualizacion = actualizacion;
		this.comentario = comentario;
		generarId();
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Solicitud(String nombre, String telefono, String direccion, String tipo, String fecha) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.tipo = tipo;
		this.fecha = fecha;
		generarId();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getActualizacion() {
		return actualizacion;
	}
	public void setActualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
	}
	public void generarId(){
	    UUID uuid = UUID.randomUUID();
	    this.id = uuid.toString();
	}


}
