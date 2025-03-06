package aulasJava;

import java.util.Scanner;

public class aulaFabbriA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double fahrenheit, celsius;
		
		System.out.println("digite o celsius:");
		celsius = sc.nextDouble();
		
		fahrenheit = celsius * 9 / 5 + 32; 
		
		System.out.println("Fahrenheit:" + fahrenheit);
		
		sc.close();

	}

}
