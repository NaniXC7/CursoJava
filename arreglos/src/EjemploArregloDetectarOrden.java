import java.util.Scanner;

public class EjemploArregloDetectarOrden {

    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese 7 números");
        for (int i = 0; i < a.length; i++) {
            a[i] = tec.nextInt();
        }

        boolean ascendete = false;
        boolean descendente = false;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i] > a[i+1]){
                descendente = true;
            }

            if(a[i] < a[i+1]){
                ascendete = true;
            }
        }

        if(ascendete == true && descendente == true){
            System.out.println("Arreglo = desordenado");
        }

        if(ascendete == false && descendente == false){
            System.out.println("Arreglo = todos son iguales");
        }

        if(ascendete == true && descendente == false){
            System.out.println("Arreglo = ascendente");
        }

        if(ascendete == false && descendente == true){
            System.out.println("Arreglo = descendete");
        }
    }
}
