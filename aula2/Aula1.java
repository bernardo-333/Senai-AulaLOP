package aula2;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// instanciar um scanneer
		// importar o scanner
		// para organizar apertar crtl shift f
		// crtl s salva

		double mult, largura, comprimento, metro, area, custo;

		System.out.println("digite a largura do cômodo:");
		largura = sc.nextDouble();
		System.out.println("digite o comprimento do cômodo:");
		comprimento = sc.nextDouble();
		System.out.println("digite o valor do metro quadrado do piso:");
		metro = sc.nextDouble();

		area = largura * comprimento;

		System.out.print("area do cômodo =  ");
		System.out.println(String.format("%.2f", area));

		custo = area * metro;

		System.out.print("custo total do piso =  ");
		System.out.println(String.format("%.2f", custo));

		sc.close();
	}

}
