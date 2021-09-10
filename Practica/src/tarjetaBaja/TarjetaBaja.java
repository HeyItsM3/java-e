package tarjetaBaja;

public class TarjetaBaja {
	private double saldo;
	private int contarViajesSubte;
	private int contarViajesCole;
	private final double VALOR_VIAJE_SUBTE = 19.50;
	private final double VALOR_VIAJE_COLECTIVO = 21.50;
    
	 /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
    	validarSaldoInicial(saldoInicial);
    	this.saldo = saldoInicial;
    	contarViajesSubte = 0;
    	contarViajesCole = 0;
    }
    
	private void validarSaldoInicial(double saldoInicial) {
		if (saldoInicial <= 0) {
			throw new Error("El saldo inicial no puede ser negativo ni cero");
		}
	}
	
	public TarjetaBaja() {
		this.saldo = 0;
		contarViajesSubte = 0;
		contarViajesCole = 0;
	}
    	
    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
    	return saldo;
    }

     /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) { 
    	this.saldo += monto;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     * @return 
     */

    
    public void pagarViajeEnColectivo() { 
    	validarSaldoParaViajeEnColectivo();
		this.saldo-= VALOR_VIAJE_COLECTIVO;
		contarViajesCole++;
    }
    
	private void validarSaldoParaViajeEnColectivo() {
		if (this.saldo < VALOR_VIAJE_COLECTIVO) {
			throw new Error("Saldo insuficiente para viajar en colectivo");
		}
	}
	

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */

    
    public void pagarViajeEnSubte() {
    	validarSaldoParaViajeEnSubte();
		this.saldo-= VALOR_VIAJE_SUBTE;
		contarViajesSubte++;
    }
    
	private void validarSaldoParaViajeEnSubte() {
		if (this.saldo < VALOR_VIAJE_SUBTE) {
			throw new Error("Saldo insuficiente para viajar en subte");
		}
	}

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
    	int viajesTotales = contarViajesSubte + contarViajesCole;
    	return viajesTotales;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() { 
    	return contarViajesCole;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() { 
    	return contarViajesSubte;
    }
}




/*	private double saldo;
int viajesColectivo, viajesSubte;
final double costoViajeColectivo = 21.5;
final double costoViajeSubte = 19.5;
public TarjetaBaja(double saldoInicial) {
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
}*/
