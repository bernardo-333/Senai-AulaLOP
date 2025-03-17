package aula6;

import java.util.Scanner;

public class Miguel3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	
		do {
		int numero;
	
		System.out.println();
		
		System.out.println("digite o numero para ver a tabuada: ");
		numero = sc.nextInt();
		
		int i = 1;
		
		do {
			System.out.println(numero + "x" + i + "=" + (numero * i));
			i++;
			
		} while (i <= 10);
		
		} while (true);
		
		}
	
	}

