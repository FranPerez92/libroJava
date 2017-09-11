package com.ipartek.formacion.javalibro.pojo;

public class Cancion {

	//Variable
	private String titulo;
	private String artista;
	private int duracion;
	
	//Constructores
	public Cancion() {
		super();
		this.titulo="";
		this.artista="";
		this.duracion=0;
	}

	public Cancion(String titulo, String artista, int duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}
	
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Canciones [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + "]";
	}
	
	

}
