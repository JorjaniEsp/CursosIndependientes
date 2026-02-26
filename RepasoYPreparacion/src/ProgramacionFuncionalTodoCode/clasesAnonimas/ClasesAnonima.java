package ProgramacionFuncionalTodoCode.clasesAnonimas;

public class ClasesAnonima {
    static void main() {

        Animal perro = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Guao");
            }
        };

        perro.hacerSonido();
    }
}
