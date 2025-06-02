package aula8;

import java.util.Random;
import java.util.Scanner;

public class fiammavetor6 {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int vetor[] = new int[5];
		double numero;
		double total =  0;
		
		
		
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(0,100);
			
			System.out.print(vetor[i] + " ");
			
		}
		
		System.out.println("\ndigite um numero: ");
		numero = sc.nextDouble();
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			total = numero * vetor[i];
			
			System.out.printf("%.0f ", total);
		}
		

	}

}
