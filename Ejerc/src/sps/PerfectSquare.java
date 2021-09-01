package sps;

/*Cree una función que tome un número entero y dé como resultado un cuadrado n x n que consta únicamente del número entero n.*/

public class PerfectSquare {
	public static int[][] squarePatch(int n) {
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = n;
			}
		}
		return array;
	}
}
