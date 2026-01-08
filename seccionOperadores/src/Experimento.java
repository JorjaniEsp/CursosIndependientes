public class Experimento {
    public static void main(String[] args) {
        String palabra = "Hola";
        for(int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }
}
