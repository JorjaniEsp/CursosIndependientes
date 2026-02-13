package dia2;

public class GeometriaTextual {

    public static char siguienteLetra(char c) {
        if (c >= 'a' && c < 'z') {
            return ++c;
        } else {
            return 'a';
        }
    }

    public static int sumarSoloDigitos(String texto){
        int total = 0;
        for (int i = 0; i < texto.length(); i++){
            if (Character.isDigit(texto.charAt(i))){
                total += Character.getNumericValue(texto.charAt(i));
            }
        }
        return total;
    }

    public static void generarPiramide(int filas){
        StringBuilder piramideInvertida = new StringBuilder();
        if(filas < 1){
            throw new IllegalArgumentException("El numero de filas debe ser mayor a 1");
        } else {
            for (int i = filas; i >= 1; i--) {
                for (int j = 1; j <= (filas-i) ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2*i-1) ; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
