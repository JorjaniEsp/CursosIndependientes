package practx;

public class Ejercicios {
    public static void main(String[] args) {
        triangulo(3);
        rombo(4);
    }

    public static StringBuilder piramideInvertida(int filas, char figura) {
        StringBuilder piramide = new StringBuilder();
        if (filas <= 0) {
            return piramide;
        } else {
            for (int i = filas; i >= 0; i--) {
                for (int j = 1; j <= filas - i; j++) {
                    piramide.append(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    piramide.append(figura);
                }
                piramide.append("\n");
            }
        }
        return piramide;
    }

    public static void triangulo(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rombo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n -1; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
