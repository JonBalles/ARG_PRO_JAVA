package ejercicio7;


public class Robot {
    private int bateria = 50;
    private String nombre;
    
    
    public Robot(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public int getBateria() {
        return bateria;
    }
    
    public boolean bateriaVacia(){
        return bateria <= 0;
    } 
    
    public void avanzar(int pasos){
        if(!bateriaVacia()){
            if(pasos / 10 <= bateria){
                bateria = bateria - pasos / 10;
                System.out.println(nombre + " avanzó " + pasos + " pasos");
            }else{
                System.out.println("No hay suficiente bateria para avanzar " + pasos + " pasos");
            }
        }else{
            System.out.println("no hay bateria");
        }
    }
  
}
