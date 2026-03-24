package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> listaLibro;
	private List<Prestamo> listaPrestamo;
	
	public Biblioteca() {
		super();
		this.listaLibro =new ArrayList();
		this.listaPrestamo =new ArrayList();
	}
	
	public void asignarLibro(Libro libro) {
		this.listaLibro.add(libro);
	}
	
	public void asignarPrestamo(Prestamo prestamo) {
		this.listaPrestamo.add(prestamo);
	}
	/**
	 * 
	 * @param isbn
	 * @return
	 */
	public Libro buscarLibro(int isbn) {
		for (Libro libro : listaLibro) {
			if(libro.getIsbn() == isbn)
				return libro;
		}
		return null;
	}
	
	public void listaLibros() {
		for (Libro libro : listaLibro) {
			System.out.println(libro);
		}
	}
	
	public void listaPrestamo() {
		for (Prestamo prestamo : listaPrestamo) {
			System.out.println(prestamo);
		}
	}

	
 
}
