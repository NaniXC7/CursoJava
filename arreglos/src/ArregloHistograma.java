import java.util.Scanner;

public class ArregloHistograma {

    public static void main(String[] args) {

        int[] numeros = new int[12];
        Scanner tec = new Scanner(System.in);
        String aste = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa cantidades un rango de 1 - 9: ");
            numeros[i] = tec.nextInt();
        }

        String[] histo = new String[6];
        String[] histoNum = {"1", "2", "3", "4", "5", "6"};

        for (int i = 0; i < histo.length; i++) {

            aste = "";

            for (int j = 1; j < numeros.length; j++) {
                String pos = Integer.toString(numeros[j]);
                if(histoNum[i].equals(pos)){
                    aste+= "*";
                }

                histo[i] = aste;

            }

        }

        for (int i = 0; i < histo.length; i++) {
            System.out.println((i+1) + " | " + (i+1) + ": " + histo[i]);
        }
    }
}
