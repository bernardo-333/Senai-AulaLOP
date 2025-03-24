package AulaFiammaGrupo;

import java.util.Scanner;

public class fiamma6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Scanner sc = new Scanner(System.in);
		
		int num, den, isso;
		

			System.out.println("Digite um numero");
			num = sc.nextInt();
			System.out.println("Digite um denominador");
			den = sc.nextInt();
			
		if (den == 0) {
			System.err.println("NAO DA PRA DIVIDIR ESSA POHA QUANDO É ZERO");
			
		} else {
			System.out.println(num/den);
			
		}
		
	}

}
