package com.ipartek.formacion.javalibro.colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		
		HashSet<String> listaNombres = new HashSet<String>();
		
		listaNombres.add("Manolo");
		listaNombres.add("Manola");
		listaNombres.add("Manolito");
		listaNombres.add("Manolita");
		listaNombres.add("Manuel");
		
		//Es mas optimo para recorrec colecciones que un for
		Iterator it = listaNombres.iterator();
		String nombre = "";
		while(it.hasNext()) {
			nombre = (String)it.next();
			System.out.println(nombre);
		}
		
		//Para ordenar
		//listanombres
		
	}

}
