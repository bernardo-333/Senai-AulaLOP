package aula4;

import java.util.Scanner;

public class NotasAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		

		double nota, nota2;
		
		//receber notas do aluno 
		System.out.println("Digite a nota do aluno:");
		nota = sc.nextDouble();
	
		if  (nota >= 7) {
			System.out.println("APROVADO");
		} else if (nota < 7) {
			System.out.println("REPROVADO");
		}
		
	}

}
