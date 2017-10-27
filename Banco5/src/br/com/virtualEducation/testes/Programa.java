package br.com.virtualEducation.testes;

import br.com.virtualEducation.exception.SaldoInsuficienteException;
import br.com.virtualEducation.exception.SaqueExcedidoException;
import br.com.virtualEducation.model.cliente.Cliente;
import br.com.virtualEducation.model.conta.ContaCorrente;

public class Programa {
	public static void main(String[] args)   {
		Cliente c1 = new Cliente();
		c1.setNome("Eduardo");
		c1.setCpf("123.456.789-99");
		
		ContaCorrente cc = new ContaCorrente();
		cc.setNumeroConta(123);
		cc.setTitular(c1);
		cc.depositar(5000.0);
		
		
		
		
		try {
			cc.sacar(2100);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (SaqueExcedidoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("outro erro qualquer");
		}	
		
			
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		 
		
		
	//	System.out.println(cc.getSaldo());	
			
			
		/*		
		Cliente c2 = new Cliente();
		c2.setNome("Eric");
		c2.setCpf("555.456.789-99");
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.numeroConta = 321;
		cp.titular = c2;
		cp.depositar(1000.0);
		cp.imprime();
		
		*/
		
	}
}
