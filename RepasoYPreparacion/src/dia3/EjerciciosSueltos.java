package dia3;

public class EjerciciosSueltos {
    public static void main(String[] args) {
        System.out.println(detectorAnagramas("amor", "roma"));

    }


    public static boolean detectorAnagramas(String str1, String str2){
        int coindicencias = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)){
                    coindicencias++;
                    break;
                }
            }
        }

        return coindicencias == str1.length() && coindicencias == str2.length();
    }

    public static int rachaUnos(int[] numeros){
        int cantUnos = 0, historial = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] == 1){
                cantUnos++;
            } else {
                historial = (historial < cantUnos) ? cantUnos : historial;
                cantUnos = 0;
            }
        }
        historial = (historial < cantUnos) ? cantUnos : historial;
        return historial;
    }

    public static int sumandoElMarco(int[][] numeros){
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i == 0 || i == numeros.length - 1 || j == 0 || j == numeros[i].length - 1){
                    total += numeros[i][j];
                }
            }

        }
        return total;
    }

    public static int filaMasPesado(int[][] numeros){
        int filaMax = 0, totalFila = 0;

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                totalFila += numeros[i][j];
                filaMax = (filaMax < totalFila) ? totalFila : filaMax;
            }
            totalFila = 0;
        }

        return filaMax;
    }

}
