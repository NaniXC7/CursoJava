import java.util.Scanner;

public class EjemploArregloNotasAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner tec = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = tec.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = tec.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = tec.nextDouble();
        }

        for (int i = 0; i < claseMatematicas.length; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);

        System.out.println("Promedio clase matemáticas: " + promedioMatematica);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: "
                + (promedioMatematica + promedioHistoria + promedioLenguaje)/3);

        System.out.println("Ingrese identificador del alumno (de 0 a 6)");
        int id = tec.nextInt();

        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id])/3;

        System.out.println("Promedio del alumno Nro. " + id + " : " + promedioAlumno);



    }
}
