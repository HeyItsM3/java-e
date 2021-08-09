package numeroMayor;

public class ExisteUnNumeroMayor {
	public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n){
                return true;
            }
        }
        return false;
    }
}
