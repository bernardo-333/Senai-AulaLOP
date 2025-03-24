package AulaFiammaGrupo;

import java.util.Scanner;

public class fiamma5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero");
		num = sc.nextInt();
		int result=num;
		
		
		for (int i=1 ; i<5; i++) {
			System.out.print("a soma: ");
			System.out.println(result += num);
			System.out.print("a multiplicação: ");
			System.out.println(result*=2);
			
		}
		System.out.println();
		System.out.println("resultado final é: "+ result);
		
		
	}

	}
