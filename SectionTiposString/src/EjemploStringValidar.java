public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo == false) {
            System.out.println(curso.isBlank());
        }

        System.out.println(curso.concat(" desde cero!"));

    }


    }


