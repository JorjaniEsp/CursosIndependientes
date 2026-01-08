public class OperadorInstaceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String ... que tal";
        Integer num = 7;

        Boolean b1 = texto instanceof String; // todas las clases o objeto son del tipo Object
        System.out.println("Es del tipo string? " + b1);

        boolean b2 = texto instanceof Object; // todas las clases o objeto son del tipo Object
        System.out.println("Es del tipo object? " + b2);

        boolean b3 = num instanceof Integer;
        System.out.println("num es del tipo Integer? " + b3);

        boolean b4 = num instanceof Number;
        System.out.println("num es del tipo Integer? " + b4);

        boolean b5 = num instanceof Object;
        System.out.println("num es del tipo Object? " + b5);

        Double decimal = 45.54;
        boolean b6 = decimal instanceof Number;
        System.out.println("Decimal es del tipo number? " + b6);

        b1 = b1 instanceof Boolean;





    }
}