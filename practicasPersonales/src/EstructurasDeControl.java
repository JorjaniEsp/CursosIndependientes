import java.util.Scanner;

public class EstructurasDeControl {

    Scanner sc = new Scanner(System.in);

    public void pract1(){
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero > 0){
            System.out.println("El numero es positivo");
        }
        sc.close();
    }//end method

    public void pract2(){
        double nota;

        System.out.println("Ingrese la nota: ");
        nota = sc.nextInt();

        if(nota > 6.0){
            System.out.println("Aprobado!");
        } else {
            System.out.println("Reprobado!");
        }

        sc.close();
    }// end method

    public void pract3(){
        int num;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("El numero " + num + " es par.");
        }else{
            System.out.println("El numero " + num + " es impar.");
        }

        sc.close();
    }// end method

    public void pract4(){
        double precio, precioFinal;
        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        if (precio > 100){
            precioFinal = precio * 0.90;
            System.out.println("El precio final es de " + precioFinal);
        } else{
            precioFinal = precio;
            System.out.println("El precio final es de " + precioFinal);
        }
        sc.close();
    }// end method

    public void pract5(){
        int a, b;
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();

        if( a > b){
            System.out.println("El mayor es a ");
        }else if(a < b){
            System.out.println("El mayor es b");
        } else{
            System.out.println("Ambos son iguales");
        }

        sc.close();
    }// end method

    public void pract6(){
        String color;
        System.out.println("Ingrese el color del semaforo: ");
        color = sc.nextLine().trim().toLowerCase();

        if (color.equals("rojo")){
            System.out.println("El semaforo dicta ALTO!");
        } else if (color.equals("amarillo")) {
            System.out.println("El semaforo dicta PRECAUCION, DESACELERE!");
        } else if (color.equals("verde")){
            System.out.println("El semaforo dicta ALTO!");
        }else{
            System.out.println("siga, es otro color");
        }

        sc.close();
    }// end method

    public void pract7() {
        String usuario, clave;
        System.out.println("Ingrese su rol ");
        usuario = sc.nextLine().trim().toLowerCase();

        System.out.println("Ingrese su clave: ");
        clave = sc.nextLine().trim().toLowerCase();

        if (usuario.equals("admin") && clave.equals("1234")) {
            System.out.println("Acceso concedido");
        }
        sc.close();
    }// end method

    public void pract8(){
        int edad;
        boolean tieneBoleto = false;
        boolean tienePermiso = false;
        
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Tiene boleto? si/no ");
        String confirmacionBoleto = sc.nextLine().trim().toLowerCase();

        if(confirmacionBoleto.equals("si")){
            tieneBoleto = true;
        }

        if(edad < 18){
            System.out.println("Tiene permiso? si/no");
            String respPermiso = sc.nextLine().trim().toLowerCase();
            if (respPermiso.equals("si")){
                tienePermiso = true;
            }
        }

        if( tieneBoleto && ( edad >= 18  || tienePermiso) ){
            System.out.println("Puede pasar!");
        } else {
            System.out.println("Acceso denegado");
        }
        sc.close();
    }// end method

    public void pract9(){
        int temperatura;
        System.out.println("Ingrese la temperatura: ");
        temperatura = sc.nextInt();

        if (temperatura < 10){
            System.out.println("Uy, que frio!");
        } else if(temperatura >= 10 && temperatura >= 21){
            System.out.println("frio!");
        } else if (temperatura >= 21 && temperatura >= 30) {
            System.out.println("El clima esta agradable");
        } else{
            System.out.println("Hace mucha calor!");
        }
        sc.close();
    }// end method

    public void pract10(){
        int dia;
        System.out.println("Ingrese un numero que represente los dia de la semana: ");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error: el numero debe ser mayor que 0 y menor que 8");
                break;
        }
        sc.close();
    }// end method

    public void pract11(){
        int num1, num2;
        char operacion;

        System.out.println("Ingrese el num1: ");
        num1 = sc.nextInt();

        System.out.println("Ingrese el num2: ");
        num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la alguna operacion aritmetica basica ´s´, ´r´ ´m´ o ´d´ :");
        operacion = sc.nextLine().trim().toLowerCase().charAt(0);

        switch (operacion){
            case 's':
                System.out.println("La suma de " + num1 +" + " + num2 + " = " +(num1 + num2));
                break;
            case 'r':
                System.out.println("La resta de " + num1 +" - " + num2 + " = " +(num1 - num2));
                break;
            case 'm':
                System.out.println("La multiplicacion de " + num1 +" * " + num2 + " = " +(num1 * num2));
                break;
            case 'd':
                System.out.println("La division de " + num1 +" / " + num2 + " = " +(num1 / num2));
                break;
            default:
                System.out.println("Operacion incorrecta");
                break;
        }
        sc.close();
    }// end method

    public void pract12() {
        int x;
        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();

        String resultado = (x % 2 == 0) ? "Es par" : "Es impar";

        System.out.println(resultado);
        sc.close();
    }// end method

    public void pract13() {
        int saldo = 10000, retiro;

        System.out.println("Ingrese la cantidad a retirar: ");
        retiro = sc.nextInt();

        if (retiro > saldo) {
            System.out.println("Salso insuficiente!");
        } else {
            if (retiro % 10 == 0) {
                saldo -= retiro;
                System.out.println("Retiro exitosamente realizado!");
                System.out.println("El saldo actual es de " + saldo);
            } else {
                System.out.println("El cajero solo tiene billetes de 10");
            }// end if interno
        }// end if externo
        sc.close();
    }// end method

    public void pract14() {

    }

}
