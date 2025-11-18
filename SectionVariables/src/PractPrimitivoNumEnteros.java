import java.util.Scanner;
public class PractPrimitivoNumEnteros {

    /*
    Conversión de Unidades de Medida:
Declara una variable short para almacenar una cantidad de centímetros (ej. 25000).

Declara una variable int para el factor de conversión (ej. 1 metro = 100 cm).

Declara una variable float llamada metros.

Calcula el valor de metros (centímetros dividido por el factor) y usa el sufijo f para el literal flotante en la operación si es necesario.

Imprime el resultado usando System.out.println de forma descriptiva.
     */

    public void ejercio1(){

        short cm = 25000;
        int factorConversion = 100;
        float mts = ((float) cm / (float) factorConversion);

        System.out.println("mts = " + mts);

    }// end method

    /*
        Cálculo de Área con Tipos Flotantes:
     Declara una variable double para el radio de un círculo (ej. 15.5).
     Declara una constante (variable final) de tipo double para $\pi$ (ej. 3.14159).
     Calcula y almacena el área ($A = \pi \cdot r^2$) en una variable double llamada area.
     Imprime el resultado.
     */

    public void ejercicio2(){
        double radioCirculo = 15.5;
        final double constante  = 3.14159;
        double area = constante * (radioCirculo*radioCirculo);
        System.out.println("area = " + area);
    }

    /*
    Verificación Lógica con boolean y if:

Declara una variable int llamada temperatura (ej. 28).

Declara una variable boolean llamada esVerano e inicialízala con true.

Usa una estructura if para verificar si esVerano es verdadero Y si temperatura es mayor que 25.

Si la condición se cumple, imprime: "¡Día de playa!". Si no se cumple, imprime: "Día normal.".
     */

    public void ejercicio3(){

        int temperatura = 28;
        boolean esVerano = true;

        if(temperatura > 25){
            System.out.println("Dia de playa");
        } else{
            System.out.println("Dia normal");
        }

    }// end method

    /*
    Verificación Lógica con boolean y if:

Declara una variable int llamada temperatura (ej. 28).

Declara una variable boolean llamada esVerano e inicialízala con true.

Usa una estructura if para verificar si esVerano es verdadero Y si temperatura es mayor que 25.

Si la condición se cumple, imprime: "¡Día de playa!". Si no se cumple, imprime: "Día normal.".
     */

    public void ejercicio4(){
        char LetraInicial = 'J';
        char simbolo = '\u0040';
        System.out.println(LetraInicial + simbolo );
    }

    /*
    Práctica con Rango de Enteros:

Intenta declarar e inicializar una variable byte con un valor que exceda su valor máximo (ej. 128). Observa el error de compilación.

Corrige la variable inicializándola con el valor máximo de byte (127) y luego con el valor mínimo de byte (-128). Imprime ambos valores.

Repite el ejercicio con short (ej. 32767 y -32768).
     */

    public void ejercicio5(){
        byte numMaxByte = 127;
        System.out.println("numMaxByte = " + numMaxByte);
        byte numMinByte = 127;
        System.out.println("numMinByte = " + numMinByte);

        short numMaxShort = 32767;
        System.out.println("numMaxShort = " + numMaxShort);

        short numMinShort = 32767;
        System.out.println("numMinShort = " + numMinShort);

    }// end method

    /*
    Inferencia de Tipo con var:

Declara una variable var llamada edad e inicialízala con un entero (ej. 30).

Declara una variable var llamada salario e inicialízala con un valor flotante de doble precisión (ej. 55000.50).

Declara una variable var llamada esMayor e inicialízala con un booleano (true).

Imprime el tipo y valor de cada variable (aunque no se muestre el tipo explícitamente, recuerda que Java infiere el tipo de dato subyacente al momento de la inicialización).
     */

    public void ejercicio6() {
        var edad = 30;
        var salario = 55000.50D;
        var esMayor = true;

        System.out.println("Edad es una variable tipo int = " + edad);
        System.out.println("Salario es una variable tipo double = " + salario);
        System.out.println("esMayor es una variable tipo booleana = " + esMayor);
    }

    /*
    Concatenación y Reglas de Nombres:

Crea una clase simple. Dentro del método main, declara una variable int con un nombre que incumpla las reglas (ej. 2nombre, if, o mi-variable) y observa el error.




Corrige el nombre usando la convención camelCase (ej. numeroDeProductos).


Declara una variable String (como lo hiciste en el ejemplo HelloWord.java) e inicialízala.

Imprime el valor de la variable entera concatenado con el String y un mensaje descriptivo, por ejemplo: "El número de productos es: " + numeroDeProductos.
     */

    public void ejercicio7(){
        int numeroDeProductos = 9;
        String linea = "El numero de productos es: ";
        System.out.println(linea + numeroDeProductos);
    }

    public static void main(String[] args) {

        PractPrimitivoNumEnteros prac = new PractPrimitivoNumEnteros();

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el metodo a probar: ");
        opcion = sc.nextInt();

        switch (opcion){
            case 1:
                prac.ejercio1();
                break;
            case 2:
                prac.ejercicio2();
                break;
            case 3:
                prac.ejercicio3();
                break;
            case 4:
                prac.ejercicio4();
                break;
            case 5:
                prac.ejercicio5();
                break;
            case 6:
                prac.ejercicio6();
                break;
            case 7:
                prac.ejercicio7();
                break;
            default:
                System.out.println("Numero invalido");
        }//end switch


    }//end main


}// end class
