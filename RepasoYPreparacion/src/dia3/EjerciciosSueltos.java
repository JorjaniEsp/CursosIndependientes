package dia3;

public class EjerciciosSueltos {
    public static void main(String[] args) {
        int[][] m = {{0,0,0},{0,0,0},{0,0,0}};
        for (int[] n : spawnBloque(m)){
            for (int p : n){
                System.out.print(p + ", ");
            }
            System.out.println();
        }
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
        int filaMax = 0, totalFila = 0, pesada = 0;

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                totalFila += numeros[i][j];
            }
            if (filaMax < totalFila){
                filaMax = totalFila;
                pesada = i;
            }
            totalFila = 0;

        }

        return pesada;
    }

    public static int numeroFaltante(int[] numeros){
       int total = 0, totalPosible = ((numeros.length + 1) * ((numeros.length + 1) + 1)) / 2;
        for (int n : numeros){
            total += n;
        }
        return totalPosible - total;
    }

    public static void rotacionDerecha(int[] numeros) {
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
    }

    public static void rotacionMatriz(int[][] m) {

        int[] ultFila = new int[m[0].length];

        for (int i = m.length - 1; i > 0; i--) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = m[i-1][j];
            }
        }

        for (int i = 0; i < ultFila.length; i++) {
            m[0][i] = ultFila[i];
        }

    }

    public static void rotacionMatrizOptimizada(int[][] m) {
        int[] ultFila = m[m.length-1];
        for (int i = m.length - 1; i > 0; i--) {
            m[i] = m[i-1];
        }
        m[0] = ultFila;
    }

    public static void inversionMatriz(int[][] m){
        int filas = m.length;
        for (int i = 0; i < filas / 2; i++) {
            int[] temp = m[i];
            m[i] = m[filas - 1 - i];
            m[filas - 1 - i] = temp;
        }
    }

    public static int[][] spawnBloque(int[][] m){
            for (int i = 0 ; i < 2; i++) {
                if (m[0].length % 2 == 0) {
                    for (int j = (m[0].length - 1) / 2; j < m[0].length - 1; j++) {
                        m[i][j] = 1;
                    }
                } else {
                    for (int j = (m[0].length - 1) / 2; j < m[0].length; j++) {
                        m[i][j] = 1;
                    }
                }
            }
        return m;
    }

}
