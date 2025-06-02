package aula7;

import java.util.Random;

import java.util.Scanner;

public class fiammaVetor3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int vetor[] = new int[8];
		int maior = 0, menor= 100;
		
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(0, 100);
			System.out.print(vetor[i] + " ");

			if (vetor[i] > maior) {
				maior = vetor[i];
			} if (vetor[i] < menor) {
				menor = vetor[i];
			}
		
		
		}
		System.out.println("\nmaior: " + maior + "\nmenor: " + menor);
		
		
		
	
	}

}
