public class Rueda {
    private String fabricante;
    private String aro;
    private double ancho;

    public Rueda(String fabricante, String aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getAro() {
        return aro;
    }

    public double getAncho() {
        return ancho;
    }
}
