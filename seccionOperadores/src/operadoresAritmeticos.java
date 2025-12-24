public class operadoresAritmeticos{
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("Suma = " + suma);
        System.out.println("i + j = "+ (i+j));

        int resta = i -j;
        System.out.println("Resta = " + resta);
        System.out.println("(i - j) = "+ (i-j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);
        System.out.println("(i * j) = "+ (i*j));

        float div = (float) i / j;
        System.out.println("Divion = " + div);
        System.out.println("(i / j) = "+ (i/j));

        int resto = i % j;
        System.out.println("Resto = " + resto);
        System.out.println("(i % j) = "+ (i%j));



    }
}