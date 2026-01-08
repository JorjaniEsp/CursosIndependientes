public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";
        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int a = 10;
        int b = 5;

        System.out.println(detalle + a + b);
        System.out.println(a + b + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);


    }
}
