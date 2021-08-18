package profit;

public class Profit {
	public static boolean profitableGamble(double prob, double prize, double pay) {
		return prob * prize > pay;
	}
}