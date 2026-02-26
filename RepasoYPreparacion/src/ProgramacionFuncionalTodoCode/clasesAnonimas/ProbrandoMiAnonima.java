package ProgramacionFuncionalTodoCode.clasesAnonimas;

public class ProbrandoMiAnonima {
    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5};


        Mayor claseAnonima = new Mayor() {
            @Override
            public int mayorDelVector(int[] numero) {
                int mayor = 0;
                for (int n : numero){
                    mayor = Math.max(mayor, n);
                }
                return mayor;
            }
        };

        System.out.println("El numero mayor es " + claseAnonima.mayorDelVector(vector));

        // crearla de una vez en el sout y aprovechar su retorno

        System.out.println("El numero mayor es " + new Mayor() {
            @Override
            public int mayorDelVector(int[] numero) {
                int mayor = 0;
                for (int n : numero){
                    mayor = Math.max(mayor, n);
                }
                return mayor;
            }
        }.mayorDelVector(vector) );


    }
}
