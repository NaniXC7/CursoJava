import java.util.Scanner;

public class MultiplicarNumeros {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int opcion = 0;

        do{
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Agregar");
            System.out.println("4. Listar");
            System.out.println("5. Salir");

            System.out.print("Ingrese la opción: ");
            opcion = tec.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Usuario actualizado");
                    break;
                case 2:
                    System.out.println("Usuario eliminado");
                    break;
                case 3:
                    System.out.println("Usuario agregado");
                    break;
                case 4:
                    System.out.println("Usuario listado");
                    break;
                case 5:
                    System.out.println("Ha salido con éxito!");
                    break;
                default:
                    System.out.println("Opción no disponible\nInténtelo nuevamente\n");
            }

        }while(opcion != 5);
    }
}
