package desafiodobanco.classes;

public class ContaCorrente extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("<<< Conta corrente >>>");
		imprimirInformações();
		
	}


}
