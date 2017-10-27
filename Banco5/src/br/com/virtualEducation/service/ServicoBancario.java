package br.com.virtualEducation.service;

import br.com.virtualEducation.model.conta.Conta;

public interface ServicoBancario {
	double getSaldo(); 

	void depositar(double valor); 
	
	void sacar(double valor);
	
	boolean transferir(Conta contaDestino, double valor);
}
