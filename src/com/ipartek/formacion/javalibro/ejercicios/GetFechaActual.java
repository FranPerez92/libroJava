package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Mostrar fecha actual del sistema
 * @author Administrador
 *
 */
public class GetFechaActual {

	public static void main(String[] args) {
		
		String[] DIAS_SEMANA = new String[]{
				"Domingo",
				"Lunes",
				"Martes",
				"Miercoles",
				"Jueves",
				"Viernes",
				"Sabado"};
		
		String[] MESES = new String[]{
				"Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};
		

		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		
		int anyo = gc.get(Calendar.YEAR);
		int mes = gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int diaSemana = gc.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println(anyo + " " + MESES[mes] + " " + dia + " " + DIAS_SEMANA[diaSemana]);

	}

}
