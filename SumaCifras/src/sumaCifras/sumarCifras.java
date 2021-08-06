package sumaCifras;

public class sumarCifras {

	public int sumaCifras(int numero) {
		int suma = 0;
		
		int cifras = cuantasCifrasTiene(numero);
		
		if(numero < 10 ) {
			return numero;
		}
		
		for (int i=0; i < cifras; i++) {
			suma += numero /Math.pow(10, i) %10;
		}

		return sumaCifras(suma);
	}

	private int cuantasCifrasTiene(int numero) {
		int div = numero;
		int cifras = 0;
		
		while(div != 0) {
			div = div / 10;
			cifras++;
		}
		return cifras;
	}
	
	/*
	int unidad, decena;
	
	while(suma >= 10) {
		unidad = suma % 10;
		decena = suma / 10;
		suma = unidad + decena;
	}
	*/
	
	/*
	int unidad =  numero / 1 % 10; // 10°
	int decena =  numero / 10 % 10; // 10¹
	int centena = numero / 100 % 10; // 10²
	int uDeMil =  numero / 1000 % 10; // 10³
	suma = unidad + decena + centena + uDeMil;
	*/
	
	
	
	public static void main(String[] args) {
		sumarCifras sc = new sumarCifras();
		System.out.println(sc.sumaCifras(1234)); //1
		System.out.println(sc.sumaCifras(1213)); //7
		System.out.println(sc.sumaCifras(3899)); //2
		System.out.println(sc.sumaCifras(44)); //8
		System.out.println(sc.sumaCifras(111111)); //6
	}
}
