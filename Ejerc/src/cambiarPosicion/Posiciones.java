package cambiarPosicion;

public class Posiciones {
    public static String nameShuffle(String s) {
        String[] names = s.split(" ");
        return names[1] + " " + names[0];      
      }
}
