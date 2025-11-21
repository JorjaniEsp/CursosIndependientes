import java.util.Scanner;
public class Ejercio01 {
    /*
     * EJERCICIO:
     * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
     *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
     *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
     * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
     *   que representen todos los tipos de estructuras de control que existan
     *   en tu lenguaje:
     *   Condicionales, iterativas, excepciones...
     * - Debes hacer print por consola del resultado de todos los ejemplos.
     *
     * DIFICULTAD EXTRA (opcional):
     * Crea un programa que imprima por consola todos los números comprendidos
     * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
     *
     * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
     */

    public static void operadoresAritmeticos(){
        int num1 = 9;
        int num2 = 8;

        System.out.println("Las siguientes operaciones son parte de los operadores aritmeticos");

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println("El % (modulo) es para obtener el residuo de una operacion ");

    }// end method

    public static void operadoresLogicos(){
        boolean x = true;
        boolean y = false;

        System.out.println(" Asi funcionan los operadores logicos");
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        boolean andLogico = (x && y);
        System.out.println("andLogico && ( y = ∧ ), hacemos 'x && y' sera = " + andLogico +", porque deben ser ambos verdad, para ser verdad");

        boolean orLogico = (x || y);
        System.out.println("orLogico || ( y = v ), hacemos 'x || y' sera = " + orLogico +", porque debe almenos una debe ser verdad, para ser verdad");

        boolean notLogico = !x;
        System.out.println("notLogico = " + notLogico);
    }

    public static void operadoresDeComparacion(){
        int num1 =  8;
        int num2 = 7;

        boolean result;

        System.out.println("Operadores de comparacion");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        result = num1 == num2;
        System.out.println("Si hacemos num1 == num2, el resultado sera " + result + ", porque == compara si ambos son iguales");
        result = num1 != num2;
        System.out.println("Si hacemos num1 != num2, el resultado sera " + result + ", porque != compara si num1 es diferente de num2");
        result = num1 > num2;
        System.out.println("Si hacemos num1 > num2, el resultado sera " + result + ", porque > compara si no es mayor que el otro");
        result = num1 > num2;
        System.out.println("Si hacemos num1 >= num2, el resultado sera " + result + ", porque >= o =< compara si uno es mayor o igual al otro");
    }

    public static void operadoresDeAsignacion(){
        System.out.println("Operadores de asignacion");
        int x = 5;
        System.out.println("El = le asigna un valor a una variable, un ejemplo seria x = 5, lo daria " + x);

        x += 5;
        System.out.println("El += incrementa un valor o descrrementa con -=, un ejemplo seria x += 5, que ahora daria " + x + "porque anteriormente valia 5 y se le incremento 5");
    }

    public static void operadoresTernarios(){
        int edad = 18;
        System.out.println("Operadores ternarios");
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(" Tenemos el ? que funciona como una condicion, por ejemplo la edad mia es de 19 y tenemos la siguiente linea\n (edad >= 18) ? \"Eres mayor de edad\" : \"Eres menor de edad\", si la condicion se cumple una o la otra, en este caso seria " + mensaje);
    }

    public static void operadoresBitaBit(){
        System.out.println("Operadores de bit a bit");
        int x = 7;
        int desplazamiento = 1;
        int num1 = 30;
        int num2 = 40;
        String y = Integer.toBinaryString(x);
        System.out.println("Veamos el 7 en binario = " + y);

        System.out.println("Si le añadimos un ~, los 0 pasan a ser unos, mira " + Integer.toBinaryString(~x));

        System.out.println("Si tenenemos num1 = 30 con un valor binario de" + Integer.toBinaryString(num1) + "+ y num2 = 40 con un valor binario de " +Integer.toBinaryString(num2)+", y usamos & (un operador binario) en num1&num2, lo pasa es lo siguiente:\n crea un tercer numero y comparando bit a bit entre los 2, y si ambos tienen 1 en la misma posicion lo mantien, ejemplo: \n" +
                "num1&num2 = " + Integer.toBinaryString((num1&num2)));

        System.out.println("Si tenenemos num1 = 30 con un valor binario de" + Integer.toBinaryString(num1) + "+ y num2 = 40 con un valor binario de " +Integer.toBinaryString(num2)+", y usamos ^ (un operador binario) en num1^num2, lo pasa es lo siguiente:\n crea un tercer numero y comparando bit a bit entre los 2, y con que uno tenga 1 en la misma posicion, da 1 en esa posicion, pero si los 2 son 1 pone un 0, ejemplo: \n" +
                "num1^num2 = " + Integer.toBinaryString((num1^num2)));

        System.out.println("Si tenenemos num1 = 30 con un valor binario de" + Integer.toBinaryString(num1) + " y desplazamiento = 2, y usamos << (un operador binario) en num1<<desplazamiento, lo pasa es lo siguiente:\n Si operamos num1<<desplazamiento, el valor de desplazamiento indica los bit que se va a desplazar a la derecha, importante, esto depende del rango de bits que tenga el tipo de dato, observa el cambio: \n" +
                "num1<<desplazamiento = " + Integer.toBinaryString((num1<<num2)));

        System.out.println("Si tenenemos num1 = 30 con un valor binario de" + Integer.toBinaryString(num1) + " y desplazamiento = 2, y usamos >> (un operador binario) en num1>>desplazamiento, lo pasa es lo siguiente:\n Si operamos num1>>desplazamiento, el valor de desplazamiento indica los bit que se va a desplazar a la izquierda, observa el cambio: \n" +
                "num1<<desplazamiento = " + Integer.toBinaryString((num1>>num2)));
    }

