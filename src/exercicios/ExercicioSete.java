package exercicios;

import java.util.Scanner;
/**
 * 
 * Se a por��o vis�vel da lua no momento estiver entre 0 e 2%, por exemplo, 
 * � lua nova, se for entre 3 e 96% � lua crescente, se for entre 97 e 100% � 
 * lua cheia e se for entre 96 e 3% (diminuindo) � lua minguante.
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
