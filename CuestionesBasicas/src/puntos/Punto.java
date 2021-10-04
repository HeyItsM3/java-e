package puntos;

public class Punto implements Cloneable, Comparable<Punto> {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return this.x;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	protected Punto clone() throws CloneNotSupportedException {
		return (Punto) super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
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
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	public Double getModulo() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	public int compareTo(Punto otro) {
		/*
		Double miModulo = getModulo();
		Double otroModulo = otro.getModulo();
		
		if(miModulo > otroModulo) {
			return 1;
		} else if(miModulo < otroModulo) {
			return -1;
		}
		return 0;
	
	*	return (int) (miModulo - otroModulo);
	*	return Double.compare(miModulo, otroModulo);
	*
	*/
		return getModulo().compareTo(otro.getModulo());
	}
}
