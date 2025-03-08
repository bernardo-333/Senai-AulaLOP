package aula3;

import java.util.Scanner;

public class aulaFabbriE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double tempo, valor, prestacao, taxa;
		
		System.out.print("Digite o valor: R$");
		valor = sc.nextDouble();
		System.out.print("Digite o tempo: "); 
		tempo = sc.nextDouble();
		System.out.print("Digite a taxa: ");
		taxa = sc.nextDouble()/100;
		
		prestacao = valor + (valor * taxa * tempo);
		
		System.out.println("A prestação é: " + prestacao);
	
	}

}
