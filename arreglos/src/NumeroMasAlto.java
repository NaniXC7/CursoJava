import java.util.Scanner;

public class NumeroMasAlto {

    public static void main(String[] args) {

        int[] numeros = new int[7];
        Scanner tec = new Scanner(System.in);

        int contador = 0;
        while (contador < numeros.length){

            System.out.println("Ingrese una cantidad en un rango de 11 - 99");
            numeros[contador] = tec.nextInt();

            if(numeros[contador] < 11 && numeros[contador] > 99){
                System.out.println("Cantidad ingresada fuera de rango indicado\n" +
                        "Ingrese la cantidad nuevamente: ");
                numeros[contador] = tec.nextInt();
            }

            contador++;
        }

        int max = 0;

        for (int i = 0; i < numeros.length-1; i++) {
            max = (max >= numeros[i]) ? max : numeros[i];
        }

        System.out.println("El número más alto es: " + max);
    }
}
