package circulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTests {
	Circulo c1;

	@Test
	public void creaCirculoParametrizadoTest() {
		c1 = new Circulo(2);
		assertNotNull(c1);
	}
	
	@Test
	public void creaCirculoParametrizadoYpidoRadioTest() {
		c1 = new Circulo(2);
		assertEquals(2, c1.getRadio(), 0.0001);
	}

	@Test
	public void creaCirculoPorDefectoTest() {
		c1 = new Circulo();
		assertNotNull(c1);
	}
	
	@Test
	public void creaCirculoPorDefectoParametrizadoYpidoRadioTest() {
		c1 = new Circulo();
		assertEquals(1, c1.getRadio(), 0.0001);
	}
	
	@Test
	public void referenciasIgualesTest() {
		Circulo c = new Circulo();
		Circulo o = c;
		assertTrue(o == c);
		assertTrue(c.equals(o));
	}
	
	@Test
	public void referenciasDistintasTest() {
		Circulo c = new Circulo();
		Circulo o = new Circulo();  
		assertFalse(o == c);
		assertTrue(c.equals(o));
	}
	
	@Test(expected = Error.class)
	public void radioInvalidoTest() {
		Circulo c = new Circulo(-2);
	}
	
}
