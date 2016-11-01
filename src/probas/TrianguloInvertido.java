package probas;

public class TrianguloInvertido {

	public static void main(String[] args) {
		int i = 0;
		inicio:
				while (i < 10) {
					i++;
					 for (int j = 10; j >= 1 - i; j -= 2) { 
						if (i % 2 == 0) {
							continue inicio;
						}
						System.out.print(" ");
					}
					for (int k = 5; k >= i; k--) { // isto pinta as liñas
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
