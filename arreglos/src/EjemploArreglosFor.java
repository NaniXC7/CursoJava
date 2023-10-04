import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chormecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        System.out.println("==== Usando for ====");
        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }

        System.out.println("==== Usando foreach ====");
        for(String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("==== Usando while ====");
        int i = 0;
        while (i < productos.length) {
            System.out.println("para índice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("==== Usando dowhile ====");
        int j = 0;
        do {
            System.out.println("para índice " + j + " : " + productos[j]);
            j++;
        }while (j < productos.length);

        int[] numeros = new int[10];

        for (int k = 0; k < numeros.length; k++) {
            numeros[k] = k*3;
        }

        for (int k = 0; k < numeros.length; k++) {
            System.out.println("numeros = " + numeros[k]);
        }


    }
}