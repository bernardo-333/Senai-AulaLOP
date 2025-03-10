package aula3;

import java.util.Scanner;

public class aulaFabbriG {

	public static void main(String[] args) {		
	
		Scanner sc = new Scanner(System.in);

		double[] resultados = new double[12];
		String[] combinacoes = new String[12];
		
		System.out.print("Envie o A: " );
		double a = sc.nextDouble();
		
		System.out.print("Envie o B: ");
		double b = sc.nextDouble();
		
		System.out.print("Envie o C: ");
		double c = sc.nextDouble();
		
		System.out.print("Envie o D: ");
		double d = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("+ SOMAS +");
		
		System.out.println();
		
		double numero1 = 0;
		double numero2 = 1;
		
		for (int i = 0; i<6; i++) {
			
			if (numero2==7) {
				numero1++;
				numero2=0;
			}
			
			if (numero1==0 && numero2==1) {
				resultados[i] = a+b;
				combinacoes[i] = a + " + "+ b + " = ";
				System.out.println(combinacoes[i] + resultados[i]);			
			}
			
			if (numero1==0 && numero2==2) {
				resultados[i] = a+c;
				combinacoes[i] = a + " + "+ c + " = ";
				System.out.println(combinacoes[i] + resultados[i]);
			}
			
			if (numero1==0 && numero2==3) {
				resultados[i] = a+d;
				combinacoes[i] = a + " + "+ d + " = ";
				System.out.println(combinacoes[i] + resultados[i]);
			}
			
			if (numero1==0 && numero2==4) {
				resultados[i] = b+c;
				combinacoes[i] = b + " + "+ c + " = ";
				System.out.println(combinacoes[i] + resultados[i]);
			}
			
			if (numero1==0 && numero2==5) {
				resultados[i] = b+d;
				combinacoes[i] = b + " + "+ d + " = ";
				System.out.println(combinacoes[i] + resultados[i]);
			}
			
			if (numero1==0 && numero2==6) {
				resultados[i] = c+d;
				combinacoes[i] = c + " + "+ d + " = ";
				System.out.println(combinacoes[i] + resultados[i]);
			}
			
			numero2++;
		}
		
		System.out.println();
		
		System.out.println("+ DIVISOES +");
		
		System.out.println();
		
		numero1 = 0;
		numero2 = 1;
		
		for (int i = 0; i<6; i++) {
			
			if (numero2==7) {
				numero1++;
				numero2=0;
			}
			
			if (numero1==0 && numero2==1) {
				resultados[i] = (a/b);
				combinacoes[i] = a + " / "+ b + " = ";
				System.out.println(String.format(combinacoes[i] + "%.2f", resultados[i]));			
			}
			
			if (numero1==0 && numero2==2) {
				resultados[i] = a/c;
				combinacoes[i] = a + " / "+ c + " = ";
				System.out.println(String.format(combinacoes[i] + "%.2f", resultados[i]));			
			}
			
			if (numero1==0 && numero2==3) {
				resultados[i] = a/d;
				combinacoes[i] = a + " / "+ d + " = ";
				System.out.println(String.format(combinacoes[i] + "%.2f", resultados[i]));			
			}
			
			if (numero1==0 && numero2==4) {
				resultados[i] = b/c;
				combinacoes[i] = b + " / "+ c + " = ";
				System.out.println(String.format(combinacoes[i] + "%.2f", resultados[i]));			
			}
			
			if (numero1==0 && numero2==5) {
				resultados[i] = b/d;
				combinacoes[i] = b + " / "+ d + " = ";
				System.out.println(String.format(combinacoes[i] + "%.2f", resultados[i]));			
			}
			
			if (numero1==0 && numero2==6) {
				resultados[i] = c/d;
				combinacoes[i] = c + " / "+ d + " = ";
				System.out.println(String.format(combinacoes[i] + "%.2f", resultados[i]));			
			}
			
			numero2++;
			
			sc.close();
			
		}
	}
}
