import java.util.ArrayList;
import java.util.Scanner;

public class listadoCanciones {

	public static void main(String[] args) {

		ArrayList<Canciones> canciones = new ArrayList<Canciones>();

		Canciones cancion1 = new Canciones("Titulo1", "Artista1", 4);
		Canciones cancion2 = new Canciones("Titulo2", "Artista2", 3);
		Canciones cancion3 = new Canciones("Titulo3", "Artista3", 5);
		Canciones cancion4 = new Canciones("Titulo4", "Artista2", 4);
		Canciones cancion5 = new Canciones("Titulo5", "Artista1", 2);

		canciones.add(cancion1);
		canciones.add(cancion2);
		canciones.add(cancion3);
		canciones.add(cancion4);
		canciones.add(cancion5);

		for (int i = 0; i < canciones.size(); i++) {
			Canciones cancActual = canciones.get(i);
			System.out.println(i + "." + cancActual);
		}

		Scanner sc = new Scanner(System.in);
		String anadir = "";
		String titulo = "";
		String artista = "";
		int numeroCancion;
		Canciones numeroCancionBorrar;
		int duracion = 0;
		System.out.println("¿Quieres añadir una nueva cancion? s/n");

		anadir = sc.next();

		if ("s".equals(anadir)) {
			System.out.println("Introduce titulo: ");
			titulo = sc.next();
			System.out.println("Introduce artista: ");
			artista = sc.next();
			System.out.println("Introduce duracion: ");
			duracion = sc.nextInt();

			canciones.add(new Canciones(titulo, artista, duracion));

			for (int i = 0; i < canciones.size(); i++) {
				Canciones cancActual = canciones.get(i);
				System.out.println(i + "." + cancActual);
			}

		} else {
			System.out.println("No añadir.");
		}

		System.out.println("¿Quieres eliminar una cancion? s/n");
		
		anadir = sc.next();

		if ("s".equals(anadir)) {

			System.out.println("Introduce numero de cancion a borrar:");
			numeroCancion = sc.nextInt();
			numeroCancionBorrar = canciones.get(numeroCancion);
			canciones.remove(numeroCancionBorrar);

			for (int i = 0; i < canciones.size(); i++) {
				Canciones cancActual = canciones.get(i);
				System.out.println(i + "." + cancActual);
			}

		} else {
			System.out.println("No borrar.");
		}

		
		sc.close();
		
	}

}
