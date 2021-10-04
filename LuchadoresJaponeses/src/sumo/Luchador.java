package sumo;

public class Luchador {
	private int peso;
	private int altura;

	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public boolean dominaA(Luchador otro) {
		boolean superaEnPeso = this.peso > otro.peso;
		boolean superaEnAltura = this.altura > otro.altura;
		boolean igualaEnAltura = this.altura == otro.altura;
		boolean igualaEnPeso = this.peso == otro.peso;

		return superaEnPeso && superaEnAltura 
			|| superaEnPeso && igualaEnAltura
			|| igualaEnPeso && superaEnAltura;
	}
}
