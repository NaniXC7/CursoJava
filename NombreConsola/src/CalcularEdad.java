import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class CalcularEdad {
    public static void main(String[] args) {

        System.out.println("Ingrese su fecha de nacimiento 'yyyy-MM-dd'");
        Scanner tec = new Scanner(System.in);
        String fechaNacimiento = tec.next();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date nacimiento = format.parse(fechaNacimiento);
            Date fechaActual = new Date();

            format = new SimpleDateFormat("yyyyMMdd");

            int fechaNaci = Integer.parseInt(format.format(nacimiento));
            int fechaActu = Integer.parseInt(format.format(fechaActual));

            int edadActual = (fechaActu - fechaNaci)/10000;
            System.out.println("Su edad actual es: " + edadActual);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
