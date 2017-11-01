import java.math.BigDecimal;

public class CalculoTempo {
	
		static double horaTrabalhada;
		
		
		public static double truncate(Double valor, int precisao) {
			BigDecimal bd = BigDecimal.valueOf(valor);
			bd = bd.setScale(precisao, BigDecimal.ROUND_DOWN);
			return bd.doubleValue();
		}

		public static void calculaSalario (double v1, double v2) {
			horaTrabalhada = v2-v1;
			System.out.println("Total de horas trabalhadas: "+ truncate(horaTrabalhada,2) + "h");
		}
		
}


