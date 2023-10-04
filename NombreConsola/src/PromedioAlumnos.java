import java.util.Scanner;

public class PromedioAlumnos {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double notas[] = new double[20];

        System.out.println("Ingresa las notas de los alumnos en escala de  1 - 7");
        int tamaño = notas.length;

        double notasMayores5 = 0;
        double notasMenores5 = 0;
        double promedio = 0;
        int notas1 = 0;
        int contadorNotas5 = 0;
        int contadorNotasMenores5 = 0;

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingresa la nota " + (i + 1) + ":");
            notas[i] = tec.nextDouble();
            if (notas[i] == 0) {
                System.out.println("Error de programa");
                break;
            } else if (notas[i] == 1) {
                notas1++;
            } else if (notas[i] > 5) {

                notasMayores5 += notas[i];
                contadorNotas5++;
            } else if (notas[i] < 4) {
                notasMenores5 += notas[i];
                contadorNotasMenores5++;
            }
            promedio += notas[i];
        }
        System.out.println("El promedio total es de: " + promedio/tamaño);
        System.out.println("Promedio notas mayores a 5: " + notasMayores5 / contadorNotas5);
        System.out.println("Promedio notas menores a 4: " + notasMenores5 / contadorNotasMenores5);
        System.out.println("Y la cantidad de notas 1 es de: " + notas1);
    }
}