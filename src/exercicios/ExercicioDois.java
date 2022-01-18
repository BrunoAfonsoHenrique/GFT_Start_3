package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) throws IOException{
		
	  	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int cont = 1; cont <= 10000; cont++) {
    		if (cont % N == 2) {
    			System.out.println(cont);
    		}
    			
    	}

	}

}
