
public class Programa extends EncriptaDecriptaOTP{
	  public static void main(String[] args){
          EncriptaDecriptaOTP otp = new EncriptaDecriptaOTP();
      String menssagem = "Luz TESTE ";
      String chave = "Luz Consulting";
      String msgCriptografada = otp.criptografa(menssagem, chave);
      
      String msgDecriptografada = otp.decriptografa(msgCriptografada, chave);
     
      System.out.println("Menssagem: "+menssagem);
      System.out.println("Chave: "+chave);
      System.out.println("Mensagem Criptografada: "+msgCriptografada);
      System.out.println("Mensagem Decriptografada: "+msgDecriptografada);
     
}

}
