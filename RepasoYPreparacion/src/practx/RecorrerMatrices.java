package practx;

import java.util.Scanner;

public class RecorrerMatrices {

    public static void main(String[] args) {

        int[][] numeros = {
                {1,2,3,4}, //fila 0
                {5,6,7,8}, //fila 1
                {9,10,11,12} // fila 2
        };

        recorrerColumnaAbajoArriba(numeros);

    }

    public static void inicioFinFori(int[][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna]);

                if (columna != matriz[fila].length - 1){
                    System.out.print(" | ");
                }
            }// end column
            System.out.println();
        }// end fila
    }

    public static void inicioFinForEach(int[][] matriz){
        for (int[] fila : matriz){
            for (int posicion : fila){
                System.out.print(posicion);
            }
            System.out.println();
        }
    }

    public static boolean encontrarNum(int [][] matriz, int num){
        for (int fila = 0; fila < matriz.length ; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (num == matriz[fila][columna]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void coordenadaNum(int[][] matriz, int num){
        for (int fila = 0; fila < matriz.length ; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (num == matriz[fila][columna]) {
                    System.out.println("La coordenada es (" +fila+ ","+columna+")");
                }
            }
        }
    }

    public static void encontrarBordes(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1){
                    System.out.println("El numero " + matriz[i][j] + " esta en un borde");
                }
            }

        }
    }

    public static void encontrarCentros(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!(i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1)){
                    System.out.println("El numero " + matriz[i][j] + " esta en un centro");
                }
            }

        }
    }

    public static void verificarBorde(int[][] matriz, int n){

    }



    public static void recorrerMatrizAtrasAde(int[][] matriz){
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz[i].length-1; j >= 0 ; j--) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void rellenarMatrizAtrasAde(int[][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz[i].length-1; j >= 0 ; j--) {
                System.out.println("Ingrese un numero para la posicio ("+i+","+j+")");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void recorrerColumnasArribaAbajo(int[][] matriz){
        for (int columna = 0; columna < matriz[0].length; columna++) {
            for (int fila = 0; fila < matriz.length; fila++){
                System.out.println(matriz[fila][columna]);
            }
        }
    }

    public static void recorrerColumnaAbajoArriba(int[][] matriz){
        for (int columna = matriz[0].length -1; columna >= 0; columna--) {
            for (int fila =  matriz.length -1; fila >= 0; fila--){
                System.out.println(matriz[fila][columna]);
            }
        }
    }
}
