
public class Gerente extends Funcionario implements Autenticavel {
	
	

	public double bonifica(){
		return this.salario * 0.15;
	}
	

	
	public boolean calculaSalario(){
		if(this.salario > 1300) {
		this.salario = this.salario - (this.salario * 0.11);
		return true;
		} else {
			System.out.println("Valores inválidos");
			return false;
		}
	}

	public boolean calculaSalario (double horaExtra) {
		if (this.salario > 1300 ) {
		this.valorHorasExtra = (this.salario/30) / 8 * horaExtra;
		this.salario = this.salario - (this.salario*0.11) + valorHorasExtra;
		return true;
		} else {
			System.out.println("Valores inválidos");
			return false;
		}
	}



	@Override
	public boolean autentica(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
