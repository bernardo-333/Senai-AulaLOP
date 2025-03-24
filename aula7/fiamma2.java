package AulaFiammaGrupo;

import java.util.Scanner;

public class fiamma2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double  obj1 = 8.5, 
				obj2 = 7, 
				obj3 = 9, 
				obj4 = 6, 
				obj5 = 8;
		
		double  dis1 = 9,
				dis2 = 8,
				dis3 = 9.5,
				dis4 = 7,
				dis5 = 8.5;
		
		double ResObj, ResDis;
		
		ResObj = (obj1+obj2+obj3+obj4+obj5) /5;
		ResDis = (dis1+dis2+dis3+dis4+dis5) /5;
		
		System.out.println("media de objetiva:" + ResObj);
		System.out.println("medio das discurtivas: "+ ResDis);

	}

}
