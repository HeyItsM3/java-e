package getPersonas;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;



public class AppPersonas {

	public static void main(String[] args) throws IOException {

		List<Persona> personas = LeerYescribirP.getPersonas("personas.in");
		
		LeerYescribirP.escribirMayoresDeEdadOrdenadasPorEdad(personas, 30);
		
		LeerYescribirP.escribirMayoresDeEdadOrdenadasPorDNI(personas, 35);
		
		Scanner tcl = new Scanner(System.in);
		
		System.out.println("ingrese un entero");
		int a = tcl.nextInt();
		System.out.println(a);
		
		tcl.close();
	}
		
}