package aula4;

import java.util.Scanner;

public class NumPNZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite o numero: ");
		numero = sc.nextDouble();
		
		System.out.println(" ");
		
		if (numero > 0) {
			System.out.println(numero + " É Positivo");
		} else if (numero < 0) {
			System.out.println(numero + " É Negativo");
		} else if (numero == 0) {
			System.out.println(numero + " É igual zero");
		}
		
		sc.close();

	}

}
