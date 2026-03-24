package Biblioteca;

public class Estudiante {
	private String nombre;

	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " Nombre " + nombre;
	}
	
}
