public class EjemploMatricesIdentidad {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] num:
             matriz) {
            for (int num2:
                 num) {
                System.out.print(num2 + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                    matriz[i][j] = 0;

            }
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == 0 || j == 0 || i == matriz.length-1 || j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }
            }
        }

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
