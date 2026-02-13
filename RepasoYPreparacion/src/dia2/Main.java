package dia2;

public class Main {
    public static void main(String[] args) {
        String texto = "1s2d3";

        System.out.println(GeometriaTextual.siguienteLetra('z'));
        System.out.println(GeometriaTextual.sumarSoloDigitos(texto));
        try {
            GeometriaTextual.generarPiramide(3);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
