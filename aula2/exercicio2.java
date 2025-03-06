package aula2;

import java.util.Scanner;
import java.lang.Math;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double perimetro, largura, altura, area; 
		
		System.out.println("largura do quadro:");
		largura = sc.nextDouble();
		System.out.println("altura do quadro:");
		altura = sc.nextDouble();
		
		area = largura * altura; 
		
		System.out.print("AREA:");
		System.out.println(String.format("%.4f", area));
		
		perimetro = largura + largura + altura + altura; 
		
		System.out.print("PERIMETRO:");
		System.out.println(String.format("%.4f",perimetro));
		
		System.out.print("DIAGONAL:");
		System.out.println(String.format("%.4f", Math.sqrt((altura * altura) + (largura * largura))));
		
	
		sc.close();
	
		
	}

}
