package repasocosillas;

import java.util.ArrayList;
import java.util.List;

public class ListaContacto {

    private ArrayList<Contacto> contactos;

    public ListaContacto(){
        this.contactos = new ArrayList<>();
    }

    public ListaContacto(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(Contacto c){
        contactos.add(c);
    }

    // Crear un metodo que reciba una Lista y agregue sus elementos a el ArrayList "contactos" de la clase

    public void agregarLista(ArrayList<Contacto> lista){
        for(int i = 0; i < lista.size(); i++) {
            contactos.add(lista.get(i));
        }
    }

    // un metodo que retorne la unión del ArrayList "contactos" (sin modificar el de la clase)
    // y la lista que ingreso.

    public ArrayList<Contacto> unirContactos(ArrayList<Contacto>  lista){
        lista.addAll(contactos);
        return lista;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    // un metodo que reciba 2 listas y devuelva la unión.

    public static ArrayList<Contacto> unirContactos(ArrayList<Contacto>  lista,ArrayList<Contacto>  lista2){
        lista.addAll(lista2);
        return lista;
    }



    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        for (Contacto c : contactos) {
            salida.append(c.toString()).append("\n");
        }
        return salida.toString();
    }

    public static void main(String[] args) {


        Contacto c1 = new Contacto("C1",2);
        Contacto c2 = new Contacto("C2",2);
        Contacto c3 = new Contacto("C3",3);


        ListaContacto l1 = new ListaContacto();
        l1.agregarContacto(c1);

        ListaContacto l2 = new ListaContacto();
        l2.agregarContacto(c2);

        l1.unirContactos(l2.getContactos());
        System.out.println(l1);


        ListaContacto l3 = new ListaContacto();
        l3.agregarContacto(c3);


    }
}
