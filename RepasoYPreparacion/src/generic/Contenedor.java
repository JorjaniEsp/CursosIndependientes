package generic;

public class Contenedor <T> {

    private T contenido;

    public Contenedor(T contenido){
        this.contenido = contenido;
    }

    public T obtenerObjeto(){
        return contenido;
    }

    public void mostrarTipo(){
        System.out.println(contenido.getClass().getName());
    }

    static void main(String[] args) {
        Contenedor<String> mensaje = new Contenedor<>("Hello");
        mensaje.mostrarTipo();

        Contenedor<Integer> numero = new Contenedor<>(1);
        numero.mostrarTipo();
    }
}
