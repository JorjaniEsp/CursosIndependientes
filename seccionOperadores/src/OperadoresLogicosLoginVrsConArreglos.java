import java.util.Scanner;

public class  OperadoresLogicosLoginVrsConArreglos {
    public static void main(String[] args) {

        String[] usernames = {"Jorjanie", "admin", "pedro"};
        String[] password = {"123", "123", "123"};
        int relacion = 0;
        boolean validacionUsuario = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        String userNameIngresado = sc.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String passwordIngresada = sc.nextLine();

        for (int i = 0; i < usernames.length; i++) {
            validacionUsuario = userNameIngresado.equals(usernames[i]);
            if (validacionUsuario){
                relacion = i;
            }
        }

        if (validacionUsuario && passwordIngresada.equals(password[relacion])){
            System.out.println("Bienvenido ".concat(userNameIngresado).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrectas.\nIntente de nuevo.");
            main(args);
        }

        // la forma de mi profe
        /*
        String[] passwords = new String[2];
        String[] passwords = new String[2];

        username[0] = "Jorjanie"
        password[0] = "12345"

        username[0] = "Jorjanie"
        password[0] = "12345"

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        String userNameIngresado = sc.nextLine();

        System.out.println("Ingrese la contraseña: ");
        String passwordIngresada = sc.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.lenght; i++){
            boolean esAutenticado = false;
        if ((usermames[i].equals(userNameIngresado) && password[i].equals(passwordIngresada)) ) {
         esAutenticado = true;
          } else {
            System.out.println("Contraseña o nombre de usurioa son incorrectos.");
            }
        }

        if (esAutenticado){
            sout "Bienvenido usario ".concat(u).concat(!);
        } else {
            sout "Los siento, requiere autentificacion"
        }

        */
    }

}















