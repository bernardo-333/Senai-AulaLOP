package aula3;

import java.util.Scanner;

public class aulaFabbriF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.print("Envie o valor A: ");
		A = sc.nextDouble();
		System.out.print("Envie o valor B: ");
		B = sc.nextDouble();
		
		C = A;
		
		A = B;
		
		B = C;
		
		System.out.println();
		System.out.println("O valor de A é: " + A);
		System.out.println("O valor de B é: " + B);
		
		sc.close();
		
		
	}

}
