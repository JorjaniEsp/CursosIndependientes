import java.util.InputMismatchException;
import java.util.Scanner;
// MODULO 2
public class ExcepcionesBasica{

    Scanner sc = new Scanner(System.in);

    public void pedirNumeroIndestructible() {
        int numero = 0;
        boolean entradaValida = false; // Bandera: asumimos que no es válido al inicio

        do {
            try {
                System.out.println("Por favor, ingresa un número entero:");

                // --- ZONA DE PELIGRO ---
                numero = sc.nextInt();
                // Si el usuario escribe "hola", la línea de arriba EXPLOTA
                // y salta directo al catch.

                // Si llegamos a esta línea, significa que NO explotó:
                entradaValida = true; // ¡Éxito! Cambiamos la bandera para salir del bucle.

            } catch (InputMismatchException e) {
                // --- ZONA DE SEGURIDAD ---
                System.out.println("¡Error! Eso no es un número entero.");
                System.out.println("Has escrito texto o un decimal. Intenta de nuevo.");

                // ¡VITAL! Limpiar el buffer.
                // "Comemos" la entrada basura que el usuario escribió para dejar el Scanner limpio.
                sc.nextLine();
            }
        } while (!entradaValida); // Repetir MIENTRAS la entrada NO sea válida
        sc.nextLine();
    }// end method

}
