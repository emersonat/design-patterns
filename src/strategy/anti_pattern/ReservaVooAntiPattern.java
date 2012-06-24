package strategy.anti_pattern;


/**
 * Classe que representa a reserva de um voo
 * @author emerson
 *
 */
public class ReservaVooAntiPattern {
	
	private double tarifa;
	private TipoViagem tipoViagem;
		
			
	public ReservaVooAntiPattern(double tarifa, TipoViagem tipoViagem) {
		this.tarifa = tarifa;
		this.tipoViagem = tipoViagem;
	}

		

	/**
	 * Problema: 
	 * Conforme forem adicionadas novos tipos de viagens a tendência de desse metodo
	 * e ir crescendo cada vez mais, imagine se em cada bloco do IF tivessemos uma 
	 * logica complexa para terminar o valor da taxa.
	 * 
	 * Mesmo que dividicemos cada calculo de taxa em um metodo separado a tendência 
	 * seria conforme forem adicionados outros tipos de viagens a classe ir inchando 
	 * cada vez mais.
	 * @return
	 */
	public double calculaTotal(){
				
		if(tipoViagem.equals(TipoViagem.NACIONAL) ){
			
			return tarifa +=  tarifa * 0.10; // 10% de taxa 
			
		} else if(tipoViagem.equals(TipoViagem.INERNACIONAL) ){
			
			return tarifa +=  tarifa * 0.15; // 15% de taxa
			
		} else {
			
			return tarifa +=  tarifa * 0.25; // 25% de taxa 
			
		}
		
	}
	
	

}
