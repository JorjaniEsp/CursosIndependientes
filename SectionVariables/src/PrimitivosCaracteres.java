public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (caracter == decimal));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == decimal));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bite = " + Character.SIZE);
        System.out.println("character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("character.MIN_VALUE = " + Character.MIN_VALUE);

        char espacio = ' ';
        char retroceso = '\b'; //borra un caracter
        char tabulador = '\t'; //espacio mas amplio (tabulacion)
        char nuevaLinea = '\n'; // salto de linea
        char retornoCarro = '\r';

        // System.getProperty("line.separato")   crea un salto de linea
        // System.lineSeparator() lo mismo





    }
}
