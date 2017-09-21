package com.ipartek.formacion.javalibro.pojo;

public class Cancion {

	
	private String nombre;
	private String artista;
	private String duracion;
	private long id;
	private String tipo;
	private String anyo;
	
	public Cancion(String nombre, String artista, String duracion, String tipo, String anyo) {
		super();
		this.id = -1;
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
		this.tipo= tipo;
		this.anyo = anyo;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getAnyo() {
		return anyo;
	}



	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}



	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + ", id=" + id
				+ ", tipo=" + tipo + ", anyo=" + anyo + "]";
	}
	
	
}