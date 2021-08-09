package numeroMayor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExisteNumeroMayorTest {

	 @Test
	  public void test1() {
	    assertTrue(ExisteUnNumeroMayor.existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
	  }
	  @Test
	  public void test2() {
	    assertFalse(ExisteUnNumeroMayor.existsHigher(new int[] {1, 2, 3, 4, 5}, 8));
	  }
	  @Test
	  public void test3() {
	    assertTrue(ExisteUnNumeroMayor.existsHigher(new int[] {4, 3, 3, 3, 2, 2, 2}, 4));
	  }
	  @Test
	  public void test4() {
	    assertFalse(ExisteUnNumeroMayor.existsHigher(new int[] {2, 2, 2, 2}, 5));
	  }
	  @Test
	  public void test5() {
	    assertFalse(ExisteUnNumeroMayor.existsHigher(new int[] {}, 0));
	  }
	}

