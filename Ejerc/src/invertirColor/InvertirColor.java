package invertirColor;

public class InvertirColor {
	public static int[] invertColor(int[] rgb) {
		for(int i = 0; i < rgb.length; i++) {
			rgb[i] = 255 - rgb[i];
		}
		return rgb;
	}
}
