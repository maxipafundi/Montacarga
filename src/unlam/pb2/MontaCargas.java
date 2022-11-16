package unlam.pb2;

import java.util.ArrayList;

public class MontaCargas {

	private Integer pesoMaximo;
	private Integer pesoActual;
	
	
	
	
	
	
	public MontaCargas(Integer pesoActual, Integer pesoMaximo) {
		this.pesoActual = pesoActual;
		this.pesoMaximo = pesoMaximo;
	}



	public void cargarMontacarga (Articulo articulo) throws SobrePeso {
		
		if(pesoActual <= pesoMaximo) {
			pesoActual = articulo.getPesoArticulo() + pesoActual;
			
		} else throw new SobrePeso("Peso excedido!!");
		
	}



	public Integer getPesoActual() {
		return pesoActual;
	}



	public void setPesoActual(Integer pesoActual) {
		this.pesoActual = pesoActual;
	}
	
	
	
}
