import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre1, nombre2, nombre3;
        System.out.println("Ingrese un nombre: ");
        nombre1 = sc.nextLine();

        System.out.println("Ingrese un nombre: ");
        nombre2 = sc.nextLine();

        System.out.println("Ingrese un nombre: ");
        nombre3 = sc.nextLine();
        
        String letra1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        System.out.println("letra1 = " + letra1);

        String letra2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        System.out.println("letra1 = " + letra1);

        String letra3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));
        System.out.println("letra1 = " + letra1);
        
        String resultado = letra1 + "_" + letra2 + "_" + letra3;

        System.out.println("resultado = " + resultado);

    }
}