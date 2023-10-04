import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de la factura:");
        String nombreFactura = scanner.nextLine();
        
        double precio_1 = 0;
        double precio_2 = 0;

        System.out.println("Ingrese los precios: ");
        try{
            
            precio_1 = scanner.nextDouble();
            precio_2 = scanner.nextDouble();
            
        }catch(Exception e){

            System.out.println("Error! Debe ingresar el costo de los productos");
            main(args);
            System.exit(0);
            
        }
        
        double totalProductos = precio_1 + precio_2;
        double valorImpuesto = (totalProductos/100)*19;
        double totalFinal = totalProductos + valorImpuesto;
        
        String facturaFinal = nombreFactura + " tiene un total bruto de " + totalProductos + ", con un impuesto de " + valorImpuesto + " y el monto después del impuesto es de " + totalFinal;
        System.out.println(facturaFinal);
    }
}
