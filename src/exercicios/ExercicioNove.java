package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) throws IOException {
		
		Scanner leitor = new Scanner(System.in);
		
		int senha = leitor.nextInt();
		do {
			if(senha != 2002) {
				System.out.println("Senha Invalida");
				senha = leitor.nextInt();
			}
			else {
				break;
			}
		} while(senha != 2002);
		
		System.out.println("Acesso Permitido");
	}

}
