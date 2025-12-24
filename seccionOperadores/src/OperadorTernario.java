import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String variable = 7 == 7 ? "si verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0, ciencias = 0.0, historia = 0.0;

        System.out.println("Ingrese la nota de matematica en escala 2.0 y 7.0: ");
        matematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de ciencias en escala 2.0 y 7.0: ");
        ciencias = sc.nextDouble();
        System.out.println("Ingrese la nota de historia en escala 2.0 y 7.0: ");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = (promedio > 5.49) ? "Aprobado" : "reprobado";
        System.out.println("promedio = " + promedio);

    }
}