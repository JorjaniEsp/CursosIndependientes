import java.util.InputMismatchException;
import java.util.Scanner;

public class Modulo3{
    Scanner sc = new Scanner(System.in);

    public void Calculadora(){
        double x = 0, y = 0;
        int operacion = 0;
        double memoria = 0;
        boolean hayMemoria = false, cerrarSesion = false;

        do {
            try {
                System.out.println("Ingrese la operacion a realizar: ");
                System.out.println("1. Suma\n2. Resta\n3. Ver ultimo valor guardado\n4. Finalizar sesión");
                System.out.print("Elige: ");
                operacion = sc.nextInt();

                switch (operacion) {
                    case 1:
                        System.out.println("Ingrese el valor de x");
                        x = sc.nextDouble();
                        System.out.println("Ingrese el valor de y");
                        y = sc.nextDouble();
                        sc.nextLine();

                        memoria = x + y;
                        hayMemoria = true;
                        System.out.println("La suma es de " + memoria + "\n");
                        break;

                    case 2:
                        System.out.println("Ingrese el valor de x");
                        x = sc.nextDouble();
                        System.out.println("Ingrese el valor de y");
                        y = sc.nextDouble();
                        sc.nextLine();

                        memoria = x - y;
                        hayMemoria = true;
                        System.out.println("La resta es de " + memoria + "\n");
                        break;

                    case 3:
                        if (hayMemoria) {
                            System.out.println("El ultimo valor en memoria es " + memoria + "\n");
                        } else {
                            System.out.println("No hay ningun valor en memoria\n");
                        }
                        break;

                    case 4:
                        System.out.println("Cerrando sesión...");
                        cerrarSesion = true;
                        break;
                    default:
                        System.out.println("Opción inválida (1-4).\n");

                }

            } catch (InputMismatchException e) {
                System.out.println("¡ERROR CRÍTICO! Ingresaste texto donde iba un número.");
                System.out.println("Reiniciando menú...\n");
                sc.nextLine();
            }

        }while (!cerrarSesion);

    }// end method

}
