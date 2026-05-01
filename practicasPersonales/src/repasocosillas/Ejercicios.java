package repasocosillas;

import java.util.Scanner;

public class Ejercicios {

    public static Scanner sc = new Scanner(System.in);

    public static void ejercio1V1() {
        int n1 = 0, n2 = 0, n3 = 0;
        do{
            System.out.println("Ingrese la nota 1: ");
            n1 = sc.nextInt();
            System.out.println("Ingrese la nota 2: ");
            n2 = sc.nextInt();
            System.out.println("Ingrese la nota 3: ");
            n3 = sc.nextInt();
        } while (!(n1 > 0 && n1 < 20) && !(n2 > 0 && n2 < 20) && !(n3 > 0 && n3 < 20));
        System.out.println("El promedio es: " + (n1+n2+n3) / 3);
    }

    public static void ejercio1V2(){
        int notaFinal = 0;
        for (int i = 1; i <= 3; i++){
            System.out.println("Ingrese la nota " + i+" :");
            int nota = sc.nextInt();
            if(nota > 0 && nota < 20){
                notaFinal += nota;
            } else {
                 i -= 1;
            }
        }
        System.out.println(notaFinal/3);
    }

    public static void ejercicio2v1(){
        int total = 0;
        for (int i = 1; i < 100; i += 2){
            System.out.println(i);
            total += i;
        }
        System.out.println("total = " + total);
    }

    public static void ejercicio2v2(){
        int total = 0;
        for (int i = 1; i < 100; i++){
            if((i % 2) != 0){
                System.out.println(i);
                total += i;
            }
        }
        System.out.println("total = " + total);
    }

    public static void ejercicio2v3(){
        int total = 0, i = 1;
        while (i != 99){
            System.out.println(i);
            total += i;
            i+=2;
        }
        System.out.println("total = " + total);
    }

    public static void ejercicio2v4(){
        int total = 0, i = 1;
        while (i != 99){
            if((i % 2) != 0){
                total += i;
            }
            i++;
        }
        System.out.println("total = " + total);
    }

    public static void main(String[] args) {
        //Ejercicios.ejercio1V1();
        //Ejercicios.ejercio1V2();
    }
}
