package MyCar;

public class Mantencion {
	public Mantencion(String mantencionDetalle, String observacion, float monto) {
		super();
		this.mantencionDetalle = mantencionDetalle;
		this.observacion = observacion;
		this.monto = monto;
	}
	private String mantencionDetalle;
	private String observacion;
	private float monto;
	public String getMantencionDetalle() {
		return mantencionDetalle;
	}
	public void setMantencionDetalle(String mantencionDetalle) {
		this.mantencionDetalle = mantencionDetalle;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	

}
