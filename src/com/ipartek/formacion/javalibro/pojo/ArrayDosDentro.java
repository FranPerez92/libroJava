package com.ipartek.formacion.javalibro.pojo;

import java.util.ArrayList;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.interfaces.Imprimible;

public class ArrayDosDentro {

	public static void main(String[] args) {

		ArrayList<Imprimible> dosObjetos = new ArrayList<Imprimible>();

		Participante p1 = null;
		
		try {
			p1 = new Participante("participante", 25);
		} catch (ParticipanteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Libro l1 = new Libro("100 años de soledad");
		Libro l2 = new Libro("Libro 2");

		dosObjetos.add(p1);
		dosObjetos.add(l1);
		dosObjetos.add(l2);

		for (Imprimible imprimible : dosObjetos) {
			if(imprimible instanceof Libro){
				Libro l = (Libro) imprimible;
				System.out.println("Libro :"+ l.getTitulo());
			}else if(imprimible instanceof Participante){
				Participante l = (Participante) imprimible;
				System.out.println("Participante :"+ l.getNombre());
			}else {
				System.out.println("No conocemos esa clase");
			}
		}

	}

}
