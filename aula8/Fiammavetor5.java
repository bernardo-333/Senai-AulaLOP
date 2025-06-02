package aula8;

import java.util.Random;
import java.util.Scanner;

public class fiammavetor5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int vetor[] = new int[6];
		
		
		
		//vetor original
		
		System.out.print("vetor original: ");
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(0,100);
				
			
			System.out.print(vetor[i] + " ");
		}

		System.out.println();
		System.out.println();
		
		//vetor invertido 
		
		System.out.print("vetor invertido: ");
 
		for (int i = vetor.length -1; i >= 0; i--) {
		
				
			System.out.print(vetor[i] + " ");
		}

	}

}
