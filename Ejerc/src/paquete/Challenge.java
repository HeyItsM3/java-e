package paquete;

/*Create a function which returns the number of true values there are in an array.*/

public class Challenge {
	public static int countTrue(boolean[] arr) {
		int b = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]){
			    b++;
			}
		}
		return b;
	}
}