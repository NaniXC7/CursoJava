import java.util.Scanner;

public class SistemaDeGasolina {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de gasolina (max 70 lts)");
        double gas = tec.nextDouble();

        if(gas == 70){
            System.out.println("Estanque lleno");
        } else if (gas < 70 && gas >= 60) {
            System.out.println("Estanque casi lleno");
        } else if (gas < 60 && gas >= 40) {
            System.out.println("Estanque 3/4");
        } else if (gas < 40 && gas>= 35) {
            System.out.println("Medio estanque");
        } else if (gas < 35 && gas >= 20) {
            System.out.println("Suficiente");
        } else if (gas < 20 && gas >= 1) {
            System.out.println("Insuficiente");
        }
    }
}
