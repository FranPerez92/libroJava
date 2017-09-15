package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Leer linea a linea el fichero "data/personas.txt" y mostrar por pantalla.<br>
 * Contar el total de personas leidas.
 * 
 * 
 * @author ur00
 *
 */
public class ListarPersonas {

	public static void main(String[] args) {

		File f = new File("C:\\Desarrollo\\workspace\\JavaLibro\\data\\personas.txt");
		FileReader fr;
		
		String linea;
		int cont =0;
        try {
        	
        	fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			while((linea=br.readLine())!=null) {
					System.out.println(linea);
					cont++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Numero de personas: "+cont);
        
	}
}