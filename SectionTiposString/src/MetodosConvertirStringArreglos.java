public class  MetodosConvertirStringArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalemguas";

        // convierte el string en un arreglo [] de char
        // cada letra se va a guardar en las pocisiones del arreglo.
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        // dato; si ejecuto ese soutv lo que devuelve es la referencia (su etiqueta hash)

        char[] letras = trabalenguas.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            System.out.println("letras[i] = " + letras[i]);
        }

        // otra forma de recorrer un arreglo es for-each
        /*
         for (char letra : letras) {
            System.out.println(letra);
        }
         */
        
        // otra forma

        /*
         * RESUMEN TÉCNICO: String.split()
         * ----------------------------------------------------------------------------
         * PROPÓSITO:
         * Divide un String en un array de sub-strings basándose en un patrón (regex).
         * * SINTAXIS:
         * String[] partes = cadena.split(String regex, int limit);
         * * COMPORTAMIENTO:
         * 1. El primer parámetro es una Expresión Regular (no solo un texto plano).
         * 2. Si el delimitador es un carácter especial de Regex (como . | * +),
         * debe escaparse con doble barra: split("\\.");
         * 3. El parámetro 'limit' (opcional):
         * - n > 0: El array tendrá un tamaño máximo de 'n'.
         * - n < 0: Incluye cadenas vacías al final del array.
         * - n = 0 (por defecto): Elimina cadenas vacías al final del array.
         * * EJEMPLOS RÁPIDOS:
         * "A-B-C".split("-")        -> ["A", "B", "C"]
         * "1.2.3".split("\\.")      -> ["1", "2", "3"] (Punto escapado)
         * "A:B:C".split(":", 2)     -> ["A", "B:C"]    (Límite de divisiones)
         * "palabra".split("")       -> ["p", "a", "l", "a", "b", "r", "a"]
         * ----------------------------------------------------------------------------
         */

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo = trabalenguas.split("a");

        for (String letra : arreglo ){
            System.out.println("letra = " + letra);
        }

        String archivo = "alguna.imagen.jpeg";
        String[] archivoArr = archivo.split("[.]");
        // nota; el punto dentro de expresion regular(la expresion regular es lo que debe ir en el argumento del split)
        // para poder utilizarlo como un divisor hay que usar el //. o [ . ]

        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println(archivoArr[i]);
        }
        


    }
}