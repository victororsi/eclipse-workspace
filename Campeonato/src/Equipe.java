
public class Equipe extends Jogador{
	private String nome;
	private String cidade;
	private Tecnico tecnico;
	private Jogador jogadores[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public Jogador[] getJogador() {
		return jogadores;
	}
	public void setJogador(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

	public void adicionaJogador(Jogador jogador) {
		for(int i = 0; i< jogadores.length ; i++) {
			if(this.jogadores [i] == null) {
				this.jogadores[i] = jogador;
				break;
			}
		}
	}
	
}
