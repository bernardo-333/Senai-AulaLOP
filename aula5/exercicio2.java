package AulaFiammaGrupo;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner sc = new Scanner(System.in);
		
		double alt, pes, imc;
		
		System.out.println("digite a altura: ");
		alt = sc.nextDouble();
		System.out.println("digite o peso: ");
		pes = sc.nextDouble();
		
		imc = pes / (alt*alt);
		
		System.out.println("seu Imc é " + imc);
		
		if (imc < 18.5) {
			System.out.println("abaixo do peso");
		} 
		else if (imc < 25 && imc > 18.5 ) {
			System.out.println("normal");
		}
		else if (imc < 30 && imc > 25) {
			System.out.println("Grau 1 de obesidade");
		}
		else if (imc < 35 && imc > 30) {
			System.out.println("Grau 2 de obesidade");
		} else {
			System.out.println("Grau 3 de obesidade");
		}
		
	

	}

}
