package aula8;

import java.util.Random;
import java.util.Scanner;

public class fiammavetor7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		
		// vetor A
		System.out.println("vetor A: ");
		for (int i = 0; i < vetor2.length; i++) {
			vetor1[i] = rd.nextInt(0,10);
			vetor2[i] = rd.nextInt(0,10);
			
			System.out.print(vetor1[i] + " " );
		}
		
		System.out.println();
		System.out.println();
		
		// vetor B
		System.out.println("vetor B: ");
		for (int i = 0; i < vetor2.length; i++) {
			
			System.out.print(vetor2[i] + " " );
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//numeros iguais 
		
		for (int i = 0; i < vetor2.length; i++) {
			
		if (vetor1[i] == vetor2[i]) {
			System.out.printf("Posição %d: %d\n", i, vetor1[i]);
		}
		
		}
		
		
	}

}
