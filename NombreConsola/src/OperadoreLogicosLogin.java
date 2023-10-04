import java.util.Scanner;

public class OperadoreLogicosLogin {
    public static void main(String[] args) {

        /*String [] usernames = new String[3];
        String [] passwords = new  String[3];
        usernames [0] = "daniel";
        passwords [0] =  "12345";

        usernames [1] = "admin";
        passwords [1] = "12345";*/

        String[] usernames = {"daniel", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < passwords.length; i++) {
            esAutenticado = usernames[i].equals(u) && passwords [i].equals(p) ? true : esAutenticado;

            /*if(usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Lo sentimos, requiere autenticación\nusername o contraseña incorrectos";
        System.out.println("mensaje = " + mensaje);
        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autenticación");
            System.out.println("username o contraseña incorrectos");
        }*/
    }
}
