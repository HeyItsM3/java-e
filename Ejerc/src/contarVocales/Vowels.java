package contarVocales;

public class Vowels {
	public static int getCount(String str) {
		return str.replaceAll("[^aeiouAEIOU]", "").length();
	}
}
