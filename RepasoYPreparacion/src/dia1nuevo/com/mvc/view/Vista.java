package dia1nuevo.com.mvc.view;

import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("Menu de usurio");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Ver puntuación");
        System.out.println("4. Salir del sistema");
        System.out.println("Ingerese una opción: ");
    }

    public int leerInput(){
        return sc.nextInt();
    }

    public double leerPuntos(){
        return sc.nextDouble();
    }

    public void mostrar(double puntuacion){
        System.out.println("Su puntuacion actual es: " + puntuacion);
    }

    public void mostrar(String mensaje){
        System.out.println(mensaje);
    }

}
