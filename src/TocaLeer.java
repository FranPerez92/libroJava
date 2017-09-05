
public class TocaLeer {

	static String [] alumnos = { "Arkaitz", 
			"Erlantz", 
			"Fran", 
			"Cristian"};
	
	public static void main(String[] args) {
		
		int numAleatorio = generarNumeroAleatorio(alumnos.length);
		
		System.out.println("El afortunad@ es: " + alumnos[numAleatorio]);

	}
	
	/**
	 * Genera numero aleatorio entre 0 y <code>max<code>
	 * @param max int numero maximo que puede generar la función
	 * @return int aleatorio
	 */
	public static int generarNumeroAleatorio(int max){
		//TODO falta implementar logica
		
		int num = (int) (Math.random()*max)+0;
		
		return num;
	}

}
