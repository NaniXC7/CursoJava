import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
           main(args);
           System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de: " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resulatdoOctal = "numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + resulatdoOctal);

        String resuiltadoHex = "numero hexadecimal de: " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + resuiltadoHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resulatdoOctal;
        mensaje += "\n" + resuiltadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
