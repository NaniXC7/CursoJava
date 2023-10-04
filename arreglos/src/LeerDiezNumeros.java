import java.util.Scanner;

public class LeerDiezNumeros {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner tec =  new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese una cantidad: ");
            numeros[i] = tec.nextInt();
        }

        for (int i = 0; i < numeros.length/2; i++) {
            System.out.println(numeros[numeros.length-1-i] + " --- " + numeros[i]);
        }
    }
}
