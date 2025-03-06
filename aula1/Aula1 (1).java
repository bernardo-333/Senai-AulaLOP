package aula1;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner banana = new Scanner(System.in);
		//instanciar um scanneer
		//importar o scanner
		//para organizar apertar crtl shift f 
		//crtl s salva 
		
	   int dividir, numero1, numero2;
	   //variavel int com mesmas classes
	   
	   System.out.println("digite o primeiro numero");
	   numero1 = banana.nextInt();
	   System.out.println("digite o segundo numero");
	   numero2 = banana.nextInt();
	   
	   dividir = numero2 % numero1; 
			   
	
		System.out.println("dividor: "+ dividir);
		
		int soma, numero3, numero4;
		
	 System.out.println("digite o numero do dividor");
	 numero3 = banana.nextInt();
	 System.out.println("digite o numero para soma");
	 numero4 = banana.nextInt(); 
	 
	 soma = numero3 + numero4; 
	 
	 System.out.println("soma:   "+ soma);
		
		banana.close();
		//fecho a soma do texto e do numero com espaço
	

	}

}
