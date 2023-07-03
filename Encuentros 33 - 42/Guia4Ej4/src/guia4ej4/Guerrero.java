package guia4ej4;


public class Guerrero extends Personaje {
    protected boolean caballo;
    
    public Guerrero(boolean caballo, String nombre, Position ubicacion){
        super(nombre, ubicacion);
        this.caballo = caballo;
    }
    
    @Override
    public void avanzar(){
        
        int i = 0;
        if(caballo){
            do{
             super.avanzar();
              i++;
            }while(i< 10);
            System.out.println("Avanzo 10 pasos");
        }else{
            System.out.println("Avanza un paso. Caballo no disponible");
            super.avanzar();
        }
           System.out.println("Ubicacion eje Y: " + ubicacion.getY());
           System.out.println("Ubicacion eje X: " + ubicacion.getX());
    }
    
    @Override
    public void Disparar(){
        super.Disparar();
       if(super.energia < 30 && caballo == true){
           this.caballo = false;
           System.out.println("Perdiste el caballo");
       }

    }
}
