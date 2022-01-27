package desafiodobanco.classes;

public abstract class Conta implements IConta {

	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldoContaCorrente;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		this.saldoContaCorrente -= valor;

	}

	@Override
	public void depositar(double valor) {
		this.saldoContaCorrente += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoContaCorrente() {
		return saldoContaCorrente;
	}
	
	
	protected void imprimirInformações() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldoContaCorrente));
	}

}
