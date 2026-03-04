package ProgramacionFuncionalTodoCode.anonimasVsLambdas;

public class Main {

    // con clases anonimas
    static void main() {


        Operador suma = new Operador() {
            @Override
            public int operador(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println("Suma anonima" + suma.operador(5,8));
        // con lambdas

        Operador op = (num1, num2) -> num1 + num2;
        System.out.println("Suma lambda" + op.operador(8,8));
    }
}