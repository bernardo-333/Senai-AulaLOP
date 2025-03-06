package aula3;

import java.util.Scanner;

public class aulaFabbriB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in); 
		
		double fahrenheit, celsius;
		
		System.out.println("digite o fahrenheit:");
		fahrenheit = sc.nextDouble();
		
		celsius = ((fahrenheit - 32)* 5) / 9;
		
		System.out.println("celsius:" + celsius);
		
		sc.close();

	}

}
