import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    Scanner scanner = new Scanner(System.in);
    static Scanner sc;

    public static void arreglosUnidimensionales(){
        // también conocido como vector y se manejan por índices
        int[] numeros = new int[5];
        numeros[1] = 1; //inserción, debemos acceder por índice
        numeros[1] = 0; // en los vectores no existe el borrar, entonces debemos acceder por índice y poner 0 o null
        numeros[1] = 8; //actualización es lo mismo que la inserción
        numeros[2] = 9; numeros[3] = 7; numeros[4] = 11;
        Arrays.sort(numeros);// ordenamiento con la clase arrays y método sort
        for (int numero : numeros){
        System.out.println(numero);
        }
    }// end method

    public static void arreglosBidimensionales(){
        // también conocido como vectores y se manejan por índices
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1; //inserción, debemos acceder por índice
        matriz[0][0] = 0; //no existe el borrar, entonces debemos acceder por índice y poner 0 o null
        matriz[0][0] = 8; //actualización es lo mismo que la inserción
        matriz[2][1] = 9; matriz[2][2] = 7; matriz[2][2] = 11;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el numero de la fila " + i + " y de la columna "+ j);
                int numero = sc.nextInt();
                matriz[i][j] = numero;
            }
        }

        System.out.println("Como se ve la matriz: ");

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Ordenada");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }

    }// end method

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Arreglo unidimensional");
            System.out.println("2. Arreglo bidimensionales");
            System.out.println("0. Para salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio3.arreglosUnidimensionales();
                case 2 -> Ejercicio3.arreglosBidimensionales();
                default -> System.out.println("Numero erróneo");
            }
        }while (opcion != 0);



    }

}
