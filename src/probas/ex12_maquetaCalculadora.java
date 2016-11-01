/* Tratase de facer unha maqueta da calculadora */

package probas;

import java.util.Scanner;

public class ex12_maquetaCalculadora {

	public static void main(String[] args) {
		int opcion;
		Scanner td = new Scanner(System.in);

		do {
			System.out.println("Escolla unha opcion:");
			System.out.println("1: suma. 2: resta. 3. Prema '0' para sair");

			opcion = td.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("suma");
				break;
			case 2:
				System.out.println("resta");
				break;
			}

		} while (opcion != 0);

		td.close();
		System.out.println("FIN DE PROGRAMA");
	}

	// FUNCIÓNS

	// suma
	public static int suma(int a, int b) {
		int aux = 0;
		aux = a + b;
		return aux;
	}

	public static int resta(int c, int d) {
		int aux = 0;
		aux = c - d;
		return aux;
	}

}
