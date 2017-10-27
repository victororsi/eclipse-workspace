
public abstract class Conta {
	protected int numeroConta;
	protected Cliente titular;
	protected double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public abstract double getSaldo();
	
	public abstract void depositar(double valor);
	
	
	public abstract boolean sacar (double valor);
	
	public abstract boolean transferir (Conta contaDestino, double valor);
	
	public void imprime() {
		
	System.out.println("Numero da conta: " + numeroConta);
	System.out.println("Nome do titular: " + titular.getNome());
	System.out.println("CPF: " + titular.getCpf());
	System.out.println("Saldo " + saldo);
	System.out.println("");

		
	}
	
}
