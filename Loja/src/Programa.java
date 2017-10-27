
public class Programa {
	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor();
		f1.setNome ("Victor");
		f1.setEndereco("Rua Clark");
		f1.setCnpj("32934343/0001");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Crystian");
		cliente.setEndereco("Av. Autonimista");
		cliente.setCpf("219.915.788-14");
		
		
		System.out.println("Fornecedor");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Endereço: " + f1.getEndereco());
		System.out.println("Cnpj: " + f1.getCnpj());
		System.out.println("");
		System.out.println("Cliente");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Cpf: " + cliente.getCpf());
		
	}
}
