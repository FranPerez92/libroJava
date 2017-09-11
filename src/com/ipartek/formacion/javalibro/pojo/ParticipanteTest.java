package com.ipartek.formacion.javalibro.pojo;
import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
	public void testConstrucorVacio() {
		
		Participante p = new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertEquals("https://github.com/", p.getLinkGitHub());
		assertFalse(p.isTrabajador());
		
	}

	public void testConstructor(){
		
		Participante p1 = new Participante("ander" , "anderuraga");
		p1.setEmail("anderuraga@ipartek.com") ;
		
		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("anderuraga@ipartek.com", p1.getEmail());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub());
		assertFalse(p1.isTrabajador());
		
		try {
			Participante matusalem = new Participante("Matu", 235);
			fail("Deberia haber lanzado excepciones");
		} catch (Exception e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
		}
		
	}
	
	public void testExceptionEdad() {
		
		Participante p1 = new Participante("ander" , "anderuraga");
		try {
			p1.setEdad(88) ;
		} catch (ParticipanteException e) {
			fail("No deberia lanzar excepcion con edad 88");
		}
		
		try {
			p1.setEdad(-3);
			fail("Deberia haber lanzado excepciones");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MENO_CERO, e.getMessage());
			assertTrue(true);
		}
		
		try {
			p1.setEdad(101);
			fail("Deberia haber lanzado excepciones");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
			assertTrue(true);
		}
		
	}
}
