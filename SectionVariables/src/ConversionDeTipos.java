public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.63";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);


        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String str = Integer.toString(otroNumeroInt);
        System.out.println("str = " + str);

        String otroNumeroStr = String.valueOf(otroNumeroInt);





    }
}
