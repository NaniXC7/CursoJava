import java.util.Scanner;

public class SillaMatrices {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la silla");
        int tamaño = tec.nextInt();
        String[][] equis = new String[tamaño][tamaño];

        if (tamaño <= 0) {
            System.err.println("ERROR");
            System.exit(1);
        } else {
            for (int i = 0; i < equis.length; i++) {
                for (int j = 0; j < equis[i].length; j++) {

                    equis[(tamaño/2)][j] = "1";
                    if (j == 0 || (i > (tamaño / 2) && j == equis.length-1)) {
                        equis[i][j] = "1";
                    } else {
                        equis[i][j] = "0";

                    }
                }
            }

            for (String[] dibujo :
                    equis) {
                for (String imprimir :
                        dibujo) {
                    System.out.print(imprimir);
                }
                System.out.println();
            }
        }
    }
}
