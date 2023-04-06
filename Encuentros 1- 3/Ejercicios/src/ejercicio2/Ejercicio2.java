package ejercicio2;


public class Ejercicio2 {

 
    public static void main(String[] args) {
        
 
        //Procesador, RAM, Disco, PlacaMadre, so
        Computadora pc = new Computadora("Intel I3", 8, 320, "LTE12456", "Windows 10pro");
        
        System.out.println("Procesador: " + pc.getProcesador());
        System.out.println("Memoria ram en GB: " + pc.getRam());
        System.out.println("Espacio en disco en GB: " + pc.getDisco());
        System.out.println("Modelo de placa madre: " + pc.getPlacaMadre());
        System.out.println("Sistema operativo: " + pc.getSo());
    }
    
}
