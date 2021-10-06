package empresa;

public class PlantaPermanente extends Empleado {
	private int aniosDeAntiguedad;
	private static int VALOR_ANIO_ANTIGUEDAD = 1000;
	private static int VALOR_HORA = 3000;

	public PlantaPermanente(int horasTrabajadas, int cantHijos, boolean casado, int aniosDeAntiguedad) {
		super(horasTrabajadas, cantHijos, casado);
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}

	protected int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

	@Override
	public double getSalario() {
		return this.aniosDeAntiguedad * PlantaPermanente.VALOR_ANIO_ANTIGUEDAD
				+ super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA + super.getSalarioFamiliar();
	}

}
