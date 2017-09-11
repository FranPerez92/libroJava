package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesColeciones {

	/**
	 * Ordena un Array con el metodo bubble-sort
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado Array desordenado
	 * @param orden true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	static int[] ordenarArray( int[] aDesordenado, boolean orden ) {
		
		int[] resul = aDesordenado;
		
		int aux;
		
		if(!orden){
			for (int i = 0; i < aDesordenado.length; i++) {
				for (int j = -1; j < aDesordenado.length - 1; j++) {
					if(resul[i]<resul[j+1]) {
						aux=resul[i];
						resul[i]=resul[j+1];
						resul[j+1]=aux;
					}
				}
			}
		}else {
			for (int i = 0; i < aDesordenado.length; i++) {
				for (int j = -1; j < aDesordenado.length - 1; j++) {
					if(resul[i]>resul[j+1]) {
						aux=resul[i];
						resul[i]=resul[j+1];
						resul[j+1]=aux;
					}
				}
			}
		}
			
		return resul;
	}
	
}
