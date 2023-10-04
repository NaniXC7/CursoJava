import java.util.Scanner;

public class ContadorDeNumeros {

    public static void main(String[] args) {

        int[] numeros = new int[7];
        Scanner tec = new Scanner(System.in);
        int contPositivos = 0, contNegativos = 0, contNeutro = 0, summaPos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa una cantidad positiva o negativa: ");
            numeros[i] = tec.nextInt();
        }

        for (int num:
             numeros) {
            if(num < 0){
                contNegativos += num;
            } else if (num > 0) {
                contPositivos += num;
            }else {
                contNeutro++;
            }
        }

        int cantidad = numeros.length;
        float promedioPositivos = contPositivos/cantidad;
        float promedioNegativos = contNegativos/cantidad;
        System.out.println(promedioPositivos + " promedio de números positivos ");
        System.out.println(promedioNegativos + " promedio de números negativos ingresados");
        System.out.println(contNeutro + " ceros ingresados");
    }
}