    public static void estructurasDeControlCondicionales() {
        int x = 5;
        int y = 6;
        int dia = 2;

        System.out.println("Estructuras de control con if-else en un solo ejemplo y switch");

        System.out.println("El siguiente bloque if va a compara x = 5 y y = &, y te dira cual es el mayor y cual es el menor o si son iguales");
        if (x > y) {
            System.out.println("El mayor es " + x + ", y el menor es " + y);
        } else if (x == y) {
            System.out.println("Ambos son iguales");
        }

        System.out.println("El siguiente es un ejemplo del switch, tenemos el dia = 2, entonces el switch segun este numero nos dira el numero de la semana que representa");

        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;

            case 2:
                System.out.println("Es martes");
                break;

            case 3:
                System.out.println("Es miercoles");
                break;

            case 4:
                System.out.println("Es Juves");
                break;

            case 5:
                System.out.println("Es viernes");
                break;

            case 6:
                System.out.println("Es sabado");
                break;

            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("El numero debe ser mayor a 0 y menor que 7");
                break;
        }
    }

        public static void bucles(){
            System.out.println("Estructura de control mediante bucles con for, while y do-while");
            System.out.println("El siguiente for y igual van a hacer una suma de 0 hasta 5 con una incrementacion 1 en 1");
            int num = 0;

            System.out.println("For que se detiene hasta num sea igual o mayor que 5");
            for (int i = 0; num <= 5; i++){
                System.out.println(num);
                num += 1;

                if (num == 5){
                    System.out.println("fin del bucle");
                }

            }
            System.out.println("While que se detiene hasta num sea igual o mayor que 5");
            while (num!=5){

                System.out.println(num);
                num += 1;

                if (num == 5){
                    System.out.println("fin del bucle");
                }
            }
            System.out.println("do-while se va a detener hasta que sea igual o mayor que 5");
            do{
                System.out.println(num);
                num +=1;
            }while (num == 5);
                System.out.println("fin");
        }

        public static void estructuraDeExcepciones() {
        try {
            // Esto podría causar un error, por ejemplo, división por cero
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // ATRApa el error específico (en este caso, la división por cero)
            System.out.println("¡ERROR! No se puede dividir por cero.");
        } catch (Exception e) {
            // ATRApa cualquier otro error que no hayamos previsto
            System.out.println("Ocurrió otro tipo de error: " + e.getMessage());
        } finally {
            // Bloque opcional. El código aquí se ejecuta SIEMPRE,
            // haya ocurrido un error o no. Útil para cerrar recursos.
            System.out.println("El bloque de excepción ha finalizado su ejecución.");
        }
    }
        public static void extra() {
            int num = 0;

            System.out.println("Lista de numeros del 15 al 55, par y no es multiplo de 3");

            while (num != 56) {
                num++;
                if (num >= 15 && num <= 55) {

                    if(num % 2 == 0 && num % 3 != 0){

                        System.out.println(num);

                    }
                }
            }
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                Ejercio01.operadoresAritmeticos();
                break;

            case 2:
                Ejercio01.operadoresDeComparacion();
                break;

            case 3:
                Ejercio01.operadoresDeAsignacion();
                break;

            case 4:
                Ejercio01.operadoresLogicos();
                break;

            case 5:
                Ejercio01.operadoresTernarios();
                break;

            case 6:
                Ejercio01.operadoresBitaBit();
                break;

            case 7:
                Ejercio01.estructurasDeControlCondicionales();
                break;

            case 8:
                Ejercio01.bucles();
                break;

            case 9:
                Ejercio01.estructuraDeExcepciones();
                break;

            case 10:
                Ejercio01.extra();
                break;

            default:
                System.out.println("Error");
                break;
        }
    }
}
