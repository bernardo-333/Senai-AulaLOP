package aula3;

import java.util.Scanner;

public class aulaFabbriC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
	
		double altura, raio, volume;
		
		System.out.println("digite o raio da lata:");
		raio = sc.nextDouble();
		System.out.println("digite a altura da lata:");
		altura = sc.nextDouble();
		
		volume = ((3.14159 * (raio * raio)) * altura);
		
		System.out.print("Volume:");
		System.out.printf("%.2f", volume);
		
		
	}

}
