package aula4;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3;
		
		 //entrada de dados 
		System.out.println("Digite o primeiro numero:");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo numero:");
		num2 = sc.nextDouble();
		System.out.println("Digite o terceiro numero:");
		num3 = sc.nextDouble();
		
		if (num1 <= num2 && num1 <= num3) {
			if (num2 <= num3) {
			System.out.println("A ordem é: " + num1 + ", " + num2 + ", " + num3);
			} else {
				System.out.println("A ordem é: " + num1 + ", " + num3 + ", " + num2);
			}
			} else if (num2 <= num1 && num2 <= num3) {
				if (num1 <= num3) {
				System.out.println("A ordem é: " + num2 + ", " + num1 + ", " + num3);
				} else {
					System.out.println("A ordem é: " + num2 + ", " + num3 + ", " + num1);
				} 
			} else {
				if (num1 <= num2) {
					System.out.println("A ordem é: " + num3 + ", " + num1 + ", " + num2);
				} else {
					System.out.println("A ordem é: " + num3 + ", " + num2 + ", " + num1);
				}
			} sc.close();
		}
}
