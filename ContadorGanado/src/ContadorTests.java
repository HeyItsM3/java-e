import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContadorTests {
	Contador contador;
	
	@Before
	public void setup() {
		contador = new Contador();
	}
	
	@After
	public void tearDown() {
		contador = null;
	}

	@Test
	public void creacion() {
		assertNotNull(contador);
	}
	
	@Test
	public void puedeContar() {
		//Arrange
		Contador c = new Contador();
		
		//Act
		c.contar();
		
		//Assert
		assertEquals(1, c.mostrar());
	
		//Annihilate (no es necesario)
		c = null;
	}
	
	
	@Test
	public void reiniciaSinContar() {
		contador.reiniciar();
		assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void luegoDeContar() {
		contador.contar();
		contador.reiniciar();
		assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void cuenta100Veces() {
		for(int i = 0; i < 100; i++)
			contador.contar();
		assertEquals(100, contador.mostrar());
	}
	
	
	@Test
	public void cuenta50_000Veces() {
		for(int i = 0; i < 50_000; i++)
			contador.contar();
		assertEquals(50_000, contador.mostrar());
	}

}