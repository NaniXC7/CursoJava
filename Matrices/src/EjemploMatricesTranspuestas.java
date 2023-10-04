public class EjemploMatricesTranspuestas {

    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for (int[] num:
             matriz) {
            for (int num2:
                 num) {
                System.out.print(num2 + "\t");
            }
            System.out.println();
        }

        int aux;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("Transpuesta\n");
        for (int[] num:
                matriz) {
            for (int num2:
                    num) {
                System.out.print(num2 + "\t");
            }
            System.out.println();
        }
    }
}
