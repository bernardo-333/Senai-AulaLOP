package aula3;

import java.util.Scanner;

public class aulaFabbriIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double altura, peso, resultAltura, imc2;
		
		System.out.println("digite a altura:");
		altura = sc.nextDouble();
		System.out.println("digite o peso:");
		peso = sc.nextDouble(); 
		
		imc2 = peso / (altura * altura);
		
		System.out.print("IMC:");
		System.out.printf("%.2f\n" , imc2);
		
		if (imc2 < 18.5) {
			System.out.println("Classificação: Abaixo do peso");
		} else if (imc2 >= 18.5 && imc2 < 24.9) {
			System.out.println("Classificação: Normal");
		} else if (imc2 >= 25 && imc2 < 29.9) {
			System.out.println("Classificação: Sobrepeso");
		} else if (imc2 > 30) {
			System.out.println("Classificação: Obesidade");
		}
		
		sc.close();

	}

}
