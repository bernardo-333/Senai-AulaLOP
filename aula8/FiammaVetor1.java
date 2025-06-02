package aula7;

import java.util.Scanner;

public class fiammaVetor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("digite: ");
			vetor[i] = sc.nextInt();
			
			}
			
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + ", ");
		}
		
		}
		

	}


