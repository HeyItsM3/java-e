package nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NotaTests {

	Nota n1;

	@Before
	public void iniciarTest() {
		Nota n1 = new Nota(4);
		assertNotNull(n1);
	}

	@Test
	public void obtenerTest() {
		n1 = new Nota(4);
		int esperado = 4;
		int obtenido = n1.obtenerValor();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void aprobadoTest() {
		Nota nAp = new Nota(10);
		assertTrue(nAp.aprobado());
	}

	@Test(expected = Error.class)
	public void notaFalsaTest() {
		Nota notaFalsa = new Nota(11);
	}

	@Test
	public void desaprobadoTest() {
		Nota notaInsuf = new Nota(3);
		assertFalse(notaInsuf.aprobado());
	}
	
	@Test
	public void recuperarTest() {
		Nota notaPar1 = new Nota(2);
		assertTrue(notaPar1.desaprobado());
		notaPar1.recuperar(8);
		assertEquals(8, notaPar1.obtenerValor());
		assertTrue(notaPar1.aprobado());
	}
}
