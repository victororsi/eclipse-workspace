
public class Programa {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Eduardo");
		c1.setCpf("123.456.789-99");
		
		ContaCorrente cc = new ContaCorrente();
		cc.numeroConta = 123;
		cc.titular = c1;
		cc.depositar(5000.0);

		
		
		try {
			cc.sacar(1900);
		} catch (SaldoInsulficienteException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (SaqueExcedidoException e) {
			System.out.println(e.getMessage());		
		} catch (Exception e) {
			System.out.println("Erro inexplicavel");
		}
			
	
}
}
