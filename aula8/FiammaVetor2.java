package aula7;

import java.util.Random;

import java.util.Scanner;

public class fiammaVetor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int[] vetor = new int[10];
		int total = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(0, 100);
		}

		for (int i = 0; i < vetor.length; i++) {

			System.out.print(vetor[i] + " ");
			total = total + vetor[i];

		}
		
		System.out.println("\na soma é "+total);

		}
		

	}

