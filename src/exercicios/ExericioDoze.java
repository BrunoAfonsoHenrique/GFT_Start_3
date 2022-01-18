package exercicios;

import java.io.IOException;
import java.util.Scanner;

//public class ExericioDoze {

//	public static void main(String[] args) {
//
//		double M[][] = new double[12][12];
//
//		Scanner leia = new Scanner(System.in);
//
//		char op = leia.nextLine().toUpperCase().charAt(0);
//		double soma = 0, total = 0;
//		double media = 0;
//
//		for (int l = 0; l < M.length; l++) {
//			for (int c = 0; c < M[l].length; c++) {
//
//				M[l][c] = leia.nextDouble();
//
//				if (c > l) {
//					soma += M[l][c];
//					total += 1;
//				}
//
//			}
//		}
//		media = soma / total;
//
//		if (op == 'M') {
//			System.out.printf("%.1f", media);
//		} else if(op == 'S'){
//			System.out.printf("%.1f", soma);
//		}
//
//	}

import java.io.IOException;
import java.util.Scanner;

public class ExericioDoze {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double soma = 0;
		char O = leitor.next().toUpperCase().charAt(0);
		double[][] M = new double[12][12];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = leitor.nextDouble();
			}
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				if (j > i && j < M.length - i - 1)
					soma += M[i][j];
			}
		}

		if (O == 'M') {
			soma /= 30;
			System.out.println(String.format("%.1f", soma));
		}

	}

}
