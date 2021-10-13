package romanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanosTests {
	
	@Test
	public void cero() {
		assertEquals("", Romanos.convertir(0));
	}

	@Test
	public void RomanosHasta3999() {
		assertEquals("I", Romanos.convertir(1));
		assertEquals("II", Romanos.convertir(2));
		assertEquals("III", Romanos.convertir(3));
		
		assertEquals("IV", Romanos.convertir(4));
		assertEquals("V", Romanos.convertir(5));
		assertEquals("VI", Romanos.convertir(6));
		assertEquals("VII", Romanos.convertir(7));
		assertEquals("VIII", Romanos.convertir(8));
		
		assertEquals("IX", Romanos.convertir(9));
		assertEquals("X", Romanos.convertir(10));
		
		assertEquals("XV", Romanos.convertir(15));
		
		assertEquals("XXV", Romanos.convertir(25));
		
		assertEquals("XL", Romanos.convertir(40));
		assertEquals("L", Romanos.convertir(50));
		assertEquals("LX", Romanos.convertir(60));
		
		assertEquals("XC", Romanos.convertir(90));
		assertEquals("C", Romanos.convertir(100));
		
		assertEquals("CD", Romanos.convertir(400));
		assertEquals("D", Romanos.convertir(500));
		
		assertEquals("CM", Romanos.convertir(900));
		assertEquals("M", Romanos.convertir(1000));
		
	}
	
	@Test(expected = Error.class)
	public void negativos() {
		Romanos.convertir(-1);
	}

}
