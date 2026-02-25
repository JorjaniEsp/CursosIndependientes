package dia1nuevo;

public class tetris {
    public static void main(String[] args) {
        int[][] matriz = {{0,1,0,0},{0,0,0,0},{0,0,0,0}};
        for (int i = 0; i < 3; i++) {
            mostrarMatriz(mover1(matriz));
        }
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
        System.out.println();
    }

    public static int[][] mover1(int[][] m){
        int f = 0, c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1){
                    f = i;
                    c = j;
                    break;
                }
            }
        }

        if (f == m.length - 1 || m[f+1][c] == 1){
            return m;
        }else {
            m[f+1][c] = 1;
            m[f][c] = 0;
            return m;
        }

    }
}
