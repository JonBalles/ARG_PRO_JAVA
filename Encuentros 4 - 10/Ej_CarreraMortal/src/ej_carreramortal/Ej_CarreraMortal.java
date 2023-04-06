package ej_carreramortal;


public class Ej_CarreraMortal {

  
    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Azul","AA59OP");
        
        auto1.avanzar(20);
        
        //error: al retroceder 40, combustible queda en -10. solo deberia avanzar 30 y devolver "No hay mas combustible"
        auto1.retroceder(40);
        
        
        
    }
    
}
