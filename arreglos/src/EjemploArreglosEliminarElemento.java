import java.util.Scanner;

public class EjemploArreglosEliminarElemento {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = tec.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese una posición a eliminar entre 0 - 9");
        int posicion = tec.nextInt();

        for (int i = posicion; i < a.length-1; i++) {

            a[i] = a[i+1];

        }

        for (int num:
             a) {
            System.out.println(num);
        }

        int[] b = new int[a.length-1];
        System.arraycopy(a,0,b,0,b.length);

        for (int num:
                b) {
            System.out.println(num);
        }
    }
}
