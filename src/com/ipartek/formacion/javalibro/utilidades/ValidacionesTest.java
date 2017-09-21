package com.ipartek.formacion.javalibro.utilidades;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {

	public void testEmail() {
		
		assertFalse(Validaciones.email(""));
		assertFalse(Validaciones.email("a@gmail.e"));
		assertFalse(Validaciones.email("a@gmailcom"));
		assertFalse(Validaciones.email("a@.com"));
		assertFalse(Validaciones.email("agmail.com"));
		assertFalse(Validaciones.email(null));
		assertTrue(Validaciones.email("a@gmail.com"));
	}

	public void testDni() {
		
		assertFalse(Validaciones.dni(""));
		assertFalse(Validaciones.dni("12332e12f"));
		assertFalse(Validaciones.dni("12332112"));
		assertFalse(Validaciones.dni("1233212f"));
		assertFalse(Validaciones.dni("123123"));
		assertFalse(Validaciones.dni(null));
		
		assertTrue(Validaciones.dni("12345678f"));
	}
	
	public void testEdad() {
		assertFalse(Validaciones.edad(0));
		assertFalse(Validaciones.edad(2));
		
		assertTrue(Validaciones.edad(25));
	}
	
	public void testLongitud() {
		
		String[] parts = {"1","2","3","4","5","6","7"};
		String[] parts2 = {"1","2","3","4","5","6"};
		String[] parts3 = {"1","2","3","4"};
		
		assertFalse(Validaciones.longitud(parts2));
		assertFalse(Validaciones.longitud(parts3));
		
		assertTrue(Validaciones.longitud(parts));
	}
	
}
