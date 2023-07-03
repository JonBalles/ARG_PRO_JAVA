package guia4ejextra2;
/*
Existen diferentes tipos de vehículos: 
Autos, 
Camiones y 
Camionetas; 

todos tienen la siguiente 
información: 
marca, patente y combustible; además del comportamiento 
*/

public abstract class Vehiculo {

    protected String marca, patente;
    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
    /*
    calcularCostoDeCombustible() que cada tipo de vehículo lo implementará de la siguiente forma: 
    el consumo de combustible es de 7 Lts cada 100 Km para los autos, 10 Lts cada 100 Km para las 
    camionetas y 12 Lts cada 100 Km para los camiones.
    */
    
    public abstract double calcularCostoDeCombustible(double distancia);
}
