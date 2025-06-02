package aula8;

import java.util.Random;
import java.util.Scanner;

public class Faimmavetor8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int vetor[] = new int[10];

		System.out.println("Valor original: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(0, 100);

			System.out.print(vetor[i] + " ");
		}

		System.out.println();
		
		System.out.println("\nNumeros pares: ");
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}

		System.out.println();
		
		System.out.println("\nNumeros impares: ");
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}

		}

	}

}
