
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		String [] alumnos = { 	"Ander",
								"Arkaitz", 
								"Erlantz", 
								"Fran", 
								"Cristian"};
		System.out.println("----Listado de alumnos----");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(i+ " - " + alumnos[i]);
		}
	}

	
}
