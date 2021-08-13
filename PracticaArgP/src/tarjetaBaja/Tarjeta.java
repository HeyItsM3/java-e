package tarjetaBaja;

public class Tarjeta {

		private double saldo;
		int viajesColectivo, viajesSubte;
		final double costoViajeColectivo = 21.5;
		final double costoViajeSubte = 19.5;
		
		public Tarjeta(double saldoInicial) {
			if (dineroValido(saldoInicial)) {
				this.saldo += saldoInicial;
			}
		}
		
		public double obtenerSaldo() {
			return this.saldo;
		}
		
		public void cargar(double dinero) {
			if (dineroValido(dinero)) {
				this.saldo += dinero;
			}
		}
		
		private boolean dineroValido(double dinero) {
			if (dinero < 0) {
				Error errorDineroInvalido = new Error("El dinero a cargar debe ser mayor a 0");
				throw errorDineroInvalido;
			}
			return (dinero >= 0);
		}
		
		public double contarViajesColectivo() {
			return viajesColectivo;
		}
		
		public double contarViajesSubte() {
			return viajesSubte;
		}
		
		public double contarViajes() {
			return viajesColectivo + viajesSubte;
		}
		
		public void pagarViajeEnColectivo() {
			if (!dineroSuficiente(costoViajeColectivo)) {
				Error noAlcanzaParaElViaje = new Error("Saldo insuficiente para viajar en colectivo");
				throw noAlcanzaParaElViaje;
			}
			viajesColectivo++;
			this.saldo -= costoViajeColectivo;
		}
		
		public void pagarViajeEnSubte() {
			if (!dineroSuficiente(costoViajeSubte)) {
				Error noAlcanzaParaElViaje = new Error("Saldo insuficiente para viajar en colectivo");
				throw noAlcanzaParaElViaje;
			}
			viajesSubte++;
			this.saldo -= costoViajeSubte;
		}
		
		
		private boolean dineroSuficiente(double costo) {
			return costo <= this.saldo;
		}
	}
