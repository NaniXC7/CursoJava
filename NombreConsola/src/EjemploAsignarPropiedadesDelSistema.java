import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("NombreConsola/src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            System.getProperties().list(System.out);
            
            String obtenerPropietie = System.getProperty("mi.propiedad.personalizada");
            System.out.println("obtenerPropietie = " + obtenerPropietie);
            System.out.println(System.getProperty("config.autor.nombre"));

        }catch (Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }
    }
}
