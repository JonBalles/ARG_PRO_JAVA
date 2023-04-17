package ejercicio7;


public class Ejercicio7 {


    public static void main(String[] args) {
       Robot tito = new Robot("Tito");
       
       
       System.out.println(tito.getBateria());
       tito.avanzar(600); // avanzo mas de lo que da la bate
        System.out.println(tito.getBateria());
        tito.avanzar(500);
        System.out.println(tito.getBateria());
    }
    
}
