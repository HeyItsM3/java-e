package sumElementsArray;

public class SumarElementosArray {
  public static int arraySum(int[] arr) {
		int suma = 0;
		for(int posiciones : arr){
			suma += posiciones;
		}
		return suma;
	}
}
