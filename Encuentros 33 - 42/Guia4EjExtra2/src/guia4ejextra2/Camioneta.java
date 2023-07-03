package guia4ejextra2;


public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
    
    @Override
      public double calcularCostoDeCombustible(double distancia) {
        double consumo = (distancia / 100) * 10;
        return consumo * combustible.getPrecio();
    }

}
