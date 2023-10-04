import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        int nma = 0;
        int nme = 0;

        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        n1 = tec.nextInt();

        System.out.println("Ingrese el segundo número");
        n2 = tec.nextInt();

        nma = (n1 > n2) ? n1 : n2;
        nme = (nma == n1) ? n2 : n1;

        System.out.println("El número mayor es: " + nma + " y el menor es: " + nme);
    }
}
