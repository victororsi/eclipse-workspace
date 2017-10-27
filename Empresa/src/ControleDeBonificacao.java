
public class ControleDeBonificacao {
	private double totalDeBonus;
	
	
	
	public double getTotalDeBonus() {
		return totalDeBonus;
	}



	public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDeBonus += f.bonifica();
		
	}



}
