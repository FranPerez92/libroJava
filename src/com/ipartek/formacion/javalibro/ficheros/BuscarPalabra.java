package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma recursiva los ficheros,
 * hasta encontrar dentro de un .txt la palabra "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 * @author ur00
 *
 */
public class BuscarPalabra {
	
	static File f = new File("C:\\Desarrollo\\workspace\\JavaLibro\\data\\buscatesoro");
	static FileReader fr = null;
	static BufferedReader br = null;

	public static void main(String[] args) {
		
		
		listarDirectorio(f, "----");
		
	}
	
	public static void listarDirectorio(File directorio, String separador){
		File[] ficheros = directorio.listFiles();
		for (int x=0;x<ficheros.length;x++){			
			//System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()){
				String nuevo_separador;
				nuevo_separador = separador + "----";
				listarDirectorio(ficheros[x],nuevo_separador);
			}else {
				try {
					String ruta = f.getPath();
					File nuevaRuta = new File(ficheros[x].getPath());
					fr=new FileReader(nuevaRuta);
					br = new BufferedReader(fr);
					
					String linea;
			         try {
						while((linea=br.readLine())!=null) {
							if (linea.contains("osobuko")) {
								System.out.println("Encontrado en: "+nuevaRuta);
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

}
