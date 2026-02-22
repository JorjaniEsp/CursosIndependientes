package dia1nuevo;

public class tetris {
    public static void main(String[] args) {
        mostrarMatriz(matrizBordesRellenados(4,5));
    }

    public static int[][] matrizBordesRellenados(int filas, int columnas){
        int[][] m = new int[filas][columnas];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (i == 0 || i == m.length - 1 || j == 0 || j == m[0].length - 1){
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }

    public static void mostrarMatriz(int[][] m){
        for (int[] fila : m){
            for (int contenido : fila){
                System.out.print(contenido + " ");
            }
            System.out.println();
        }
    }
}
