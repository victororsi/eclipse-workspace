package br.com.virtualEducation.model.cliente;

public class Cliente {
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprime() {
		System.out.println(nome);
		System.out.println(cpf);
	}
}
