package palindromos;

public class Palindromo {
	public static boolean esPalindromo(final String frase) {
		
		String tmp = frase.replaceAll(" ", "");
		tmp = tmp.toLowerCase();
		tmp = tmp.replaceAll("á", "a"); //Esto se pude mejorar con regular expressions
		tmp = tmp.replaceAll(",", "");
		
		for(int i = 0; i < tmp.length() / 2; i++) {
			char iz = tmp.charAt(i);
			char de = tmp.charAt(tmp.length()-1 -i);
			if(iz != de)
				return false;
		}
		return true;
	}//Tiene que haber 1 solo return por método
}
