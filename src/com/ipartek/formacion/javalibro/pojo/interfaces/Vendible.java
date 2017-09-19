package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.io.Serializable;

public interface Vendible extends Serializable, Cloneable {

	static final float PRECIO_MINIMO = 0;

	/**
	 * Retorna el precio del objeto, el cual debe ser superior al PRECIO_MINIMO
	 * 
	 * @return
	 */
	float getPrecio();/* prototipo */
}

/* hacer test 
 * 0,2 cent pagina
 * tapa dura 1,50
 * electronico -5€
 */