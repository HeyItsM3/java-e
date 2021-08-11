package inversiones;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AlmacenPagoTests {
	
	 AlmacenPago miInversion;
	
	@Test
    public void armar() {
		AlmacenPago miInversion = new AlmacenPago(1000, 0.24, 4);
		String[] verGanancia = miInversion.interesCompuesto();
		String[] gananciaEsperada = {"1268,2418","1608,4372","2039,8873","2587,0704"};
		assertArrayEquals(verGanancia, gananciaEsperada);
		
	}
	

}
