package com.ipartek.formacion.javalibro.colecciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

/**
 * Cargamos en memoria los datos de las Personas del fichero personas.txt.<br>
 * La carga en memoria lo vamos a realizar con dos colecicones para ver cual es
 * mas optima para listar y buscar.<br>
 * Las colecicones que vamos a usar son ArrayList<Persona> y HasMap<String,
 * Persona>.<br>
 * 
 * Despues de cargar en memoria haremos una busqueda por el DNI 26779063W.
 * 
 * 
 * @author ur00
 *
 */
public class SubsanarFicherosPersonasFranPerez {

	static final String PATH_FICHERO_PERSONAS = "data\\personas.txt";
	static final String PATH_FICHERO_PERSONAS_CORRECTAS = "data\\personasCorrectas.txt";
	static final String PATH_FICHERO_PERSONAS_INCORRECTAS = "data\\personasIncorrectas.txt";

	static final int NUM_CAMPOS_LINEA = 7;
	static final int CAMPOS_NOMBRE = 0;
	static final int CAMPOS_APE1 = 1;
	static final int CAMPOS_APE2 = 2;
	static final int CAMPOS_EDAD = 3;
	static final int CAMPOS_MAIL = 4;
	static final int CAMPOS_DNI = 5;
	static final int CAMPOS_ROL = 6;

	public static void main(String[] args) {

		cargaHahsMap();

	}

	private static void cargaHahsMap() {
		HashMap<String, Persona> mapa = new HashMap<String, Persona>();
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fwInco = null;
		BufferedWriter bwInco = null;

		try {

			fr = new FileReader(PATH_FICHERO_PERSONAS);
			br = new BufferedReader(fr);

			fwInco = new FileWriter(PATH_FICHERO_PERSONAS_INCORRECTAS);
			bwInco = new BufferedWriter(fwInco);

			String linea = "";
			Persona p = null;
			String[] campos;
			while ((linea = br.readLine()) != null) {

				campos = linea.split(",");
				if (campos.length == NUM_CAMPOS_LINEA) {
					try {
						p = mapeoLinea(campos);
						mapa.put(p.getDni(), p);
					} catch (Exception e) {
						// System.out.println("LINEA INCORECTA: " + linea);
						try {
							bwInco.write(linea);
							bwInco.newLine();
							bwInco.flush();
						} catch (IOException e2) {
							System.out.println("No se puede escribir en el fichero");
							e.printStackTrace();
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fwInco.close();
				bwInco.close();
			} catch (IOException e2) {
				//System.out.println("No se puede cerrar el buffer y el writer");
			}
		}

		// recorrer de uno en uno para ver cuanto tarda
		long inicio = System.currentTimeMillis();

		Collection cole = mapa.values();
		Iterator<Persona> it = cole.iterator();
		Persona pIteracion = null;

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(PATH_FICHERO_PERSONAS_CORRECTAS);
			bw = new BufferedWriter(fw);
			String texto = "";

			while (it.hasNext()) {

				pIteracion = it.next();
				texto = pIteracion.getNombre() + "," + pIteracion.getApellido1() + "," + pIteracion.getApellido2() + ","
						+ pIteracion.getEdad() + "," + pIteracion.getEmail() + "," + pIteracion.getDni() + "," + pIteracion.getRol();

				bw.write(texto);
				bw.newLine();
				bw.flush();

			}

		} catch (IOException e) {
			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el buffer y el writer");
			}
		}
	}

	private static Persona mapeoLinea(String[] campos) throws NumberFormatException, PersonaException {

		Persona p = new Persona(campos[CAMPOS_NOMBRE], campos[CAMPOS_APE1], campos[CAMPOS_APE2], campos[CAMPOS_MAIL],
				campos[CAMPOS_DNI], campos[CAMPOS_ROL], Integer.parseInt(campos[CAMPOS_EDAD]));
		return p;
	}

}