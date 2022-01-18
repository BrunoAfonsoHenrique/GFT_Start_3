package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		int totalPositivos = 0;
		for(int cont = 0; cont <= 5; cont++) {
			

			num = leia.nextDouble();
			if(num > 0) {
				totalPositivos += 1;
			}
		
		}
		
			
		
	       System.out.println("" + totalPositivos + " valores positivos");
	    }

}

