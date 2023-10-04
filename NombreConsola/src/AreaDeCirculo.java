import java.util.Scanner;

public class AreaDeCirculo {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.print("Ingresa el radio de la circunferencia:");

        double radio = tec.nextDouble();

        double area = Math.PI*Math.pow(radio,2);

        System.out.println("El área del círculo es de: " + area);
    }
}
