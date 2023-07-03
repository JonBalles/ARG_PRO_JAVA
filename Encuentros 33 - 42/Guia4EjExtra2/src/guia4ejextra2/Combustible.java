package guia4ejextra2;

//Del combustible necesitamos conocer: el tipo de combustible y precio.

public class Combustible {
    private String tipoDeCombustible;
    private double precio;

    public Combustible(String tipoDeCombustible, double precio) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.precio = precio;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
