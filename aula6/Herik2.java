package aula6;

import java.util.Scanner;

public class Herik2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero");
		num = sc.nextInt();
	
		
		for (int i=0 ; i <= num; i++) {
			if (i == num + 1) {
			break;
		
		} else {
			System.out.println(num + "+" + i + "=" +(num + i));
		}
		}
			
			
		
	}

	}
