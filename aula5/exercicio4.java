package aula5;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		double i;
		
		System.out.println("Digite o seu numero:");
		i = sc.nextDouble();
		
		if (i % 2 > 0 &&i % 3 > 0 &&i % 5 > 0 &&i % 7 > 0) {
			System.out.println("é primo");
		} else {
			System.out.println("Nao é poha");
		}
		
		
	}

}
