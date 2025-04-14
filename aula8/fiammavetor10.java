package aula8;

import java.util.Random;
import java.util.Scanner;

public class fiammavetor10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int vetor[] = new int[5];
		int vetor2[] = new int[5];
		
		//vetor original
		System.out.print("vetor original: ");
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(0,10);
				
			
			System.out.print(vetor[i] + " ");
			
		}

		System.out.println();
		System.out.println();
		
		//Rotação de Vetor
		
		vetor2[0] = vetor[4];
		vetor2[1] = vetor[0];
		vetor2[2] = vetor[1];
		vetor2[3] = vetor[2];
		vetor2[4] = vetor[3];

		
		System.out.print("Vetor rotacionado: ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + " ");
		}
		
	}

}
