package models;

public class Auto {

	private String ppu;
	private String marca;
	private String modelo;
	private int anio;

	public Auto(String ppu, String marca, String modelo, int anio) {
		super();
		this.ppu = ppu;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
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
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
}
