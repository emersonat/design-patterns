package strategy.pattern;

public class Teste {
	
	public static void main(String[] args) {
		
		// Estrategia de calculo de taxa
		CalculaTaxaStrategy taxaNacionalStrategy = new TaxaViagemNacionalStrategy();
		
		
		ReservaVoo reservaVoo = new ReservaVoo(400, taxaNacionalStrategy);
		
		System.out.println(reservaVoo.calculaTotal());
				
	}

}
