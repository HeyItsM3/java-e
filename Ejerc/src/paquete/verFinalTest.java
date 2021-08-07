package paquete;

import static org.junit.Assert.*;

import org.junit.Test;

public class verFinalTest {

	@Test
	public void test1() {
		assertEquals("Nope!", true, verFinal.checkEnding("abc", "bc"));
	}

	@Test
	public void test2() {
		assertEquals("Nope!", false, verFinal.checkEnding("abc", "d"));
	}

	@Test
	public void test3() {
		assertEquals("Nope!", false, verFinal.checkEnding("samurai", "zi"));
	}

	@Test
	public void test4() {
		assertEquals("Nope!", true, verFinal.checkEnding("feminine", "nine"));
	}

	@Test
	public void test5() {
		assertEquals("Nope!", false, verFinal.checkEnding("convention", "tio"));
	}

	@Test
	public void test6() {
		assertEquals("Nope!", false, verFinal.checkEnding("cooperative", "ooper"));
	}

	@Test
	public void test7() {
		assertEquals("Nope!", true, verFinal.checkEnding("extraterrestrial", "xtraterrestrial"));
	}

	@Test
	public void test8() {
		assertEquals("Nope!", true, verFinal.checkEnding("access", "ss"));
	}

	@Test
	public void test9() {
		assertEquals("Nope!", false, verFinal.checkEnding("motorist", "is"));
	}
}
