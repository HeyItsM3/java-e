package palindromo;

import static org.junit.Assert.*;

import org.junit.Test;

import palindromos.Palindromo;

public class PalindromoTests {

	@Test
	public void test() {
		assertTrue(Palindromo.esPalindromo("oro"));
		assertTrue(Palindromo.esPalindromo("reconocer"));
		assertTrue(Palindromo.esPalindromo("orejero"));
		assertFalse(Palindromo.esPalindromo("loro"));
	}
	
	
	@Test 
	public void frasesConEspacios() {
		assertTrue(Palindromo.esPalindromo(
				"dabale arroz a la zorra el abad"));
	}

	@Test 
	public void frasesConMayusculas() {
		assertTrue(Palindromo.esPalindromo(
				"Dabale arroz a la Zorra el abad"));
	}
	
	@Test 
	public void frasesConTildes() {
		assertTrue(Palindromo.esPalindromo(
				"Dábale arroz a la Zorra el abad")); 
	}
	
	@Test 
	public void frasesConSignos() {
		assertTrue(Palindromo.esPalindromo(
				"Ana, la tacaña catalana")); 
	}

}
