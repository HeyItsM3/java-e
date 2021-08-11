package contarVocales;

import static org.junit.Assert.*;

import org.junit.Test;

public class VowelsTest {
	@Test
	public void test1() {
		assertEquals("Nope!", 5, Vowels.getCount("CelebratiOn"));
	}

	@Test
	public void test2() {
		assertEquals("Nope!", 1, Vowels.getCount("PAlm"));
	}

	@Test
	public void test3() {
		assertEquals("Nope!", 4, Vowels.getCount("Prediction"));
	}

	@Test
	public void test4() {
		assertEquals("Nope!", 3, Vowels.getCount("Suite"));
	}

	@Test
	public void test5() {
		assertEquals("Nope!", 3, Vowels.getCount("Quote"));
	}

	@Test
	public void test6() {
		assertEquals("Nope!", 3, Vowels.getCount("Portrait"));
	}

	@Test
	public void test7() {
		assertEquals("Nope!", 2, Vowels.getCount("Steam"));
	}

	@Test
	public void test8() {
		assertEquals("Nope!", 2, Vowels.getCount("Tape"));
	}

	@Test
	public void test9() {
		assertEquals("Nope!", 3, Vowels.getCount("Nightmare"));
	}

	@Test
	public void test10() {
		assertEquals("Nope!", 4, Vowels.getCount("Convention"));
	}
}