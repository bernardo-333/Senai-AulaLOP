package aula4;

import java.util.Scanner;

public class NumerosMaiores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double numero1, numero2;
		
		System.out.println("Digite o primeiro numero:");
		numero1 = sc.nextDouble();
		System.out.println("Digite o segundo numero:");
		numero2 = sc.nextDouble();
		
	System.out.println("Maior numero:");
		if (numero1 > numero2) {
			System.out.println(numero1);
		} else if (numero2 > numero1) {
			System.out.println(numero2);
		}

		sc.close();
		
	}

}
