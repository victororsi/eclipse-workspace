
public class Supervisor extends Funcionario implements Autenticavel {
	
	public boolean calculaSalario(){
		if(this.salario > 3500) {
		this.salario = this.salario - (this.salario * 0.15);
		return true;
		} else {
			System.out.println("Valores inv�lidos");
			return false;
		}
	}
	
	public boolean calculaSalario (double horaExtra) {
		if (this.salario > 3500 ) {
		this.valorHorasExtra = (this.salario/30) / 8 * horaExtra;
		this.salario = this.salario - (this.salario*0.15) + valorHorasExtra;
		return true;
		} else {
			System.out.println("Valores inv�lidos");
			return false;
		}
	}
	
	public double bonifica(){
		return this.salario * 0.20;
	}

	@Override
	public boolean autentica(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}