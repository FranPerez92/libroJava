package com.ipartek.formacion.javalibro.pojo;

public class PintandoObjetosGraficos {

	public static void main(String[] args) {
		//Una clase abstracta no se puede instanciar
		//ObjetoGrafico oj = new ObjetoGrafico();
		
		//Una interfaz tampoco se puede instanciar
		//Vendible v = new Vendible;
		
		Circulo c = new Circulo();
		c.dibujar();
		c.mover(12, 0);
		
		LineaColor lc = new LineaColor();
		lc.color =  "rojo";
		lc.longitud = 56;
		c.mover(99, -12);
		lc.dibujar();
		
	}

}
