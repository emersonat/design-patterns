package strategy.anti_pattern;

public class TesteAntiPattern {
	
	public static void main(String[] args) {
		
		ReservaVooAntiPattern reserva = new ReservaVooAntiPattern(400.0, TipoViagem.NACIONAL);
				
		System.out.println( reserva.calculaTotal() );
		
	}
	

}
