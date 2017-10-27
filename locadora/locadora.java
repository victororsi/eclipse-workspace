class Filme {
	int codigo;
	String nome;
	double valor;
	boolean disponivel;
	
	void retirar(){
		disponivel = false;
	}
	void devolver(){
		disponivel = true;
	}
}

class Programa{
	public static void main (String[] args){
		Filme filme = new Filme();
		filme.codigo = 1;
		filme.nome = "A Era do Gelo";
		filme.valor = 2.5;
		filme.retirar();

		if (filme.disponivel==true){
			System.out.println("Esta disponivel");
		} else {
			System.out.println("Nao esta disponivel");
		}

		filme.devolver();
				if (filme.disponivel==true){
			System.out.println("Esta disponivel");
		} else {
			System.out.println("Nao esta disponivel");
		}

		
		
		Filme filme2 = new Filme();
		filme2.codigo = 2;
		filme2.nome = "A Era do Gelo2";
		filme2.valor = 3.5;
		
		
		System.out.println("Endereco memoria "+filme);
		System.out.println("Nome do filme: " + filme.nome);
		System.out.println("Codigo do filme; " + filme.codigo);
		System.out.println("Valor locacao :" + filme.valor);
		System.out.println("  ");
		System.out.println("Endereco memoria " + filme2);
		System.out.println("Nome do filme: " + filme2.nome);
		System.out.println("Codigo do filme; " + filme2.codigo);
		System.out.println("Valor locacao :" + filme2.valor);
	}
}