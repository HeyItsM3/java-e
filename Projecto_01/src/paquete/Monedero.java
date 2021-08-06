package paquete;

public class Monedero {
	
	 private double dinero; 
	 
	 public Monedero(double dineroInicial) {
		 dinero = dineroInicial;
	 }
	 
	 public double sacarDinero(double cantidadAsacar) {
		 if(dinero >= cantidadAsacar) {
			 dinero -= cantidadAsacar;
			 return cantidadAsacar;
		 }
		 else
			 return 0;		 
	 }
	 
	 public void ponerDinero(double dineroAingresar) {
		 dinero += dineroAingresar;
	 }
	 
	 public double verCuantoDineroHay() {
		 return dinero;
	 }
	 
	 public static void main(String[] args) {
		 Monedero miMonedero = new Monedero(100);
		 double disponible = miMonedero.verCuantoDineroHay();
		 System.out.println(disponible);
		 miMonedero.sacarDinero(50);
		 disponible = miMonedero.verCuantoDineroHay();
		 System.out.println(disponible);
		 miMonedero.ponerDinero(150);
		 disponible = miMonedero.verCuantoDineroHay();
		 System.out.println(disponible);
		 miMonedero.sacarDinero(200);
		 disponible = miMonedero.verCuantoDineroHay();
		 System.out.println(disponible);
	 }
}
