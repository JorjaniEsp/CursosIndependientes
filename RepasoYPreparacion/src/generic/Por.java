package generic;

public class Por <K, V>{
    private K clave; // la k significa key y viene del mapeo con la relacion clave valor
    private V value; // la v significa value

    public Por(K clave, V value) {
        this.clave = clave;
        this.value = value;
    }

    public void mostarContenido(){
        System.out.println( clave +" ("+ clave.getClass().getName() +")" + ": " + value +" ("+ value.getClass().getName() +")");
    }

    static void main() {
        Por<String,Integer> ejemplo = new Por<>("ID", 999);
        ejemplo.mostarContenido();
    }
}
