import java.util.Scanner;

public class OperadorTernariNumMayor {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        a = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        b = sc.nextInt();

        System.out.println("Ingrese un numero: ");
        c = sc.nextInt();

        max = (a > b) ? a : b;
        max = (a > c) ? max : c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("El numero mayor es " + max);


    }
}