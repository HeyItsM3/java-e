package obtener24;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddSubMultDivTests {

	  @Test
	  public void test1() {
	    assertEquals("added", AddSubMultDiv.operation(12, 12));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("subtracted", AddSubMultDiv.operation(100, 76));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("multiplied", AddSubMultDiv.operation(6, 4));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("divided", AddSubMultDiv.operation(528, 22));
	  }
		
		@Test
	  public void test5() {
	    assertEquals("none", AddSubMultDiv.operation(10, 12));
	  }
	}

