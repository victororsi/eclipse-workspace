
public class ContaCorrente extends Conta {

	public double getSaldo() {
			return this.saldo-= 0.10;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo = valor;
			this.saldo -= 0.10;
	}
	
	}
	
	public boolean sacar (double valor) {
		if (valor > 0) {
			this.saldo -= valor;
			this.saldo -= 0.10;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir (Conta contaDestino, double valor) {
		if (this.saldo >=valor) {
			this.saldo -= valor;
			this.saldo -= 0.10;
			contaDestino.saldo += valor;
			
			return true;
		} else {
			return false;
		}
	}
	
}
