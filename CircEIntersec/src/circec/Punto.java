package circec;

public class Punto {
	private double X;
	private double Y;

	public Punto(double x, double y) {
		this.X = x;
		this.Y = y;
	}
	
	public double getcoordenadaEnX() {
		return X;
	}
	
	public double getcoordenadaEnY() {
		return Y;
	}
}



// public class Punto {
// 	public void AsignarCoordenadasAlCentro1 (double Coordenada1,double Coordenada2) {
// 		System.out.println("-> El primer Centro tiene coordenas:");
// 		System.out.println(Coordenada1);
// 		System.out.println(Coordenada2);
// 	}
// 	public void AsignarCoordenadasAlCentro2 (double Coordenada3,double Coordenada4) {
// 		System.out.println("-> El Segundo Centro tiene coordenas:");
// 		System.out.println(Coordenada3);
// 		System.out.println(Coordenada4);
// 	}
// 	public double CalcularDistanciaEntreCentros (double X1,double Y1,double X2,double Y2) {
// 		double Distancia;
		
// 		Distancia = Math.sqrt(Math.pow(X2-X1,2)+Math.pow(Y2-Y1,2));
		
// 		return Distancia;
// 	}
// }