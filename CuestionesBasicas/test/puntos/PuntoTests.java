package puntos;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PuntoTests {

	@Test
	public void test() {
		Punto p1 = new Punto(3,4);
		assertEquals("(3.0, 4.0)",p1.toString());
	}
	
	@Test 
	public void quePuedoClonar() throws CloneNotSupportedException {
		Punto punto = new Punto(3,4);
		Punto clon = punto.clone();
		
		assertNotSame(punto, clon);
		assertEquals(punto, clon);
	}
	
	@Test 
	public void equals() {
		Punto uno = new Punto(3,4);
		Punto dos = new Punto(3,4);
		Punto tres = new Punto(3,4);
		
		Punto cuatro = new Punto(5,6);
		
		
		//Reflexividad
		assertEquals(uno,uno);
		
		//Simetria
		assertEquals(uno,dos);
		assertEquals(dos,uno);
		
		//Transitividad
		assertEquals(uno,dos);
		assertEquals(dos,tres);
		assertEquals(uno,tres);
		 
		//Falsedad ante null
		assertNotEquals(uno,null);
		
		//Distintos
		assertNotEquals(uno,cuatro);
	}
	
	
	
	@Test
	public void hashcode() {
		Punto uno = new Punto(3,4);
		Punto dos = new Punto(3,4);
		
		Punto cuatro = new Punto(5,6);
		
		//Consistencia ante la igualdad
		assertEquals(uno, dos);
		assertEquals(uno.hashCode(), dos.hashCode());
		
		assertNotEquals(uno.hashCode(), cuatro.hashCode());
		
	}
	
	@Test 
	public void modulo() {
		Punto uno = new Punto(3,4);
		assertEquals(5.0, uno.getModulo(), 0);
		
		Punto dos = new Punto(-3,-4);
		assertEquals(5.0, dos.getModulo(), 0);
	}
	
	@Test
	public void compareTo() {
		Punto uno = new Punto(3,4);
		Punto dos = new Punto(4,5);
		
		Punto tres = new Punto(3,4);
		
		
		assertTrue(uno.compareTo(dos)<0);
		assertTrue(dos.compareTo(uno)>0);
		assertEquals(0, uno.compareTo(tres));
	}
	
	@Test
	public void ordenar2() {
		Punto[] puntos = {
				new Punto(2,3),
				new Punto(4,5),
				new Punto(0,0),
				new Punto(1,1)
		};
		System.out.println(Arrays.toString(puntos));
		
		Arrays.sort(puntos, new ComparadorPorModulo());
		
		System.out.println(Arrays.toString(puntos));
	}
	
	@Test
	public void ordenar3() {
		Punto[] puntos = {
				new Punto(4,5),
				new Punto(0,0),
				new Punto(-2,3),
				new Punto(1,1)
		};
		System.out.println(Arrays.toString(puntos));
		
		Arrays.sort(puntos, new ComparadorPorEquis());
		
		System.out.println(Arrays.toString(puntos));
	}

}
