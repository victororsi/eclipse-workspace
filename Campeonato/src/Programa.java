
public class Programa {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		jogador1.nome = "Eduardo";
		jogador1.dataNascimento = "13/11/1982";
		jogador1.setPosicao("Atacante");
		
		Jogador jogador2 = new Jogador();
		jogador2.nome = "Victor";
		jogador2.dataNascimento = "14/05/1981";
		jogador2.setPosicao("Armador");
		
		Jogador jogador3 = new Jogador();
		jogador3.nome = "Roberto Carlos";
		jogador3.dataNascimento = "17/01/1977";
		jogador3.setPosicao("Lateral Esquerdo");
		
		Jogador jogador4 = new Jogador();
		jogador4.nome = "Cafu";
		jogador4.dataNascimento = "22/11/1979";
		jogador4.setPosicao("Lateral Direito");
		
		Jogador jogador5 = new Jogador();
		jogador5.nome = "Zinho";
		jogador5.dataNascimento = "13/11/1982";
		jogador5.setPosicao("Meio Campo");
		
		Jogador jogador6 = new Jogador();
		jogador6.nome = "Evair";
		jogador6.dataNascimento = "13/11/1982";
		jogador6.setPosicao("Meio Campo");
		
		Jogador jogador7 = new Jogador();
		jogador7.nome = "Eduardo";
		jogador7.dataNascimento = "11/05/1982";
		jogador7.setPosicao("Atacante");
		
		Jogador jogador8 = new Jogador();
		jogador8.nome = "Tonh�o";
		jogador8.dataNascimento = "13/01/1981";
		jogador8.setPosicao("Defesa");
		
		Jogador jogador9 = new Jogador();
		jogador9.nome = "Antonio Carlos";
		jogador9.dataNascimento = "09/09/1980";
		jogador9.setPosicao("Defesa");
		
		Jogador jogador10 = new Jogador();
		jogador10.nome = "Roque Junior";
		jogador10.dataNascimento = "03/11/1979";
		jogador10.setPosicao("Defesa");
		
		Jogador jogador11 = new Jogador();
		jogador11.nome = "Marcos";
		jogador11.dataNascimento = "09/12/1982";
		jogador11.setPosicao("Goleiro");
		
		Jogador[] jogadores1 = new Jogador[11];

		Tecnico tecnico1 = new Tecnico();
		tecnico1.nome = "Rubens Barrichelo";
		tecnico1.dataNascimento = "10/02/1970";
		tecnico1.setEspecialidade("Chegar lento");

		Equipe equipe1 = new Equipe();
		equipe1.setNome("Palmeiras");
		equipe1.setCidade("SP");
		equipe1.setTecnico(tecnico1);
		equipe1.setJogador(jogadores1);
		equipe1.adicionaJogador(jogador1);
		equipe1.adicionaJogador(jogador2);
		equipe1.adicionaJogador(jogador3);
		equipe1.adicionaJogador(jogador4);
		equipe1.adicionaJogador(jogador5);
		equipe1.adicionaJogador(jogador6);
		equipe1.adicionaJogador(jogador7);
		equipe1.adicionaJogador(jogador8);
		equipe1.adicionaJogador(jogador9);
		equipe1.adicionaJogador(jogador10);
		equipe1.adicionaJogador(jogador11);
		
		Jogador jogador21 = new Jogador();
		jogador21.nome = "Eduardo";
		jogador21.dataNascimento = "13/11/1982";
		jogador21.setPosicao("Atacante");
		
		Jogador jogador22 = new Jogador();
		jogador22.nome = "Victor";
		jogador22.dataNascimento = "14/05/1981";
		jogador22.setPosicao("Armador");
		
		Jogador jogador23 = new Jogador();
		jogador23.nome = "Roberto Carlos";
		jogador23.dataNascimento = "17/01/1977";
		jogador23.setPosicao("Lateral Esquerdo");
		
		Jogador jogador24 = new Jogador();
		jogador24.nome = "Cafu";
		jogador24.dataNascimento = "22/11/1979";
		jogador24.setPosicao("Lateral Direito");
		
		Jogador jogador25 = new Jogador();
		jogador25.nome = "Zinho";
		jogador25.dataNascimento = "13/11/1982";
		jogador25.setPosicao("Meio Campo");
		
