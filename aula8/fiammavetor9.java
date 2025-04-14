package aula8;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class fiammavetor9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		double vetor[] = new double[6];
		Double total = 0.0, media = 0.0;
		
		//nota aleatoria 
		System.out.println("nota");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextDouble(0,10);
			
			System.out.printf("%.1f  ", vetor[i]);
		}
		
		//media 
		for (int i = 0; i < vetor.length; i++) {
			media = media + vetor [i];	
		}
		media = media /6;
		System.out.println();
		System.out.printf("\nMedia: %.2f",media);
		
		//aprovado e reprovado 
		if (media >= 7) {
			System.out.println("\nAprovado");
		} else if (media < 7) {
			System.err.println("\nReprovado");
		}
		
		sc.close();

	}

}
