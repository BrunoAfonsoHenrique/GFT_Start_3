package desafiodobanco.classes;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("<<< Conta poupan�a >>>");
		imprimirInforma��es();
		
	}

}
