package MyCar;

import java.util.Date;

public class Auto {
	
	private String ppu;
	private String marca;
	private String modelo;
	private int fabricacion;
	

	public Auto(String ppu, String marca, String modelo, int fabricacion) {
		super();
		this.ppu = ppu;
		this.marca = marca;
		this.modelo = modelo;
		this.fabricacion = fabricacion;
		
	}
	
	
	public String getPpu() {
		return ppu;
	}
	public void setPpu(String ppu) {
		this.ppu = ppu;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}
	

}
