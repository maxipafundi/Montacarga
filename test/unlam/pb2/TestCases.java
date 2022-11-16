package unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestCases {

	
	@Test (expected = SobrePeso.class)
	public void QueSePuedaCrearUnMontacargas() throws SobrePeso {
		
		MontaCargas montacarga1 = new MontaCargas(0, 200);
			
		Articulo articulo1 = new Articulo (1, 20);
		Articulo articulo2 = new Articulo (1, 80);
		Articulo articulo3 = new Articulo (1, 200);
		Articulo articulo4 = new Articulo (1, 20);
		
		
		montacarga1.cargarMontacarga(articulo1);
		montacarga1.cargarMontacarga(articulo3);
		montacarga1.cargarMontacarga(articulo3);
		
		System.out.println(montacarga1.getPesoActual());
		
		
	}

}
