package com.ipartek.formacion.javalibro.excepciones;
/**
 * Exception personalizada para el pojo de participante
 * @see https://es.wikipedia.org/wiki/Plain_Old_Java_Object
 * @author Curso
 *
 */
public class ParticipanteException extends Exception {

	private static final long serialVersionUID = 1205162520080308107L;
	
	public static final String EXCEPTION_MENO_CERO = "La edad no puede ser menor que 0";
	public static final String EXCEPTION_MAYOR_CIEN = "Eres demasiado viejo, no puedes tener mas de 100 años";
	
	public ParticipanteException(String messageException) {
		super(messageException);
		
	}
	
}
