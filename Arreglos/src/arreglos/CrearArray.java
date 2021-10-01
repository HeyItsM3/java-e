package arreglos;

import java.util.Arrays;

public class CrearArray {

	// Devuelve un array de caracteres
	// por eso se define public char[]

	public char[] createArray() {
		char s[];
		s = new char[26];
		for (int i = 0; i < 26; i++) {
			s[i] = (char) ('A' + i); // Se puede sumar enteros con char ya que tiene comillas simples
										// ya que es 65 en la tabla ASCII, luego se castea a char
		}
		return s;
	}

	// Array de tipo clase

	public class Punto {
		double x;
		double y;

		public Punto(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return "[" + x + "," + y + "]";
		}
	}

	public Punto[] createArray(int tam) {
		Punto[] p = new Punto[tam];
		for (int i = 0; i < tam; i++) {
			p[i] = new Punto(i, i + 1);
		}
		return p;
		}
		// Otra forma de declarar

		/*String names[];
		names = new String[3];
		names[0] = "Georgianna";
		names[1] = "Jen";
		names[2] = "Simon";
		*/
		// otro más solo al momento de declalar el arreglo.
		
			// String names[] = { "Georgianna", "Jen", "Simon" };
		
		//
		
		
		// Copiar un array por posicion
		
		Punto [] puntos = new Punto[10];{
		for(
		int i = 0;i<puntos.length;i++)
		{
			puntos[i] = new Punto(i, i + 1);
		}
		
		//CopyOfRange tiene 3 parametros (el array que quiero copiar, posicion de inicio, posicion final)
		Punto[] otrosPuntos = Arrays.copyOfRange(puntos, 0, puntos.length);
		
		for(Punto punto:otrosPuntos)
		{
			System.out.println(punto);
		}
	}

	

}
