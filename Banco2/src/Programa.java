
public class Programa {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Eduardo");
		cliente1.setCpf("210.915.788-14");
		
		ContaCorrente contacorrente = new ContaCorrente();
		contacorrente.numeroConta = 123;
		contacorrente.titular = cliente1;
		contacorrente.depositar(1000.0);
		contacorrente.sacar(200.00);
		
		contacorrente.imprime();
	
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Victor");
		cliente2.setCpf("111.225.723-14");
		
		ContaPoupanca contapoupanca = new ContaPoupanca();
		contapoupanca.numeroConta = 321;
		contapoupanca.titular = cliente2;
		contapoupanca.depositar(1000.0);

		contapoupanca.imprime();
	}
}
