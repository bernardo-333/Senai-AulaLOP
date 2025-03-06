package aula4;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o ano: ");
		ano = sc.nextInt();
		
		System.out.println(" ");
		
		if (ano % 4 == 0) {
			System.out.println(ano + " É bíssexto");
		} else {
			System.out.println(ano + " Não é bíssexto");
		}
	
		sc.close();
	

	}

}
