package com.ipartek.formacion.javalibro.utilidades;

import com.ipartek.formacion.javalibro.pojo.Libro;
import com.ipartek.formacion.javalibro.pojo.LibroElectronico;
import com.ipartek.formacion.javalibro.pojo.LibroPapel;

import junit.framework.TestCase;

public class UtilidadesLibrosTest extends TestCase {
	
	public void test() {	
	
	Libro l = new Libro("100 años de soledad");
	l.setAutor("Gabriel Garcia");
	l.setPaginas(307);
	
	float precioL =l.getPrecio();
	
	assertEquals(6.14f, precioL);
	
	LibroElectronico le = new LibroElectronico("Años salvajes");
	le.setAutor("William Finnegan");
	le.setTamanyo(23);
	le.setPaginas(523);
	
	float precioLe =le.getPrecio();
	
	assertEquals(5.46f, precioLe);
	
	LibroPapel lp = new LibroPapel("PAPILLON");
	lp.setAutor("CHARRIERE, HENRI");
	lp.setTapaBlanda(false);
	lp.setPaginas(307);
	
	float precioLp =lp.getPrecio();
	
	assertEquals(7.64f, precioLp);
	
	}
}
