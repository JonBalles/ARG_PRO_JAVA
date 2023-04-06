
package ejercicio5;

public class Pieza {
    
    private String movimiento;
    private int cantidadCasillas;
    private String disenio;
    private boolean movimientoEspecial;
    private String metodoCaptura;
    
   
    public Pieza(String disenio, String movimiento, String metodoCaptura, int cantidadCasillas, boolean movimientoEspecial){
        this.movimiento = movimiento;
        this.cantidadCasillas = cantidadCasillas;
        this.disenio = disenio;
        this.movimientoEspecial = movimientoEspecial;
        this.metodoCaptura = metodoCaptura;
         
    }
    
    
    public String getMovimiento(){
      return movimiento;  
    }
    
    public void setMovimiento(String movimiento){
        this.movimiento = movimiento;
    }
    
    public int cantidadCasillas(){
        return cantidadCasillas;
    }
    
    public void setCantidadCasillas(int cantidadCasillas){
        this.cantidadCasillas = cantidadCasillas;
    }

    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    public boolean isMovimientoEspecial() {
        return movimientoEspecial;
    }

    public void setMovimientoEspecial(boolean movimientoEspecial) {
        this.movimientoEspecial = movimientoEspecial;
    }
    
      public String getMetodoCaptura() {
        return metodoCaptura;
    }

    public void setMetodoCaptura(String metodoCaptura) {
        this.metodoCaptura = metodoCaptura;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Tipo de pieza: " + disenio);
        System.out.println("Tipo de movimiento: " + movimiento);
        System.out.println("Tipo de captura: " + metodoCaptura);
        System.out.println("Cuantas casillas puede desplazarse: " + cantidadCasillas);
        
        if(movimientoEspecial){
            System.out.println("Tiene movimientos especiales? SI");
            if(disenio=="Torre"){
                System.out.println("Movimiento especial: Enroque");
            } 
            if(disenio=="Peon"){
                System.out.println("Movimiento especial: Cambio de pieza");
            }
             if(disenio=="Rey"){
                System.out.println("Movimiento especial: Enroque");
            }
        }else{
            System.out.println("Tiene movimientos especiales? NO");
        }
        System.out.println("");
        System.out.println("*-------------------------------*");
        System.out.println("");
        
        
    }
    
}
