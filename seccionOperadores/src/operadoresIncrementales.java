public class operadoresIncrementales {
    public static void main(String[] args) {

        // pre incremento
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post incremento
        i = 2;
        j = i++; // primero se asigna y despues incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // pre descremento
         i = 1;
         j = --i; // i = i - 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post decremento
        i = 2;
        j = i--; // primero se asigna y despues incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);



    }
}