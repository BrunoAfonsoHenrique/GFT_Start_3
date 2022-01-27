package desafiodobanco.teste;

import desafiodobanco.classes.Conta;
import desafiodobanco.classes.ContaCorrente;
import desafiodobanco.classes.ContaPoupanca;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100);
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.transferir(100, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();

	}

}
