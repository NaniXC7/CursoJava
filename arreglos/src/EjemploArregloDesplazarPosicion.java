import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {

    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = tec.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un número a insertar");
        numero = tec.nextInt();

        posicion = 0;

        while (posicion<6 && numero > a[posicion]){
            posicion++;
        }

        for (int i = a.length-2; i >= posicion ; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = numero;

        for (int num:
             a) {
            System.out.println(num);
        }
    }
}
