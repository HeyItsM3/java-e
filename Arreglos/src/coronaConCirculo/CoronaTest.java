package coronaConCirculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import delegacionYcomposicion.CoronaCircular;

public class CoronaTest {

	private CoronaCircular corona;

	@Before
	public void setUp() {
		corona = new CoronaCircular(1,2);
	}
	
	@Test
	public void corotaTest() {
		assertEquals(1, corona.getRadioInterior(), 0.001);
		assertEquals(2, corona.getRadioExterior(), 0.001);
		assertEquals(9.4247, corona.getSuperficie(), 0.001);
		assertEquals(18.8495, corona.getPerimetro(), 0.001);
	}
	
	@Test(expected = Error.class)
	public void radioInteriorNegativoTest() {
		corona = new CoronaCircular(-4,6);
	}
	

	@Test(expected = Error.class)
	public void radioExteriorNegativoTest() {
		corona = new CoronaCircular(-4,-5);
	}
	
	@Test(expected = Error.class)
	public void radioExteriorCeroTest() {
		corona = new CoronaCircular(1,0);
	}
	
	@Test(expected = Error.class)
	public void radioInteriorCeroTest() {
		corona = new CoronaCircular(0,1);
	}
	
	@Test(expected = Error.class)
	public void radioInteriorMayorAlExteriorTest() {
		corona = new CoronaCircular(6,5);
	}
	

}
