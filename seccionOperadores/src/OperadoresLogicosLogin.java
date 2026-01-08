import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String userName = "Jorjanie";
        String password = "123";

        String userName2 = "admin";
        String password2 = "123";


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        String userNameIngresado = sc.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String passwordIngresada = sc.nextLine();

        if ((userName.equals(userNameIngresado) && password.equals(passwordIngresada)) || (userName2.equals(userNameIngresado) && password2.equals(passwordIngresada)) ){
            System.out.println("Bienvenido! ");
        } else {
            System.out.println("Contraseña o nombre de usurioa son incorrectos.\nVuelva a intentarlo.");
            main(args);
        }

        // la forma de mi profe
        /*
        boolean esAutenticado = false;
        if ((userName.equals(userNameIngresado) && password.equals(passwordIngresada)) || (userName2.equals(userNameIngresado) && password2.equals(passwordIngresada))) {
         esAutenticado = true;
        } else {
            System.out.println("Contraseña o nombre de usurioa son incorrectos.");

        }

        if (esAutenticado){
            sout "Bienvenido usario ".concat(u).concat(!);
        } else {
            sout "Los siento, requiere autentificacion"
        }
        **/
    }

}