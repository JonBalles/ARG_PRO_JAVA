package guia4ejextra1;

public class Barco {

    protected String matricula;

    protected double eslora;

    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
       this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    } 
  
     public double calcularModulo() {
        return this.eslora * 10;
    }
}
