package dia1;

public class GestorNumerico {

    public static void main(String[] args) {

        int[] numeros = { 4, 7, -3, 10 };

        for (int n : numeros){
            try{
                System.out.println(formatearString(n));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean esPar(int n){
        if(n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static String formatearString(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Error: Negativo no permitido -> " + n);
        } else{
            if (esPar(n)){
                return "El numero " + n + " es PAR";
            } else {
                return "El numero " + n + " es IMPAR";
            }
        }
    }

}
