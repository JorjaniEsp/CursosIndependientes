package ProgramacionFuncionalTodoCode.clasesAnonimas;

public class Main {
    public static void main(String[] args) {

        new Vehiculo(){
            private int numPasajeros;

            public void manejar() {
                System.out.println("Estoy manejando");
            }
        }.manejar(); // esta una formar de hacer uso de su metodo, haciendo constar que todo es un objeto entonces el .manejar;
        //auto.menejar(); el metodo no se porque estoy indicando que heredo de vehiculo,
        // pero vehiculo no tiene un metodo manejar, no hay sobreescritura
    }
}
