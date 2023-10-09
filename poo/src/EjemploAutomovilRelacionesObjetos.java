

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Automovil subaru =  new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.leerFarbicante() = " + mazda.getFabricante());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i < ruedasMaz.length; i++) {
           mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        /*Rueda[] ruedasNissan = new Rueda[5];
        for (int i = 0; i < ruedasNissan.length; i++) {
            ruedasNissan[i] = new Rueda("Pireli", 20, 11.5);
        }*/

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan",  "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo( TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pireli", 20, 11.5))
            .addRueda(new Rueda("Pireli", 20, 11.5))
            .addRueda(new Rueda("Pireli", 20, 11.5))
            .addRueda(new Rueda("Pireli", 20, 11.5))
            .addRueda(new Rueda("Pireli", 20, 11.5))
            .addRueda(new Rueda("Pireli", 20, 11.5));

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int i = 0; i < ruedasNissan2.length; i++) {
            ruedasNissan2[i] = new Rueda("Pireli", 20, 11.5);
        }

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan",  "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.DIESEL), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);
        nissan2.setColor(Color.AMARILLO);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());



    }
}