		Jogador jogador26 = new Jogador();
		jogador26.nome = "Evair";
		jogador26.dataNascimento = "13/11/1982";
		jogador26.setPosicao("Meio Campo");
		
		Jogador jogador27 = new Jogador();
		jogador27.nome = "Eduardo";
		jogador27.dataNascimento = "11/05/1982";
		jogador27.setPosicao("Atacante");
		
		Jogador jogador28 = new Jogador();
		jogador28.nome = "Tonh�o";
		jogador28.dataNascimento = "13/01/1981";
		jogador28.setPosicao("Defesa");
		
		Jogador jogador29 = new Jogador();
		jogador29.nome = "Antonio Carlos";
		jogador29.dataNascimento = "09/09/1980";
		jogador29.setPosicao("Defesa");
		
		Jogador jogador30 = new Jogador();
		jogador30.nome = "Roque Junior";
		jogador30.dataNascimento = "03/11/1979";
		jogador30.setPosicao("Defesa");
		
		Jogador jogador31 = new Jogador();
		jogador31.nome = "Marcos";
		jogador31.dataNascimento = "09/12/1982";
		jogador31.setPosicao("Goleiro");
		
		Jogador[] jogadores2 = new Jogador[11];
		
		Tecnico tecnico2 = new Tecnico();
		tecnico2.nome = "Felip�o";
		tecnico2.dataNascimento = "19/09/1960";
		tecnico2.setEspecialidade("Churrasco");
		
		Equipe equipe2 = new Equipe();
		equipe2.setNome("Barcelona");
		equipe2.setCidade("Barcelona");
		equipe2.setTecnico(tecnico2);
		equipe2.setJogador(jogadores2);
		equipe2.adicionaJogador(jogador21);
		equipe2.adicionaJogador(jogador22);
		equipe2.adicionaJogador(jogador23);
		equipe2.adicionaJogador(jogador24);
		equipe2.adicionaJogador(jogador25);
		equipe2.adicionaJogador(jogador26);
		equipe2.adicionaJogador(jogador27);
		equipe2.adicionaJogador(jogador28);
		equipe2.adicionaJogador(jogador29);
		equipe2.adicionaJogador(jogador30);
		equipe2.adicionaJogador(jogador31);
		
		Partida p = new Partida();
		p.setEquipe(equipe1);
		p.setEquipe(equipe2);
		p.setData("16/01/2016");
		p.setEstadio("Pacaembu");
		
		System.out.println("------------------------ COPA PAULISTA ------------------------");
		System.out.println("Partida: " + p.getEquipe(equipe1).getNome() + " X " + p.getEquipe(equipe2).getNome());
		System.out.println("Est�dio: " + p.getEstadio());
		System.out.println("Data: " + p.getData());
		System.out.println("");
		System.out.println("----------------- Informa��es do time da casa -----------------");
		System.out.println("Nome do clube: " + equipe1.getNome());
		System.out.println("T�cnico: " + equipe1.getTecnico().getNome());
		System.out.println("Especialidade: " + equipe1.getTecnico().getEspecialidade());
		System.out.println("Destaque do Time: " + jogador2.nome);
		System.out.println("Posi��o: " + jogador2.getPosicao());
		System.out.println("Data de Nascimento: " + jogador2.dataNascimento);
		
		System.out.println("");
		System.out.println("------------------- Escala��o "+ equipe1.getNome() + " -------------------");
		for (Jogador j : equipe1.getJogador()) {
			System.out.println(j.nome + " - " + j.getPosicao());
		}
		
	     String menssagem = "Luz TESTE /n";
	     menssagem += "linha2 /n";
		
		System.out.println("");
		System.out.println("----------------- Informa��es " + equipe2.getNome() +" -----------------");
		System.out.println("Nome do clube: " + equipe2.getNome());
		System.out.println("T�cnico: " + equipe2.getTecnico().getNome());
		System.out.println("Especialidade: " + equipe2.getTecnico().getEspecialidade());
		System.out.println("Destaque do Time: " + jogador22.nome);
		System.out.println("Posi��o: " + jogador22.getPosicao());
		System.out.println("Data de Nascimento: " + jogador22.dataNascimento);
		
		System.out.println("");
		System.out.println("------------------- Escala��o "+ equipe2.getNome() + " -------------------");
		for (Jogador j : equipe2.getJogador()) {
			System.out.println(j.nome + " - " + j.getPosicao());
			
			System.out.println(menssagem);
		}
	
	}
}
