package AulaFiammaGrupo;

import java.util.Scanner;

public class fimma1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextInt();

        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextInt();

        System.out.println("Digite a nota 3: ");
        double nota3 = sc.nextInt();

        double media = nota1 + nota2 + nota3 / 3;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
        
        sc.close();
    }

}


