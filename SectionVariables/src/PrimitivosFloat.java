public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 2.12e3f; //212f
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("maximo valor para float es " + Float.MAX_VALUE);
        System.out.println("minimo valor para float es " + Float.MIN_VALUE);

        double realDouble = 3.482835E39;
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("maximo valor para double es " + Double.MAX_VALUE);
        System.out.println("minimo valor para double es " + Double.MIN_VALUE);

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
