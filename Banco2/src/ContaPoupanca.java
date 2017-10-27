
public class ContaPoupanca extends Conta {

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo = valor;
	}
}

	@Override
	public boolean sacar(double valor) {
		if (valor > 0) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean transferir(Conta contaDestino, double valor) {
		if (saldo >=valor) {
			saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getSaldo() {
		return saldo;
	}

}
