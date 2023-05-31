package guia4ej2;


public class Lavadora extends Electrodomestico{
    private double carga;
    
    public Lavadora (double precio, String color, double peso, char consumoEnergetico, double carga){
        super(precio, color, peso, consumoEnergetico);
        this.carga = carga;
        precioFinal();
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
   @Override
    public void precioFinal(){
        super.precioFinal();
        if(carga > 30){
            precio =precio + 500;
        }
        
        
    }
}
