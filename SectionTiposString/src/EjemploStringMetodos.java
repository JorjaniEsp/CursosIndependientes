public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Jorjanie";

        // el tamaño del string Empieza a contar desde 0
        System.out.println("nombre.length() = " + nombre.length());

        // como convertir a mayuscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // como convertir a minuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // como comparar contenido o valor NO referencias o instancias como cuando se == con objetos
        System.out.println("nombre = equals(\"Jorjanie\")" + nombre.equals("Jorjanie"));  // en el parentesis va un string o texto entre ""

        // comparar ignorando si son mayusculas o minusculas
        System.out.println("nombre.equalsIgnoreCase(\"JOjanIe\") = " + nombre.equalsIgnoreCase("JOjanIe"));

        /*
        * compareTo(String otro)
         * --------------------------
         * - PROPÓSITO: Determinar el **Orden Natural** (alfabético/diccionario).
         * Establece la posición relativa de una cadena respecto a otra.
         * - RETORNO: **int** (un valor numérico que representa la diferencia de códigos Unicode).
         *
         * - INTERPRETACIÓN DEL RETORNO:
         * a) CERO (0): Las cadenas son **idénticas** (iguales).
         * b) NEGATIVO (< 0): La cadena actual va **antes** (es "menor") que la cadena argumento.
         * c) POSITIVO (> 0): La cadena actual va **después** (es "mayor") que la cadena argumento.
         *
         * - CÁLCULO: Se basa en la **diferencia numérica de los códigos Unicode** (ASCII) de los
         * caracteres en la primera posición donde difieren.
         *
         * EJEMPLO:
         * "Jorjanie".compareTo("fifa")
         * 'J' (74) - 'f' (102) = -28  (Negativo, "Jorjanie" va antes que "fifa" en una lista ordenada)
         */
        System.out.println("nombre.compareTo(\"fifa\") = " + nombre.compareTo("fifa"));

        // como obtener un caracter de un String y recibe un valor entero y seleccina el caracter en esa posicion
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

        // obtener una parte de un string, ingresa de que posicion empieza a tomar caracteres y en que posicion termina
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));

        String trabalenguas = "trabalemguas";

        // como remplazar algun carcater por otro; escoge los caracteres a remplazar y su remplazo
        // este metodo como los demas, no modifican el string, solo crean un nuevo string con esas carcteristicas
        System.out.println("trabalenguas.replace(\"a\",\"p\") = " + trabalenguas.replace("a","p"));

        // como saber si quieres saber si el string a valuar tiene un caracter o frase en especifica
        // y retonar la primera posicion donde haya una concidencia
        // empieza a contar desde 0
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("a"));

        // lo mismo pero para encontrar la ultima coincidencia
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        // indexOf retonar -1 si no encuentra coincidencias.

        // uno parecido es el contains, pero retona true o false
        System.out.println("trabalenguas.contains(\"hola\") = " + trabalenguas.contains("hola"));

        // saber si comienza con tal caracter, retorna true o false
        System.out.println("trabalenguas.startsWith(\"Traba\") = " + trabalenguas.startsWith("Traba"));

        // saber si termiana con tal caracter
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));

        // para eliminar espacios
        System.out.println("trabalenguas.trim() = " + trabalenguas.trim());


    }
}