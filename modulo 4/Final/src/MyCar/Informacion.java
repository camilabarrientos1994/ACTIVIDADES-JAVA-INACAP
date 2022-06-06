package MyCar;

import java.util.Date;
import java.util.ArrayList;

public class Informacion {
	private Cliente cliente;
	private Auto auto;
	private Date fecha;
	private Mantencion mantencion;
//	private ArrayList<Object> datos = new ArrayList<Object>();
	
	Informacion(Cliente cliente,Auto auto,Date date,Mantencion mantencion){
		this.cliente = cliente;
		this.auto=auto;
		this.fecha=date;
		this.mantencion= mantencion;
	
	}
	Informacion(Cliente cliente,Auto auto,Date date){
			this.cliente=cliente;
			this.auto=auto;
			this.fecha=date;
		}
		
	Informacion(Cliente cliente,Date date){
		this.cliente=cliente;
		this.fecha=date;
	}
	Informacion(Cliente cliente){
		this.cliente=cliente;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Mantencion getMantencion() {
		return mantencion;
	}
	public void setMantencion(Mantencion mantencion) {
		this.mantencion = mantencion;
	}
	

}
