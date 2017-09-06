import java.text.NumberFormat;

/*
 * Ejercicio para probar las variables en java
 */
public class Variables {

	/**
	 * Obtener un simbolo especial en ASCII de check o cross
	 * 
	 * @param valor
	 *            boolean
	 * @return si valor true check, si no cross
	 */
	public static char dameSimbolo(boolean valor) {

		char resul = '\u2716';
		if (valor) {
			resul = '\u2714';
		}
		return resul;
	}

	public static void main(String[] args) {

		System.out.println("Ejercicio con variables");
		System.out.println("1. Enteros: ");
		System.out.println("2. Reales: ");
		System.out.println("3. Booleanes: ");
		System.out.println("4. Caracteres: ");

		// TODO TERMINAR DE PONER EL RESTO
		System.out.println("Int " + Integer.BYTES + " bytes entero " + Integer.MIN_VALUE + " min value \n ");
		System.out.println("Int " + Short.BYTES + " bytes short " + Short.MIN_VALUE + " min value \n ");
		System.out.println("Int " + Byte.BYTES + " bytes byte " + Byte.MIN_VALUE + " min value \n ");
		System.out.println("Int " + Long.BYTES + " bytes long " + Long.MIN_VALUE + " min value \n ");

		System.out.println("Reales: ");

		float sueldoMesGerman = 1200.25f;
		float sueldoMesLander = (float) 2400.50;

		System.out.println("German cobra " + NumberFormat.getInstance().format(sueldoMesGerman) + " € al mes.");

		String sSueldoGerman = String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');
		System.out.println("German cobra " + sSueldoGerman + " € al mes");

		// TODO declarar una variable primitiva de cada tipo y usar su wrapper
		int vInt = 4;
		boolean vBool = true;
		float vFloat = 24.4f;
		byte vByte = 3;
		short vShort = 45;
		double vDouble = 34;
		char vChar = 'c';
		long vLong = 67;

		System.out.println("Tipos de variables primitivas: ");
		System.out.println("int :" + vInt);
		System.out.println("boolean :" + vBool);
		System.out.println("float :" + vFloat);
		System.out.println("byte :" + vByte);
		System.out.println("short :" + vShort);
		System.out.println("double :" + vDouble);
		System.out.println("char :" + vChar);
		System.out.println("long :" + vLong);

		// TODO DIGITO LETRA MAYUS MINUS CHAR CHARACTER

		char a = 'a';
		char f = 'F';
		int numero = '3';
		char j = 'j';

		/*
		 * comparar(a); comparar(f); comparar((char) numero); comparar(j);
		 */

		char[] chars = { 'a', 'F', '3', 'j' };

		System.out.println("Digito Letra Mayus Minus");
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i] + " " + dameSimbolo(Character.isDigit(chars[i])) + " "
					+ dameSimbolo(Character.isLetter(chars[i])) + " " + dameSimbolo(Character.isUpperCase(chars[i]))
					+ " " + dameSimbolo(Character.isLowerCase(chars[i])));
		} // end for

	}

	public static void comparar(char val) {
		boolean vCharD = Character.isDigit(val);
		boolean vCharL = Character.isLetter(val);
		boolean vCharU = Character.isUpperCase(val);
		boolean vCharM = Character.isLowerCase(val);

		System.out.println("ES DIGITO: " + vCharD + " ES LETRA: " + vCharL + " ES MAYUSCULA: " + vCharU
				+ " ES MINUSCULA: " + vCharM);
		System.out.println('✓');

	}

}
