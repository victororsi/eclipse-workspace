
public class Estoquista extends Funcionario implements Autenticavel{
	
	public boolean calculaSalario(){
		if(this.salario < 1600) {
		this.salario = this.salario - (this.salario * 0.06);
		return true;
		} else {
			System.out.println("Valores inválidos");
			return false;
		}
	}
	
	public boolean calculaSalario (double horaExtra) {
		if (this.salario < 1600 ) {
		this.valorHorasExtra = (this.salario/30) / 8 * horaExtra;
		this.salario = this.salario - (this.salario*0.06) + valorHorasExtra;
		return true;
		} else {
			System.out.println("Valores inválidos");
			return false;
		}
	}
	
	public double bonifica(){
		return this.salario * 0.10;
	}

	@Override
	public boolean autentica(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
