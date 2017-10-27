
public class SistemaInterno {
	public void autenticaUsuario(Autenticavel a) {
		String login = "user";
		String senha = "654";
		
		if(a.autentica(login, senha)==true) {
			System.out.println("Seja bem-vindo ao Sistema!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
	

}
