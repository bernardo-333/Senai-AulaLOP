package aula3;

import java.util.Scanner;

public class ExercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double tempo, velocidade, distancia, litros;
		
		System.out.println("Digite o tempo gasto em horas:");
		tempo = sc.nextDouble();
		System.out.println("Digite a velocidade média em km:");
		velocidade = sc.nextDouble();
		
		distancia = tempo * velocidade; 
		litros = distancia / 12;
		
		System.out.println(" ");
		System.out.print("Tempo gasto: ");
		System.out.println(tempo + " horas");
		System.out.print("Velocidade média: ");
		System.out.println(velocidade + "km");
		System.out.print("Distancia percorrida: ");
		System.out.println(distancia + "km/h");
		System.out.print("Litros utilizados: ");
		System.out.println(litros + " Litros");
	
	
	}

}
