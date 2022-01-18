package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class ExericioDoze {

	public static void main(String[] args) throws IOException{

		Scanner leia = new Scanner(System.in);
		
		double M[][] = new double[12][12];

		char op = leia.nextLine().toUpperCase().charAt(0);
		
		double soma = 0, total = 0, media = 0;

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M[l].length; c++) {

				M[l][c] = leia.nextDouble();

				if (c > l) {
					soma += M[l][c];
					total += 1;
				}

			}
		}

		if (op == 'M') {
			media = soma / total;
			System.out.printf(String.format("%.1f", media));
		} else if(op == 'S'){
			System.out.printf(String.format("%.1f", soma));
		}

	}
}
