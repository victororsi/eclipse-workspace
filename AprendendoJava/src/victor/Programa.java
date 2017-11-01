package victor;

public class Programa {
	public static void main(String[] args) {
		
		Pessoas p1 = new Pessoas();
		p1.setNome("Crystian");
		p1.setRg("29.827.938-14");
		
		Pessoas p2 = new Pessoas();
		p2.setNome("Victor");
		p2.setRg("30.476.907-1");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Rg: " + p1.getRg());
		System.out.println("");
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Rg: " + p2.getRg());
		System.out.println("");
		
	}

}
