package exercicios;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		int a, b, prod;
		
		Scanner leia = new Scanner(System.in);
		
		a = leia.nextInt();
		b = leia.nextInt();
		
		prod = a * b;
		
		System.out.println("PROD = " + prod);
		

	}

}
