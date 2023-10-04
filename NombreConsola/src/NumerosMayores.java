import java.util.Scanner;

public class NumerosMayores {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de números que quieres comparar, mínimo 10 cantidades");
        int cantidad = tec.nextInt();
        int numeros[] = new int[cantidad];
        int tamaño = numeros.length;
        int numeroMenor = 0;

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el número en la posición " + (i+1));
            numeros[i] = tec.nextInt();
        }
        numeroMenor = numeros[0];
        for (int i = 0; i < tamaño; i++) {

            if(!(numeroMenor < numeros[i])){
                numeroMenor = numeros[i];
            }
        }

        if(numeroMenor < 10){
            System.out.println(numeroMenor + " es menor que 10");
        }else {
            System.out.println(numeroMenor + " es mayor que 10");
        }
    }
}
