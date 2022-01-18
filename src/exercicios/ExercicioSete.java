package exercicios;

import java.util.Scanner;
/**
 * 
 * Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, 
 * é lua nova, se for entre 3 e 96% é lua crescente, se for entre 97 e 100% é 
 * lua cheia e se for entre 96 e 3% (diminuindo) é lua minguante.
 *
 */
public class ExercicioSete {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int inicio = leitor.nextInt(); // 97
		int fim = leitor.nextInt(); // 94

		if (inicio >= 0 && fim <= 2) {
			System.out.println("nova");
		} else if(fim > inicio && fim <= 96) {
			System.out.println("crescente");
		} else if(inicio > fim && fim <= 96) {
			System.out.println("minguante");
		} else {
			System.out.println("cheia");
		}
	}

}
