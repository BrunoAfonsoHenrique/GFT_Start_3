package exercicios;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] TOPS = { 1, 3, 5, 10, 25, 50, 100};

		// escreva aqui o seu código
		int K = scan.nextInt(); // 7
		int valor = 0;
		for(int cont = 0; cont < TOPS.length; cont++) {
			
			if(K <= TOPS[cont]) {
				valor = TOPS[cont];
				break;
						
			}
		
		}
		System.out.println("Top " + valor);
		
	}

}
