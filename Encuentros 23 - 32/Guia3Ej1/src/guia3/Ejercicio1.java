package guia3;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        //Nombre, apellido, edad, dni
        Persona persona1 = new Persona("Jon","Balles",20,289289289);
        
        //Nombre, raza, edad, tama 
        Perro coco = new Perro("Coco", "Bulldog", 2, 4.6);
        Perro tuca = new Perro("Tuca", "Cocker", 5, 2.2);
        Perro boni = new Perro("Boni", "Beagle", 6, 3.2);
        Perro pipi = new Perro("Pipi", "Caniche", 3, 0.9);
        
        
        persona1.adoptarPerro(coco);
        persona1.adoptarPerro(tuca);
        persona1.adoptarPerro(boni);
        persona1.adoptarPerro(pipi);
        
        
        persona1.perroMasGrande();
        
    }

}
