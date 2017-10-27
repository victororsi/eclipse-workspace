package br.com.virtualEducation.model.conta;

import br.com.virtualEducation.exception.SaldoInsuficienteException;
import br.com.virtualEducation.exception.SaqueExcedidoException;
import br.com.virtualEducation.service.ServicoBancario;

public class ContaCorrente extends Conta implements ServicoBancario{
	
	public double getSaldo() {
		return this.saldo -= 0.10;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo = valor;
			this.saldo -= 0.10;
		}
	}
	
	public void sacar(double valor) { 
		if(this.saldo >= valor) {
			this.saldo -= valor;
			this.saldo -= 0.10;				
		} else {
			throw new SaldoInsuficienteException("Saldo Insuficiente!");
		}	
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor inválido!");
		}
		if(valor > 2000) {
			throw new SaqueExcedidoException("Valor de saque não pode exceder R$2000.0");
		}
	}
	
	public boolean transferir(Conta contaDestino, double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			this.saldo -= 0.10;
			contaDestino.saldo += valor;
			return true;
		} else {
			return false;
		}					
		
	}
	
}
