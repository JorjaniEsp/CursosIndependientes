import java.time.LocalTime;
import java.util.Scanner;

public class Ciclos {
    Scanner sc = new Scanner(System.in);

    public void prac1() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }// end method

    public void prac2() {
        int num = 0;
        do {
            System.out.println("Ingrese un numero positivo: ");
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println("Gracias!");
    }// end method

    public void prac3() {
        int x, suma = 0;
        do {
            System.out.println("Ingrese un numero o 0 para detener el programa: ");
            x = sc.nextInt();
            suma += x;
        } while (x != 0);
        System.out.println("La suma de los numeros ingresados es de " + suma);
    }// end method

    public void prac4() {
        int n;
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        System.out.println("Este es la tabla del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public void prac5() {
        int n = 10;
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Despegue!");

        // O
        /*
        int n = 10;
        for(int i = 0; i < 10; i++){
        System.out.println((n--));
        }
        System.out.println("Despegue!");
         */
    }// end method

    public void prac6() {
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }
    }// end method

    public void prac7() {
        long n = 1;
        int num;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            n *= (long) i;
        }
        System.out.println("El resultado del factorial !" + num + " es " + n);
    }// end method

    public void prac8() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 60; j++) {
                if (j < 10) {
                    System.out.println("0" + i + ":" + "0" + j);
                } else {
                    System.out.println("0" + i + ":" + j);
                }
            }// end for interno
        }// end for externo
    }// end method

    public void prac9() {
        int n;
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }// end for internal
            System.out.println(" ");
        }// end for external
    }// end method

    public void prac10() {
        int num;
        LocalTime horaio = LocalTime.now();
        int hora = horaio.getHour(), min = horaio.getMinute();
        do {
            System.out.println("Ingrese una de las siguientes opciones: \n ");
            System.out.println("1. Saludar\n2. Decir la hora\n3. SALIR");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Son las " + hora + ":" + min);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error: opcion incorrecta!");
                    break;
            }
        } while (num != 3);
    }// end method

    public void prac11() {
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                continue;
            }
            System.out.println(i);
        }
    }// end method

    public void prac12() {
        int n = 0;
        while (true){
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            if (n == 100){
                System.out.println("Tesoro encontrado!");
                break;
            }
        }// end while
    }// end method

    public void prac13(){
        int clave = 123, intentos = 3;
        int contrasena;
        do{
            System.out.println("Ingrese la contraseña: (Tiene "+intentos+" intentos) ");
            contrasena = sc.nextInt();

            if(contrasena == clave){
                System.out.println("Inicio de sesion exitoso! \nBienvenido!");
                break;
            }else{
                intentos -=1;
                System.out.println("Contraseña incorrecta!.");
                if (intentos == 0){
                    System.out.println("Por seguridad se cerrara el programa! ");
                    break;
                }
            }
        }while(intentos != 0);
    }// end method

    public void prac14(){
        int n;
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }// end method

    public void prac15() {
        int n;
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();
        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero NO es primo");
        }
    }// end method

}// end class
