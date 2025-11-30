import java.util.Scanner;

public class Ciclos {
    Scanner sc = new Scanner(System.in);

    public void prac1(){
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }// end method

    public void prac2(){
        int num = 0;
        do{
            System.out.println("Ingrese un numero positivo: ");
            num = sc.nextInt();
        }while(num <= 0);
        System.out.println("Gracias!");
    }// end method

    public void prac3(){
        int x, suma = 0;
        do{
            System.out.println("Ingrese un numero o 0 para detener el programa: ");
            x = sc.nextInt();
            suma += x;
        }while(x != 0);
        System.out.println("La suma de los numeros ingresados es de "+ suma);
    }// end method

    public void prac4(){
        int n;
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        System.out.println("Este es la tabla del " + n);
        for(int i = 1; i <=10; i++){
            System.out.println(n +" x " + i + " = " + (n*i));
        }
    }

    public void prac5(){
        int n = 10;
        for (int i = n; i >= 0; i--){
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

    public void prac6(){
        for(int i = 0; i < 20; i+= 2){
            System.out.println(i);
        }
    }// end method

    public void prac7() {
        long n = 1;
        int num;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            n *= (long)  i;
        }
        System.out.println("El resultado del factorial !" + num +" es " + n);
    }// end method

    public void prac8(){
        
    }

    /*public void prac8() throws InterruptedException {
        int min = 0, second = 0;
        for(int i = 0; i <2; i++){
            System.out.printf("\r%02d",i);
            Thread.sleep(1);
            for (int j = 0; j < 60; j++){
                System.out.printf(":" + "\r%02d", j);
                Thread.sleep(100);
            }// end for interno
        }// end for externo
    }*/

}// end class
