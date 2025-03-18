package aula6;

import java.util.Scanner;

public class Herik3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int result = 0;
		String count = "";
		
		System.out.print("Envie um número: ");
		n = sc.nextInt();
		
		System.out.println();
		
		result = n*(n-1);
		
		for (int i = n-2; i>0; i-=1) {

			result = result*i;
		}
		
		count = n+"!= ";
		
		for (int i = n; i>0; i-=1) {
			
			if (i>1) {
				count += i+".";
			}
			else {
				count += i;
			}
		}
		
		System.out.println(count + " = "+ result);
		
	}

}
