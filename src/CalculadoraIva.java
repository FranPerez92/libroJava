import java.util.Scanner;

public class CalculadoraIva {

	public static void main(String[] args) {
		
		System.out.println("Calculadora IVA 21%");
		System.out.println("-------------------");
		
		System.out.println("Por favor dame el importe en €");
		
		Scanner sc=new Scanner(System.in);
		float importe = sc.nextFloat();
		
		System.out.println("Iva repercutido:" + importe * 0.21);
		
	}

}
