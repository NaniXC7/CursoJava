import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nom1 = "";
        String nom2 = "";
        String nom3 = "";


        nom1 = JOptionPane.showInputDialog("Ingrese el primer nombre");


        nom2 = JOptionPane.showInputDialog("Ingrese el segundo nombre");


        nom3 = JOptionPane.showInputDialog("Ingrese el tercer nombre");


        int tam = 0;

        tam = nom1.split(" ")[0].length() < nom2.split(" ")[0].length() ? nom2.split(" ")[0].length() : nom1.split(" ")[0].length();
        tam = tam < nom3.split(" ")[0].length() ? nom3.split(" ")[0].length() : tam;

        String nomFinal = "";

        if(tam == nom1.length()){
            nomFinal = nom1;
        } else if (tam == nom2.length()) {
            nomFinal = nom2;
        }else {
            nomFinal = nom3;
        }

        System.out.println("El nombre más largo es: " + nomFinal + " con " + tam + " letras");
    }
}
