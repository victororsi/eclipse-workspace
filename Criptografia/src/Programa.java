import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa extends EncriptaDecriptaOTP{
	  public static void main(String[] args){
      
		
		String testettt= "Agora sera que da certo";
		  String menssagem = testettt;
		  
		  
		  EncriptaDecriptaOTP otp = new EncriptaDecriptaOTP();
		  
		  try {
				Scanner leitor = new Scanner(new FileReader("texto.txt"));
				while(leitor.hasNextLine()) {
		//		this.menssagem += leitor.nextLine();
		//		System.out.println(leitor.nextLine());
				
				System.out.println(menssagem);
				}
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado");
			}
		  
		  
  //    String menssagem = "TESTE";
      String chave = "Luz Consulting";
      String msgCriptografada = otp.criptografa(menssagem, chave);
      
      String msgDecriptografada = otp.decriptografa(msgCriptografada, chave);
     
      System.out.println("Menssagem: "+menssagem);
      System.out.println("Chave: "+chave);
      System.out.println("Mensagem Criptografada: "+msgCriptografada);
      System.out.println("Mensagem Decriptografada: "+msgDecriptografada);
     
}

}
