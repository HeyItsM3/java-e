package circec;

public class Circulo {

	private Punto medio;
	private double radio;

	private double getEspacioEntrePuntos(Circulo es) {
		double xPosit = this.medio.getcoordenadaEnX();
		double yPosit = this.medio.getcoordenadaEnY();
		double xNegat = es.medio.getcoordenadaEnX();
		double yNegat = es.medio.getcoordenadaEnY();
		double distancia = Math.sqrt(Math.pow((xPosit - xNegat), 2) + Math.pow((yPosit - yNegat), 2));
		return distancia;
	}

	public Circulo(Punto mid, double i) {
		medio = mid;
		setRad(i);
	}

	private void setRad(double rad) {
		this.radio = rad;
	}

	private double getSumaEntreRadios(Circulo i) {
		return this.radio + i.radio;
	}

	public boolean intersectaCon(Circulo i) {
		double distMedios = getEspacioEntrePuntos(i);
		double sumaDeradios = getSumaEntreRadios(i);

		if (sumaDeradios > distMedios) {
			return true;
		} else {
			return false;
		}
	}

}


// public class Circulo {
// 	public boolean HayIntersecci�n (double Distancia,double Radio1,double Radio2) {
		
// 		return Radio1+Radio2 > Distancia;
// 	}
// }



