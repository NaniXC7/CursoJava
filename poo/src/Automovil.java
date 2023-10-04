public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int utlimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO =" Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";
    public Automovil(){
        this.id = ++utlimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null)
        {
            this.estanque = new Estanque();
        }

        return estanque;

    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String verDetalle(){

    String detalle = "auto.id = " + getId() +
            "\nauto.fabricante = " + getFabricante() +
            "\nauto.modelo = " + getModelo();
    if(this.getTipo() != null){
        detalle += "\nauto.tipo = " + getTipo().getDescripcion();
    }

    detalle += "\nauto.color = " + getColor().getColor() +
            "\nauto.colorPatente = " + Automovil.colorPatente.getColor();

    if(this.getMotor() != null){
        detalle += "\nauto.cilindrada = " + this.motor.getCilindrada();
    }

    return detalle;

    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar+"\n"+frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(porcentajeBencina*getEstanque().getCapacidad());
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/((porcentajeBencina/100f)*getEstanque().getCapacidad());
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/((porcentajeBencina/100f)*Automovil.capacidadEstanqueEstatico);
    }
    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico(){
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico){
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil)obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color.getColor() + '\'' +
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadEstanque=" + estanque.getCapacidad() +
                ", Id=" + id +
                '}';
    }
}
