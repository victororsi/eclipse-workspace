package br.com.virtualEducation.exception;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
