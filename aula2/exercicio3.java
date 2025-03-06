package olaMundo;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		String nome1, nome2;
		double media, altura1, altura2;
		
		System.out.println("digite o nome da primeira pessoa:");
		nome1 = sc.nextLine();
		System.out.println("digite a altura dela:");
		altura1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("digite o nome da segunda pessoa:");
		nome2 = sc.nextLine();
		System.out.println("digite a altura dela:");
		altura2 = sc.nextDouble();
		sc.nextLine();
		
		media = (altura1 + altura2) / 2;
		
		System.out.println(" ");
		System.out.println("altura media de "+ nome1 +" e "+ nome2 +" é de "+ media);
		

	}

}
