package sumAnglesPolyg;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals; 

import org.junit.Test;

public class SumaAngulosPoligonoTest {

	@Test
	public void test001() { 
		assertEquals(180, SumaAngulosPoligono.sumOfAngles(3));
	}

	@Test
	public void test002() { 
		assertEquals(360, SumaAngulosPoligono.sumOfAngles(4));
	}

	@Test
	public void test003() { 
		assertEquals(540, SumaAngulosPoligono.sumOfAngles(5));
	}

	@Test
	public void test004() { 
		assertEquals(720, SumaAngulosPoligono.sumOfAngles(6));
	}

	@Test
	public void test005() { 
		assertEquals(900, SumaAngulosPoligono.sumOfAngles(7));
	}

	@Test
	public void test006() { 
		assertEquals(1080, SumaAngulosPoligono.sumOfAngles(8));
	}
}
