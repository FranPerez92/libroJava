package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 * 
 * @author ur00
 *
 */
public class CrearFicheroYdirectorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		String valor = "";
		boolean continuar = true;

		File f = new File("C:\\Desarrollo\\workspace\\JavaLibro\\");
		do {
			System.out.println("Nombre de la carpeta: ");
			valor = sc.nextLine();
			f = new File("C:\\Desarrollo\\workspace\\JavaLibro\\" + valor);
			if (!f.exists()) {
				f.mkdir();
			} else {
				System.out.println("Esa carpeta ya existia");
			}
			System.out.println("Nombre del fichero: ");
			valor = sc.nextLine();
			f = new File(f + "\\" + valor + ".txt");
			try {
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);

				boolean linea = true;
				do {
					System.out.println("Texto del fichero: ");
					valor = sc.nextLine();
					bw.write(valor.toString());
					bw.newLine();
					//System.getProperty("line.separator");
					System.out.println("¿Quieres meter mas lineas?: s para continuar ");
					valor = sc.nextLine();
					if (!"s".equals(valor.toString().toLowerCase())) {
						linea = false;
					}
					
				} while (linea);

			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					bw.close();
					fw.close();
				} catch (IOException e) {
					System.out.println("No se puede cerrar el buffer y el writer");
				}
			}

			System.out.println("¿Quieres meter mas carpetas?: s para continuar ");
			valor = sc.nextLine();
			if (!"s".equals(valor.toString().toLowerCase())) {
				continuar = false;
			}

		} while (continuar);

	}
}