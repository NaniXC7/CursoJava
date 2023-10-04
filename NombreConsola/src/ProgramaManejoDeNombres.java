import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Ingresa el primer nombre:");
        String nombre1 = tec.next();
        String nombre1Mod = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2,nombre1.length());

        System.out.println("Imgresa el segundo nombre:");
        String nombre2 = tec.next();
        String nombre2Mod = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2,nombre2.length());

        System.out.println("Ingresa el tercer nombre:");
        String nombre3 = tec.next();
        String nombre3Mod = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2,nombre3.length());
        
        String resultado = nombre1Mod.concat("_").concat(nombre2Mod).concat("_").concat(nombre3Mod);
        System.out.println("resultado = " + resultado);

    }
}
