import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Programa3 {
	public static void main(String[] args) {
		
		try {
			PrintStream gravador = new PrintStream("saida.txt");
			gravador.println("Ol�, meu nome � Tiburcio, meu nome � feio mas eu sou bonito");
			gravador.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado");
		}
	}
}
