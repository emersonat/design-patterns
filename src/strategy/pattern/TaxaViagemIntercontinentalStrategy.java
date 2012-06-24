package strategy.pattern;

public class TaxaViagemIntercontinentalStrategy implements CalculaTaxaStrategy {
	
	/**
	 * Poderiamos ter uma logica complexa para calculo da taxa
	 */
	@Override
	public double calculaTaxa(ReservaVoo reservaVoo) {
		
		return reservaVoo.getTarifa() * 0.15; // 15% de taxa 
		
	}

}
