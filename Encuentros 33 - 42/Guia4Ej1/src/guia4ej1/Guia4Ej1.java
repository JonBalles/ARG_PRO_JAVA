package guia4ej1;


public class Guia4Ej1 {

   
    public static void main(String[] args) {
        Animal perro = new Perro("Stich", "Carne", 15, "Doberman" );
        perro.Alimentarse();
                
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        Animal caballo = new Caballo("Spirit", "Pasto", 25, "Fino");
        caballo.Alimentarse();
    }

}
