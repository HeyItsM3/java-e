package empresa;

public class Gerente extends PlantaPermanente {
	private static int VALOR_ANIO_ANTIGUEDAD = 1500;
	private static int VALOR_HORA = 4000;

	public Gerente(int horasTrabajadas, int cantHijos, boolean casado, int aniosDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado, aniosDeAntiguedad);
		
	}

	@Override
	public double getSalario() {
		return super.getAniosDeAntiguedad() * Gerente.VALOR_ANIO_ANTIGUEDAD + super.getHorasTrabajadas() * Gerente.VALOR_HORA
				+ super.getSalarioFamiliar();
	}
}