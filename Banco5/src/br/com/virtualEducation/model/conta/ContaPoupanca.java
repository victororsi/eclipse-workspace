package br.com.virtualEducation.model.conta;

import br.com.virtualEducation.service.ServicoBancario;

public class ContaPoupanca extends Conta implements ServicoBancario{

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo = valor;
		}
	}

	

	@Override
	public boolean transferir(Conta contaDestino, double valor) {
		if (saldo >= valor) {
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



	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
