package paquete;

public class Punto {
	private double coordenadaX;
	private double coordenadaY;

	public Punto(double coordenadaX, double coordenaday) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenaday;
	}

	public double obtenerX() {
		return this.coordenadaX;

	}

	public double obtenerY() {
		return this.coordenadaY;

	}

	public void cambiarX(double nuevoX) {
		this.coordenadaX = nuevoX;

	}

	public void cambiarY(double nuevoY) {
		this.coordenadaY = nuevoY;

	}

	public boolean estaSobreEjeX() {
		return this.coordenadaY == 0;
	}

	public boolean estaSobreEjeY() {
		return this.coordenadaX == 0;

	}

	public boolean esElOrigen() {
		return estaSobreEjeX() && estaSobreEjeY();
	}

	public static void main(String[] args) {
		Punto p1 = new Punto(2, 2);
		Punto p2 = new Punto(2, 2);
		System.out.println(p1.equals(2));
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(coordenadaX) != Double.doubleToLongBits(other.coordenadaX))
			return false;
		if (Double.doubleToLongBits(coordenadaY) != Double.doubleToLongBits(other.coordenadaY))
			return false;
		return true;
	}

}

