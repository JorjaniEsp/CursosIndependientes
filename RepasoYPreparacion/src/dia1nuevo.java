public class dia1nuevo {
    public static void main(String[] args) {
        System.out.println(inversor("luz"));
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
            strReverso += str.t;
        }
        return strReverso;
    }
}
