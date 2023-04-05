package ejercicio3;


public class Ejercicio3 {


    public static void main(String[] args) {
       Jugador uno = new Jugador();
       
       uno.setNombre("Juan");
       uno.setPuntaje(140);
       uno.setNacionalidad("Argentino");
       uno.setEdad(29);
       
        System.out.println("Datos del jugador");
        System.out.println("Nombre: " + uno.getNombre());
        System.out.println("Nacionalidad: " + uno.getNacionalidad());
        System.out.println("Edad: " + uno.getEdad());
        System.out.println("Puntaje: " + uno.getPuntaje());
    }
    
}
