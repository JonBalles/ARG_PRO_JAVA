/*
. Disponemos de 3 objetos conocidos: un Hombre, un Robot y una Bateria; sabemos que el Robot 
reconoce las órdenes:
• Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos)
• Dormir()
• Despertar()
• Recargar()
• bateriaLLena():boolean
• bateriaVacia() :boolean
• energiaActual() :int
También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada vez 
que avanza o retrocede por cada 100 pasos pierde 10 unidades además si damos la orden al robot 
de dormir, no responderá al avanzar o retroceder hasta despertarlo.
Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.
 */
    //Bonus! Hace que sume la cantidad de metros que camine o retroceda
package guia3ej4;


public class Robot {
    private Bateria bat = new Bateria(1000);
    private boolean encendido = false;
    
    public boolean getEncendido(){
        return encendido;
    }
    
    public void avanzar(int pasos){
        double consumo = pasos * 0.1;
        if(encendido && !BateriaVacia() && (BateriaActual() - consumo) >= 0){
           bat.setCarga( BateriaActual() - consumo);
            System.out.println("Avanzo: " + pasos);
            System.out.println("Bateria restante: " + BateriaActual());
        } else {
            if(!encendido){
                System.out.println("Robot apagado");
            }else{
                System.out.println("Sin carga para la operacion");
            }
            
        }
        
    }
    
    public void retroceder(int pasos){
         double consumo = pasos * 0.1;
        if(encendido && !BateriaVacia() && (BateriaActual() - consumo) >= 0){
           bat.setCarga( BateriaActual() - consumo);
            System.out.println("Retrocedio: " + pasos);
            System.out.println("Bateria restante: " + BateriaActual());
        } else {
            if(!encendido){
                System.out.println("Robot apagado");
            }else{
                System.out.println("Bateria insuficiente");
            }
            
        }
    }
    
    public void dormir(){
        encendido = false;
    }
    
    public void despertar(){
        encendido = true;
    }
    
    public void recargar(){
        if(bat.getCarga()< 1000){
            bat.setCarga(1000);
        } else{
            System.out.println("Bateria llena");
        }
        
    }
    
    public boolean BateriaLlena(){
        return bat.getCarga() == 1000;
    }
    
    public boolean BateriaVacia(){
        return bat.getCarga() == 0;
    }
    
    public double BateriaActual(){
        return bat.getCarga();
    }
}
