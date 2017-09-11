package com.ipartek.formacion.javalibro.ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.javalibro.pojo.Cancion;

public class listadoCanciones {

	static ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	static Scanner sc;

	static final int OP_LISTAR = 1;
	static final int OP_ELIMINAR = 2;
	static final int OP_CREAR = 3;
	static final int OP_DETALLE = 4;
	static final int OP_SALIR = 5;

	static int opcionSelecionada = 1;

	public static void main(String[] args) {

		crearCanciones();

		listarCanciones();

		mostrarMenu();

		while (opcionSelecionada != 5) {
			pedirRespuesta();

			switch (opcionSelecionada) {
			case OP_LISTAR:
				listCanciones();
				mostrarMenu();

				break;

			case OP_ELIMINAR:
				borrarCancion();
				mostrarMenu();

				break;

			case OP_CREAR:
				anadirCancion();
				mostrarMenu();

				break;

			case OP_DETALLE:
				listarCanciones();
				mostrarMenu();

				break;

			case OP_SALIR:
				//salir();

				break;
			default:
				break;
			}

		} // End while

		sc.close();

	}

	private static void anadirCancion() {

		String titulo = "";
		String artista = "";
		int duracion = 0;

		System.out.println("Añadiendo nueva cancion");

		System.out.println("Introduce titulo: ");
		titulo = sc.next();
		System.out.println("Introduce artista: ");
		artista = sc.next();
		System.out.println("Introduce duracion: ");
		duracion = sc.nextInt();

		canciones.add(new Cancion(titulo, artista, duracion));

		for (int i = 0; i < canciones.size(); i++) {
			Cancion cancActual = canciones.get(i);
			System.out.println(i + "." + cancActual);
		}

	}

	private static void borrarCancion() {

		int numeroCancion;
		Cancion numeroCancionBorrar;

		System.out.println("Introduce numero de cancion a borrar:");
		listCanciones();

		sc = new Scanner(System.in);
		numeroCancion = sc.nextInt();
		
		if(!canciones.isEmpty()) {
			numeroCancionBorrar = canciones.get(numeroCancion);
			canciones.remove(numeroCancionBorrar);
		}else {
			System.out.println("No hay canciones");
		}

		for (int i = 0; i < canciones.size(); i++) {
			
			Cancion cancActual = canciones.get(i);
			System.out.println(i + "." + cancActual);
			
		}

	}

	private static void pedirRespuesta() {

		sc = new Scanner(System.in);
		opcionSelecionada = sc.nextInt();

	}

	private static void crearCanciones() {

		canciones.add(new Cancion("Titulo1", "Artista1", 4));
		canciones.add(new Cancion("Titulo2", "Artista2", 3));
		canciones.add(new Cancion("Titulo3", "Artista3", 5));
		canciones.add(new Cancion("Titulo4", "Artista2", 4));
		canciones.add(new Cancion("Titulo5", "Artista1", 2));

	}

	private static void listarCanciones() {

		for (int i = 0; i < canciones.size(); i++) {
			Cancion cancActual = canciones.get(i);
			System.out.println(i + "." + cancActual);
		}

	}

	private static void listCanciones() {

		for (int i = 0; i < canciones.size(); i++) {
			Cancion cancActual = canciones.get(i);
			String titulo =cancActual.getTitulo();
			System.out.println(i + "." + titulo);
		}

	}

	private static void mostrarMenu() {
		System.out.println("---------------");
		System.out.println("-------Menu----");
		System.out.println("1.Listar");
		System.out.println("2.Eliminar");
		System.out.println("3.Añadir");
		System.out.println("4.Detalles");
		System.out.println("5.Salir");
	}

}
