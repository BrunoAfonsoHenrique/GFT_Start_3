package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int T = leitor.nextInt(); // 3
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    		B = leitor.nextInt(); // Valor do Bonus 5
    		
    		A1 = leitor.nextInt(); // valor de ataque 12
    		D1 = leitor.nextInt(); // valor de defesa  13
    		L1 = leitor.nextInt(); // level do treinador 15
    		
    		A2 = leitor.nextInt(); // valor de ataque 42
    		D2 = leitor.nextInt(); // valor de defesa 12
    		L2 = leitor.nextInt(); // level do treinador 20

    		V1 = ((A1 + D1) / 2) + (L1 % 2 == 0 ? B : 0);
    		V2 = ((A2 + D2) / 2) + (L2 % 2 == 0 ? B : 0);
    		
    		if ( V1 > V2        ) System.out.println("Bruno");
    		else if (    V2 > V1     ) System.out.println("Guarte");
    		else System.out.println("Empate");
    	}
    }

}
