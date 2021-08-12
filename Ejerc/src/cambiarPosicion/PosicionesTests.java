package cambiarPosicion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PosicionesTests {

	@Test
	  public void test1() {
	    assertEquals("Trump Donald", Posiciones.nameShuffle("Donald Trump"));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("O'Donnel Rosie", Posiciones.nameShuffle("Rosie O'Donnel"));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("Butts Seymour", Posiciones.nameShuffle("Seymour Butts"));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("Greene Ebony", Posiciones.nameShuffle("Ebony Greene"));
	  }
		
		@Test
	  public void test5() {
	    assertEquals("Kennedy Ken", Posiciones.nameShuffle("Ken Kennedy"));
	  }
		
		@Test
	  public void test6() {
	    assertEquals("Gonzalez Allison", Posiciones.nameShuffle("Allison Gonzalez"));
	  }
		
		@Test
	  public void test7() {
	    assertEquals("Frazier Albert", Posiciones.nameShuffle("Albert Frazier"));
	  }
		
		@Test
	  public void test8() {
	    assertEquals("Hopkins Eloise", Posiciones.nameShuffle("Eloise Hopkins"));
	  }
		
		@Test
	  public void test9() {
	    assertEquals("Welch Donnie", Posiciones.nameShuffle("Donnie Welch"));
	  }
		
		@Test
	  public void test10() {
	    assertEquals("Thomas Vernon", Posiciones.nameShuffle("Vernon Thomas"));
	  }
}


