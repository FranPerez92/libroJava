package com.ipartek.formacion.javalibro.pojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PersonaHash {

	public static void main(String[] args) {

		/*
		 * hacer aplicacion que carge todas las personas en un arraylist y por pantalla
		 * diga lo que tarda y luego en un hasmap, buscar 26779063W
		 */

		HashSet<Persona> listaNombres = new HashSet<Persona>();
		ArrayList<Persona> listaNombresA = new ArrayList<Persona>();
		Persona persona = null;
		boolean lineaBien = true;

		File f = new File("data\\personas.txt");
		FileReader fr;

		String linea;
		try {

			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {
				lineaBien = true;
				String[] parts = linea.split(",");

				if (parts.length == 7) {

					String part0 = parts[0];
					String part1 = parts[1];
					String part2 = parts[2];
					String part3 = parts[3];
					String part4 = parts[4];
					String part5 = parts[5];
					String part6 = parts[6];

					int part3Int = Integer.parseInt(part3);
					
					lineaBien=comprobarCamposVacios(parts);

					if (lineaBien = true) {
						try {
							persona = new Persona(part0, part1, part2, part6, part4, part5, part3Int);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// Meter en el hash
						listaNombres.add(persona);
						// Meter en el arrayList
						listaNombresA.add(persona);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// hasmap.values();
		Iterator it = listaNombres.iterator();
		String nombre = "";
		int cont = 0;
		double startTimeSeconds = (double) System.currentTimeMillis() / 1000;
		while (it.hasNext()) {
			persona = (Persona) it.next();
			// System.out.println(persona);
		}
		System.out.println("Tiempo en leer de hash: ");
		System.out.println(tiempoUsado(startTimeSeconds));

		it = listaNombresA.iterator();
		nombre = "";
		startTimeSeconds = (double) System.currentTimeMillis() / 1000;
		while (it.hasNext()) {
			persona = (Persona) it.next();
			if ("26779063W".equals(persona.getDni())) {
				System.out.println("DNI 26779063W encontrado en el registro: " + cont);
			}
			cont++;
			// System.out.println(persona);
		}
		System.out.println("Tiempo en leer de arrayList: ");
		System.out.println(tiempoUsado(startTimeSeconds));
	}

	private static double tiempoUsado(double startTimeSeconds) {
		return (System.currentTimeMillis() - startTimeSeconds) / 1000l;
	}

	private static boolean comprobarCamposVacios(String[] parts) {
		
		for (int i = 0; i < parts.length; i++) {
			if ("".equals(parts[i])) {
				return false;
			}
		}
		
		return true;
	}

}
