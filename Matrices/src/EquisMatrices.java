import java.util.Scanner;

public class EquisMatrices {

    public static void main(String[] args) {
        Scanner tec =  new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la X");
        int tamaño = tec.nextInt();
        String[][] equis = new String[tamaño][tamaño];

        if(tamaño <= 0){
            System.err.println("ERROR");
            System.exit(-1);
        }else {
            for (int i = 0; i < equis.length; i++) {
                for (int j = 0; j < equis[i].length; j++) {
                    if(i == j || (j == tamaño-i-1)){
                        equis[i][j] = "X";
                    }else {
                        equis[i][j] = "_";
                    }
                }
            }

            for (String[] dibujo:
                 equis) {
                for (String imprimir:
                     dibujo) {
                    System.out.print(imprimir);
                }
                System.out.println();
            }
        }
    }
}
