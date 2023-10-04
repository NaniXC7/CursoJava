import java.util.Scanner;

public class EjemploArreglosNumeroMayor {

    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingresa 5 enteros o números");
        for (int i = 0; i < a.length; i++) {
            a[i] = tec.nextInt();
        }

        int max = 0;

        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("a[max] = " + a[max]);
    }
}
