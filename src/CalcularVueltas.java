/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {

	public static void main(String[] args) {

		float precio = 1326.24f;
		float pagado = 2000f;
		float vueltas = pagado - precio;

		final float[] BILLETES_MONEDAS = { 50, 20, 10, 5, 2, 1, (float) 0.5, (float) 0.2, (float) 0.1, (float) 0.05,
				(float) 0.02, (float) 0.01 };

		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			int contador = 0;
			while (vueltas > BILLETES_MONEDAS[i]) {
				vueltas = vueltas - BILLETES_MONEDAS[i];
				contador++;
			}
			if (i < 4) {
				System.out.println("En billetes de " + BILLETES_MONEDAS[i] + ": " + contador);
			} else {
				System.out.println("En monedas de " + BILLETES_MONEDAS[i] + ": " + contador);
			}
		}

	}

}
