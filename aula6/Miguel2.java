package AulaFiammaGrupo;

import java.util.Scanner;

public class Miguel2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while (i != 0) {

			System.out.print("Digite um numero: ");
		i = sc.nextInt();
	
		
			if (i % 2 == 0) {
				System.out.println("é par");
			} else {
				System.out.println("é impar");
			}
			
			System.out.println();
			
		}
			
			

	}

}
