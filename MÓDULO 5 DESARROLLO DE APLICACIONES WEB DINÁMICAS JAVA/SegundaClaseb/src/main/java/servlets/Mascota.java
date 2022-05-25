package servlets;

public class Mascota {

	private String nombre;
	private String especie;
	private int edad;
	private boolean vacuna;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isVacuna() {
		return vacuna;
	}
	public void setVacuna(boolean vacuna) {
		this.vacuna = vacuna;
	}
	public Mascota(String nombre, String especie, int edad, boolean vacuna) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.vacuna = vacuna;
	}
}
