package com.ipartek.formacion.javalibro.pojo;

public class LibroElectronico extends Libro{

	private int tamanyo;
	
	public LibroElectronico(String titulo) {
		super(titulo);
		this.tamanyo = 0;
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}

	@Override
	public String toString() {
		return "LibroElectronico [tamanyo=" + tamanyo + "]";
	}
	
	@Override
	public float getPrecio() {
		float precio=(float) (super.getPrecio()-5);
		return precio;
	}
	
}
