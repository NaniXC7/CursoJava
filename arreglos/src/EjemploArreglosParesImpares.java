import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        int[] a, pares, impares;
        Scanner tec = new Scanner(System.in);

        a = new int[10];

        System.out.println("Ingrese 10 números o cantidades");
        for (int i = 0; i < a.length; i++) {
            a[i] = tec.nextInt();
        }

        int auxPar = 0;
        int auxImpar = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){
                auxPar++;
            }else{
                auxImpar++;
            }
        }

        pares = new int[auxPar];
        impares = new int[auxImpar];

        auxPar = 0;
        auxImpar = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                pares[auxPar++] = a[i];
            }else{
                impares[auxImpar++] = a[i];
            }
        }

        System.out.println("Números pares");
        for(int num : pares){
            System.out.print(num + " ");
        }

        System.out.println("\nNúmeros impares");
        for(int num : impares){
            System.out.print(num + " ");
        }
    }
}
