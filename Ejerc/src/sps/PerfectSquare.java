package sps;

/*Cree una funci�n que tome un n�mero entero y d� como resultado un cuadrado n x n que consta �nicamente del n�mero entero n.*/

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
