package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesString {
	
	/**
	 * Cuenta las palabras que esten contenidas dentro del 'texto'
	 * @param texto String donde buscar las palabras
	 * @param busqueda String palabra que buscamos dentro del 'texto'
	 * @return int 0 si no encuentra, numero de palabras encontradas
	 */
	static int buscarPalabra ( String texto, String busqueda ) {
		//TODO implementar despues del Test
		
		int result = -1;
		
		int busquedaLength = busqueda.length();
		
		if(texto==null||busqueda==null) {
			result=0;
		}else {
			int pos= texto.indexOf(busqueda);
			while(pos!=-1) {
				
				texto=texto.substring(pos);
				pos++;
				result++;
			}
			
			result=99;
		}
		
		return result;
	}
	

}
