package guia4ej2;

public class Televisor extends Electrodomestico {
private double pulgadas; 
private boolean TDT;

    public Televisor() {
    }


public Televisor(double precio, String color, double peso, char consumoEnergetico, double pulgadas, boolean TDT){
    //precio, color, peso, consumoEnergetico
    super(precio, color, peso, consumoEnergetico);
    this.pulgadas = pulgadas;
    this.TDT = TDT;
    precioFinal();
}

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

@Override
    public void precioFinal(){
    super.precioFinal();
    
    if(TDT){
        precio += 500;  
    }
    if(pulgadas > 40){
        precio = precio * 1.3; 
    }
}

}
