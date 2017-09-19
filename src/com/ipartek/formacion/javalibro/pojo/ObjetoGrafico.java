package com.ipartek.formacion.javalibro.pojo;

/**
 * Una clase abstract puede tener codigo implementado pero puede tener algun
 * metodo sin implementar(abstract) Es algo intermedio entre class y interfaz
 * Una clase abstracta no puede instanciar objetos, las
 * clases hijas deben implementar los metodos abstractos o volver a declararlos
 * abstractos
 * 
 * @author Administrador
 *
 */
public abstract class ObjetoGrafico {

	int x;
	int y;

	void mover(int xPos, int yPos) {
		this.x = xPos;
		this.y = yPos;
	}

	abstract void dibujar();

}
