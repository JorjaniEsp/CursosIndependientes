public class operadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;

        // operadores compuesto

        i += 2;// i = i + 2

        j -= 4; // j = j - 4

        j *= 3; // j = j * 3

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Andres' ";
        sqlString += " and c.activo = 1";


    }
}