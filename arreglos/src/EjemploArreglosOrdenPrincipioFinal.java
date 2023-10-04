public class EjemploArreglosOrdenPrincipioFinal {

    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numeros.length - i; i++) {

            System.out.println(numeros[i] + " ---- " + numeros[numeros.length - 1 - i]);

        }

        int cont = 0;

        for (int i = 0; i < numeros.length - i; i++) {

            a[cont++] = numeros[i];
            a[cont++] = numeros[numeros.length - 1 - i];

            //System.out.println(numeros[i] + " ---- " + numeros[numeros.length - 1 - i]);

        }

        for(int num : a){
            System.out.println(num);
        }


    }
}
