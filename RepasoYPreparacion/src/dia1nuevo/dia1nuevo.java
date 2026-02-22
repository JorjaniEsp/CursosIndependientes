package dia1nuevo;

public class dia1nuevo {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,5};
        System.out.println(hayDuplicados(numeros));
    }

    public static String inversor(String str){
        String strReverso = "";
        for (int i = str.length(); i > 0; i--){
                strReverso += str.substring(i-1, i);
        }
        return strReverso;
    }

    public static String inversorConCharArray(String str){

        String strReverso = "";
        for (int i = str.length(); i > 0; i--){
            strReverso += str.charAt(i);
        }
        return strReverso;
    }

    public static int ContadorVocales(String palabra){
        String vocales = "aeiouAEIOUáéíóú";
        int cantVocales = 0;
        for (int i = palabra.length() - 1; i >= 0; i--){
            if (vocales.contains("" + palabra.charAt(i))){
                cantVocales++;
            }
        }
        return cantVocales;
    }

    public static int cntadorVocalesV2(String palabra){
            String vocales = "aeiouAEIOUáéíóú";
            int cantVocales = 0;
            for (int i = 0; i < palabra.length(); i++){
                if (vocales.indexOf(palabra.charAt(i)) != -1){
                    cantVocales++;
                }
            }
            return cantVocales;
    }


    public static boolean isPrimo(int n){
        int x = 0;
        boolean is = false;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                if (i == 1 || i == n){
                    x++;
                }else {
                    break;
                }
            }
        }

        is = x == 2;

        return is;
    }
    public static boolean isPrimoV2(int n){
        if (n <= 1) return false; // 0 y 1 no son primos
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                return false; // Si se divide por otro, muere aquí
            }
        }
        return true; // Si sobrevivió al ciclo, es primo
    }
    public static int sumaDigitos(int numero){
        String nStr = Integer.toString(numero);
        int total = 0;
        for (int i = 0; i < nStr.length(); i++){
            total += Integer.parseInt(""+nStr.charAt(i));
        }
        return total;
    }
    public static int sumaDigitosV2(int numero){
        int total = 0;
        numero = Math.abs(numero);
        while (numero > 0) {
            total += numero % 10;
            numero = numero / 10;
        }
        return total;
    }
    public static void fizzBuzz(int n){
        for (int i = 1 ; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }

    public static int masAlto(int[] numeros){
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            mayor = (mayor < numeros[i]) ? numeros[i] : mayor;
        }
        return mayor;

    }

    public static boolean hayDuplicados(int[] numeros){
        for (int i = 0 ; i < numeros.length ; i++){
            for (int j = i + 1; j < numeros.length; j++){
                if (numeros[i] == numeros[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }

}
