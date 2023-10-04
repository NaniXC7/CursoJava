import java.util.Arrays;

public class EjemploArreglosForInverso {
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

        System.out.println("==== Usando for inverso====");
        for (int i = 0; i < productos.length; i++) {

            System.out.println("Para i = " + (productos.length-1-i) + " valor: " + productos[productos.length-1-i]);

        }

        System.out.println("==== Usando for inverso2====");
        for (int i = productos.length-1; i >= 0; i--) {

            System.out.println("Para i = " + (i) + " valor: " + productos[i]);

        }
    }
}