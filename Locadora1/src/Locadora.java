class Programa{
	public static void main (String[] args){
		Filme filme = new Filme();
		filme.setCodigo (123);
		filme.setNome ("A Era do Gelo");
		filme.setValor (2.5);
		filme.devolver();
		
		filme.mostra();
		
		filme.retirar();
		
		filme.mostra();
		
		try {
			filme.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}