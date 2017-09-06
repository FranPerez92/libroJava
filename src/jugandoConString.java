import com.sun.org.apache.xpath.internal.operations.Equals;

public class jugandoConString {

		public static void main(String[] args) {
			
			String manolo ="Manolo Kabezabolo";
			
			//Convertir a minusculas
			System.out.println(manolo.toLowerCase());
			//Convertir a mayuculas
			System.out.println(manolo.toUpperCase());
			//Mostrar numero de caracteres
			System.out.println(manolo.length());
			//Mostrar posicion de la letra "K"
			int posK = manolo.indexOf("K")+1;
			System.out.println("Posicion de la K: "+posK);
			//Separar en dos variables el nombre y apellido
			String nombre=manolo.substring(0,6);//Manolo
			String apellido=manolo.substring(7);//Kabezabolo
			System.out.println(nombre);
			System.out.println(apellido);
			/*Comparando*/
			String c1 = "casa";
			String c2 = "Casa";
			//Comparar c1 y c2 con equals y equalIgnoreCase
			System.out.println(c1.equals(c2));
			System.out.println(c1.equalsIgnoreCase(c2));
			//Limpiando entradas de datos
			String c3 = "perro";
			String c4 = "    perro   ";
			//Las dos variables deben ser igual =>Trim
			c4=c4.trim();
			System.out.println(c3.equals(c4));
			
			String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tristique magna non elementum facilisis. Suspendisse ultricies finibus massa, at ullamcorper felis aliquet a. Aliquam gravida volutpat purus nec faucibus. Ut sodales enim ac gravida fermentum. Aenean id est at mauris vehicula tincidunt et sit amet erat. Morbi et tincidunt massa, scelerisque maximus quam. Sed hendrerit fermentum venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin faucibus hendrerit sem. Aliquam erat volutpat. Ut in condimentum eros. Praesent molestie justo quis porta finibus. Etiam laoreet, odio at auctor sodales, arcu arcu finibus ligula, a facilisis elit tellus laoreet turpis. Nulla mattis mattis mi sed aliquet. Duis dignissim commodo vulputate.";
			//Mostrar longitud
			//Contar las palabras
			//Contar todas las vocales
			//Indicar el numero de veces que aparece 'at'
			
			System.out.println("Longitud: "+ lorem.length());
			System.out.println("Palabras: "+ lorem.split(" ").length);
			
			int contadorVocales=0;
			char [] aVocales =lorem.toLowerCase().toCharArray();
			char vocal = 'a';
			char [] vocales = {'a','e','i','o','u'};
			
			for (int i = 0; i < aVocales.length; i++) {
				vocal = aVocales[i];
				for (int j = 0; j < vocales.length; j++) {
					if(vocales[j]==vocal) {
						contadorVocales++;
					}
				}
			}
			System.out.println("Vocales= "+contadorVocales);
			
			//At
			char [] aVocalesAt =lorem.toLowerCase().toCharArray();
			char letra1='a';
			char letra2='b';
			int cont=0;
			
			for (int i = 0; i < aVocalesAt.length; i++) {
				letra1=aVocalesAt[i];
				
				if(letra1=='t' && letra2=='a') {
					cont++;
				}
				
				if(letra1=='a') {
					letra2='a';
				}else {
					letra2='b';
				}
				
			}
			
			System.out.println("El numero de veces que sale AT es: "+cont);
			
			System.out.println(lorem.replaceAll("a", "4"));
			
		}
}
