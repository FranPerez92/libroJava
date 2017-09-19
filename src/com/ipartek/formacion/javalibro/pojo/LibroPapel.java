package com.ipartek.formacion.javalibro.pojo;

public class LibroPapel extends Libro {

	private boolean tapaBlanda;
	
	public LibroPapel(String titulo) {
		
		super(titulo);
		this.tapaBlanda = true;
	}

	public boolean getTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	@Override
	public String toString() {
		return "LibroPapel [tapaBlanda=" + tapaBlanda + "]";
	}
	
	@Override
	public float getPrecio() {
		if(!tapaBlanda) {
			float precio=(float) (super.getPrecio()+1.50);
			return precio;
		}else {
			float precio=(float) (super.getPrecio());
			return precio;
		}
	}
	
}
