public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "a";
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            //c = c.concat(a).concat(b).concat("\n");// 4 ml
            c += a + b + "\n"; //34 mls
            //sb.append(a).append(b).append("\n");//0

        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);


    }
}
