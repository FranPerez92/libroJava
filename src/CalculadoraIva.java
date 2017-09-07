import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIva {

	public static void main(String[] args) {

		int pregunta = 1;

		System.out.println("Calculadora IVA 21%");
		System.out.println("-------------------");

		System.out.println("Por favor dame el importe en €");

		Scanner sc = new Scanner(System.in);
		float importe = 0;
		boolean importeCorrecto = true;
		
		while (pregunta == 1) {
			
			do {
			try {
				sc = new Scanner(System.in);
				importe = sc.nextFloat();
				importeCorrecto=false;
			}catch(NullPointerException e){
				System.out.println("Has metido un nulo.");
			}catch(InputMismatchException e) {
				System.out.println("Valor incorrecto, introduce un valor correcto, por ejemplo: 123.33");
			} catch (Exception e) {
				System.out.println("¿Que has echo para que falle?");
			}
			}while(importeCorrecto);
			
			System.out.println("Iva repercutido:" + importe * 0.21);

			System.out.println("¿Quieres calcular mas ivas? s/n");

			String respuesta = sc.next();

			if ("s".equals(respuesta)) {
				System.out.println("Siguiente IVA.");
				pregunta = 1;
			} else if("n".equals(respuesta)){
				pregunta=0;
				System.out.println("Terminado.");
			}
		
		}
		
		sc.close();

	}
}
