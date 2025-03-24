package aulasSenai;

import java.util.Scanner;

public class fiamma3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 1;
		double num;
		do {

			System.out.println();

			System.out.println("digite seu numero: ");
			 num = sc.nextInt();

			if (num > 10 && num < 20) {
				System.out.println("este numero esta entre 10 e 20");
			} else if (num > 30 && num < 40) {
				System.out.println("este numero esta entre 30 e 40");
			} else {
				System.err.println("numero invalido");
				while (num < 10 && num > 20) {
					num = sc.nextInt();
					
					
					
				 
	}


