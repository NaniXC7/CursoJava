import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {

            String actual = arreglo[i];
            String inverso = arreglo[arreglo.length-1-i];
            arreglo[i] = inverso;
            arreglo[arreglo.length-1-i] = actual;
            total--;

        }
    }

    public static void sortBurbuja(Object[] arreglo){

        int contador = 0;

        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-1-i; j++) {
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){
                    Object auxiliarInt = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliarInt;
                }
                contador++;
            }
        }

        System.out.println("Contador = " + contador);
    }
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chormecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        sortBurbuja(productos);
        System.out.println("==== Usando for ====");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("para índice " + i + " : " + numeros[i]);
        }

    }
}