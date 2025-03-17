package AulaFiammaGrupo;

import java.util.Scanner;

public class Herik1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero");
		num = sc.nextInt();
	
		
		for (int i=0 ;i <= num; i= i+2) {
			if (i == num) {
				break;
			} else {
				System.out.println(i);
			}
			
		
			}
		
		} 

	}


