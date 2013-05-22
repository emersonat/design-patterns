package strategy.pattern;


public class TaxaViagemNacionalStrategy implements CalculaTaxaStrategy {

	/**
	 * Poreriamos ter uma logica complexa para calculo da taxa
	 */
	
	public double calculaTaxa(ReservaVoo reservaVoo) {
		
		return reservaVoo.getTarifa() * 0.10; // 10% de taxa 
		
	}

}
