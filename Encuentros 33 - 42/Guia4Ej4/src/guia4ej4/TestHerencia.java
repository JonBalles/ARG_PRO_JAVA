package guia4ej4;


public class TestHerencia {

   
    public static void main(String[] args) {
        Position ubi = new Position(100,200);
        
        Guerrero Thor = new Guerrero(true, "Thor", ubi);
                
        Thor.Girar();
        Thor.Girar();
        Thor.Girar();
        
        for (int i = 0; i < 5; i++)
        {
            Thor.avanzar();
        }
        
        for (int i = 0; i < 8; i++)
        {
            Thor.Disparar();
        }
        
    }

}
