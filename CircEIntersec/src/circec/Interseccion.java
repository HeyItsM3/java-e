package circec;

public class Interseccion {	
	public static void main(String[] args) {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(c1.intersectaCon(c2)); // true
	}
	
	
	// public static void main(String[] args) {
	// 	Punto Centro1 = new Punto();
	// 	Punto Centro2 = new Punto ();
	// 	Punto Distancia = new Punto ();
	// 	double DistanciaEntreCentros;
	// 	Circulo C1C2 = new Circulo ();
	// 	boolean Intersecci�n;
		
	// 	Centro1.AsignarCoordenadasAlCentro1(0, 0);
	// 	Centro2.AsignarCoordenadasAlCentro2(1, 1);
	// 	System.out.println("-> La distancia entre los centros es de:");
	// 	DistanciaEntreCentros = Distancia.CalcularDistanciaEntreCentros(0, 0, 1, 1);
	// 	System.out.println(DistanciaEntreCentros);
	// 	System.out.println("-> �Existe Intersecci�n?:");
	// 	Intersecci�n = C1C2.HayIntersecci�n(DistanciaEntreCentros, 2, 2);
	// 	System.out.println(Intersecci�n);
}}