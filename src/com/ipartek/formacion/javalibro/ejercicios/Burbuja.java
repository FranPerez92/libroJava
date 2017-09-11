package com.ipartek.formacion.javalibro.ejercicios;

public class Burbuja {

	static int [] numeros = {0, 3, 1, 8, 7, 2, 5, 4, 6, 9};
	static int [] numerosOrdenados;
	static int aux;
	
	public static void main(String[] args) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = -1; j < numeros.length - 1; j++) {
				if(numeros[i]<numeros[j+1]) {
					aux=numeros[i];
					numeros[i]=numeros[j+1];
					numeros[j+1]=aux;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
