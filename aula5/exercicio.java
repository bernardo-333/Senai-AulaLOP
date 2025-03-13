package aula5;

import java.util.Scanner;
import java.util.Random;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	    Random rd = new Random();
	    
	    int num, resp;
	    num = rd.nextInt(10)+ 1;
	    
	    System.out.println("Bem vindo ao jogo de adivinhação");
	    System.out.println("Adivinhe um numero de 1 a 100:");
	    resp = sc.nextInt();
	    boolean V = true;
	    
	

	    
	    if (resp < num) {
	    	System.out.println("numero é maior");
	    } 
	    
	    else if (resp > num) { 
	    	System.out.println("numero é menor");
	    } 
	    
	    else {
	    	System.out.println("vc acertou");
	    }
	    	    


	    
	    
	    
		
	}

}
