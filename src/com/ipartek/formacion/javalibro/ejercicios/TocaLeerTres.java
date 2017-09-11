package com.ipartek.formacion.javalibro.ejercicios;
import junit.framework.TestCase;


public class TocaLeerTres extends TestCase {

	int numAleatorio= -1;
	boolean [] aCheck = new boolean[15];
	
	public void testGenerarNumeroAleatorio() {
		for (int i = 0; i < 1000; i++) {
			
			numAleatorio = TocaLeer.generarNumeroAleatorio(15);
			aCheck[numAleatorio] = true;
			
		}
	
	
	//comprobar que todas las posiciones sean true
	for (int i = 0; i < aCheck.length; i++) {
		assertTrue(aCheck[i]);
	}
	
	}

}
