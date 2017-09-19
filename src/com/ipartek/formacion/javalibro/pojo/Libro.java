package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Imprimible;
import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class Libro  implements Imprimible, Vendible{

	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.autor = "Anonimo";
		this.paginas = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/*
	 * Se puede acceder desde la propia clase
	 * , desde el mismo "package" o desde otro y
	 *  desde cualquier "subclase" o "Clase Hija",
	 *   pero no se puede ver desde una clase de otro "package".
	 */
	protected void metodoProtegido() {
		System.out.println("Metodo protegido");
	}
	
	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}
	
	void imprimir() {
		System.out.println("Imprimiendo");
	}

	@Override
	public float getPrecio() {
		float precio=(float) (this.paginas*0.02);
		return precio;
	}
	
}
