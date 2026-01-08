import java.util.Scanner;

public class EjemploLoginOperadorTernario {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Jorjanie";
        passwords[0] = "12345";

        usernames[0] = "Jorjanie";
        passwords[0] = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        String userNameIngresado = sc.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String passwordIngresada = sc.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            esAutenticado = userNameIngresado.equals(usernames[i]) && passwordIngresada.equals(passwords[i]) ? true : esAutenticado;


           /*  esAutenticado = false;
            if ((usernames[i].equals(userNameIngresado) && passwords[i].equals(passwordIngresada)) ) {
                esAutenticado = true;
            } else {
                System.out.println("Contraseña o nombre de usurioa son incorrectos.");
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido usario ".concat(userNameIngresado).concat("!") : "Los siento, requiere autentificacion";
        System.out.println(mensaje);

        /*f (esAutenticado){
            System.out.println("Bienvenido usario ".concat(userNameIngresado).concat("!"));
        } else {
            System.out.println("Los siento, requiere autentificacion");
        }*/
    }
}