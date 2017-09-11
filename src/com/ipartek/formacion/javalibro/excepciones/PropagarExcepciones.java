package com.ipartek.formacion.javalibro.excepciones;

public class PropagarExcepciones {

	public static void main(String[] args) {
		comoMarron();
	}
	
	private static void lanzoExcepcion() throws Exception {
		System.out.println("lanzoExcepcion ENTRO");
		throw new Exception();
		//System.out.println("lanzoExcepcion SALGO");
	}

	private static void pasoMarron() throws Exception {
		System.out.println("pasoMarron ENTRO");
		lanzoExcepcion();
		System.out.println("pasoMarron SALGO");
	}
	
	private static void comoMarron() {
		System.out.println("comoMarron ENTRO");
		try {
			pasoMarron();
		} catch (Exception e) {
			System.out.println("Ya me encargo ayo de gestionar la excepcion");
		}
		System.out.println("comoMarron SALGO");
	}

}
