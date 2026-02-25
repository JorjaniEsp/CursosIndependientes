package dia2;

public class Dia2nuevo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] fila : transposicionBase(matriz)){
            for (int n : fila){
                System.out.print(n + " ,");
            }
            System.out.println();
        }

    }

    public static int[] sumaArreglos(int[] arr1, int[] arr2){
        int[] nuevoArr = new int[arr1.length];

        for (int i = 0; i < nuevoArr.length; i++){
            nuevoArr[i] = arr1[i] + arr2[i];
        }
        return nuevoArr;
    }

    public static int frecuencia(int[] arr, int n){
        int cant = 0;
        for (int j : arr) {
            if (j == n) {
                cant++;
            }
        }
        return cant;
    }

    public static boolean isPolindromo(int[] arr){
        int j = 0, coincidencias = 0;
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] == arr[j++]){
                coincidencias++;
            }else {
                break;
            }
        }
        return coincidencias == arr.length;
    }

    public static void matrizAcero(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 != 0){
                    matriz[i][j] = 0;
                }
            }
        }
    }

    public static int sumaDiagonalPrincipal(int[][] matriz){
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j){
                    total += matriz[i][j];
                }
            }

        }
        return total;
    }

    public static int sumaDiagonalSecundaria(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j == matriz.length - 1){
                    total += matriz[i][j];
                }
            }
        }
        return total;
    }

    public static int[][] transposicionBase(int[][] matriz){
        int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < nuevaMatriz[0].length; i++) {
            for (int j = 0; j < nuevaMatriz.length; j++) {
                nuevaMatriz[j][i] = matriz[i][j];
            }
        }
        return nuevaMatriz;
    }

}
