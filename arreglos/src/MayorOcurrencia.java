import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MayorOcurrencia {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner tec = new Scanner(System.in);
        int contOcurrencia = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa cantidades un rango de 1 - 9: ");
            numeros[i] = tec.nextInt();
        }

        int[] valoresRepetidos = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            contOcurrencia = 0;

            for (int j = 1; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    contOcurrencia++;
                }

                valoresRepetidos[i] = contOcurrencia;

            }

        }

        int max = 0;
        int posicion = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(max < valoresRepetidos[i]){
                max = valoresRepetidos[i];
                posicion = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + numeros[posicion]);
        System.out.println("el elemento " + numeros[posicion] + " esta repetido " + max + " veces");
    }
}
