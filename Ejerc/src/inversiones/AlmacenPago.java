package inversiones;

import java.text.DecimalFormat;

public class AlmacenPago {
	
	public int cantidadAniosMaximo;
	public double montoInvertir, interesAnual, mesesEnUnAnio;

  
    public AlmacenPago(double monto, double interes, int anios) {
        montoInvertir = monto;
        interesAnual = interes;
        cantidadAniosMaximo = anios;
    	mesesEnUnAnio = 12;
    }


    public String[] interesCompuesto() {
    	String [] resultados = new String[cantidadAniosMaximo];
    	DecimalFormat decimal = new DecimalFormat("#.0000");
    	
		for(int j = 0; j < cantidadAniosMaximo; j++) {
			for (int i = 0; i < mesesEnUnAnio; i++) {
				montoInvertir *= 1 + interesAnual / mesesEnUnAnio;
			}
			String formateada = decimal.format(montoInvertir);
			System.out.println(formateada);	
			resultados[j] = formateada;
		}
		return resultados ;
    }
    
    public int inversionEnMeses(double inversion, double interes, double saldo) {
        int cantidadMeses = 0;
        for (int i = 0; i < mesesEnUnAnio; i++) {
          while (inversion < saldo) {
        	  cantidadMeses += 1;
            inversion *= 1 + interes / mesesEnUnAnio;
          }
        }
        return cantidadMeses;
     }
 }
    

