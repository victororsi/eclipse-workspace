import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		
		
		String codigo = "";
		try {
			Scanner leitor = new Scanner(new FileReader("texto.txt"));
			while(leitor.hasNextLine()) {
			codigo += leitor.nextLine();
		//	System.out.println(leitor.nextLine());
			
			System.out.println(codigo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
	}
}
