package strategy.pattern;

import strategy.anti_pattern.TipoViagem;



/**
 * Classe que representa a reserva de um voo 
 * @author emerson
 *
 */
public class ReservaVoo {
	
	private double tarifa;
	private CalculaTaxaStrategy calculaTaxaStrategy;
		
			
	

		

	
	public ReservaVoo(double tarifa, CalculaTaxaStrategy calculaTaxaStrategy) {
		this.tarifa = tarifa;
		this.calculaTaxaStrategy = calculaTaxaStrategy;
	}




	public double calculaTotal(){
				
		return tarifa + calculaTaxaStrategy.calculaTaxa(this);
		
	}




	public double getTarifa() {
		return tarifa;
	}




	




	




	
	
	
	

}
