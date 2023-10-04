import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chormecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));
        System.out.println("==== Usando for ====");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }

    }
}