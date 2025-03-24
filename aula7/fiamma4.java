package AulaFiammaGrupo;

import java.util.Scanner;

public class fiamma4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite sua nota: ");
		int nota = sc.nextInt();
		
		if (nota>7) {
			System.out.println("APROVADO");
		} else if (nota<4){
			System.out.println("REPROVADO");
		} else {
			System.out.println("RECUPERAÇÃO");
		}
		
		sc.close();
	}

}
