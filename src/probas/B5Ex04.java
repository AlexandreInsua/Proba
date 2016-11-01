package probas;

import java.util.Scanner;

public class B5Ex04 {

	public static void main(String[] args) {
	int lado;
	
	Scanner td=new Scanner(System.in);
	System.out.println("Introduza un número para o tamaño dos lados:");
	lado=td.nextInt();
	
	
	for (int i=1; i<=lado;i++){
		for (int j=1;j<=lado;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}

}
