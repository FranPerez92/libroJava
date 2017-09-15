package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

public class ListarCanciones {

	/**
	 * Listar todas las canciones de la carpeta c:/desarrollo/Music
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Listado de musica");
		File f = new File("C:\\Desarrollo\\Music");
		/*File [] lista = f.listFiles();
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("["+lista[i].getName()+"]");
			if(lista[i].isDirectory()) {
				File f2 = new File(lista[i]+"\\");
				File [] lista2 = f2.listFiles();
				for (int j = 0; j < lista2.length; j++) {
					if(lista2[j].isFile()) {
						System.out.println("	["+lista2[j].getName()+"]"+" bytes: "+lista2[j].length()/1024);
					}else {
						System.out.println("	["+lista[i].getName()+"]");
					}
				}
			}
		}*/
		listarDirectorio(f, "----");
	}
	
	public static void listarDirectorio(File directorio, String separador){
		File[] ficheros = directorio.listFiles();
		for (int x=0;x<ficheros.length;x++){			
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()){
				String nuevo_separador;
				nuevo_separador = separador + "----";
				listarDirectorio(ficheros[x],nuevo_separador);
			}
		}
		}
	
}
