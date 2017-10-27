package br.com.virtualEducation.model.conta;

import br.com.virtualEducation.model.cliente.Cliente;


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

	
		
	public void imprime() {
		System.out.println("Número da conta:" + numeroConta);
		System.out.println("Nome do titular:" + titular.getNome());
		System.out.println("Cpf do titular:" + titular.getCpf());
		System.out.println("Saldo: R$"+saldo);
	}

}
