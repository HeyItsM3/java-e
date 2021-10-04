package sumo;

public class PreTorneo {
	private Luchador luchadores[];
	private int cantidadActual; //Como necesito que comience en 0 no hace falta inicializar 
								//ya que los ints en su elemento neutro comienza en 0

	public PreTorneo(int cantidadDeParticipantes) {
		luchadores = new Luchador[cantidadDeParticipantes];
	}

	public void agregar(Luchador luchador) {
		luchadores[cantidadActual++] = luchador;
	}

	public int[] calcularDominios() {
		int dominios[] = new int[luchadores.length];
		
		for (int i = 0; i < luchadores.length - 1; i++) {
			Luchador referencia = luchadores[i];
			for (int j = i + 1; j < luchadores.length; j++) {
				Luchador otro = luchadores[j];
				if (referencia.dominaA(otro))
					dominios[i]++;
				if (otro.dominaA(referencia))
					dominios[j]++;
			}
		}
		return dominios ;
	}
}
