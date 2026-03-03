package dia4;

public class EjerciciosSueltos {
    static void main(String[] args) {
        int[] n = {0,1,2,3};
        cerosAlFinal(n);
    }

    public static char charMasRepetido(String str){
        int[] frecuencias = new int[256];

        for (int i = 0; i < str.length() ; i++) {
            frecuencias[str.charAt(i)]++;
        }
        int mayor = 0;
        char salida = ' ';
        for (int i = 0; i < frecuencias.length; i++) {
            if (mayor < frecuencias[i]){
                salida = (char)i;
                mayor = frecuencias[i];
            }
        }
        return salida;
    }

    public static void cerosAlFinal(int[] nums){
        int muro = 0;
        for (int i = 0; i < nums.length; i++) {

        }
    }

}
