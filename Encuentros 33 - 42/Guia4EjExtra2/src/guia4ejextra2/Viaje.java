package guia4ejextra2;

/*
Un viaje tiene la siguiente información:
lugar de origen,
lugar de destino, 
distancia entre las ciudades (se conoce este dato si las ciudades no están sobre la misma ruta),
tipo de combustible del vehículo,
vehículo,
cantidad de peajes
y si las ciudades se encuentran sobre la misma ruta Km en el cual se encuentra cada ciudad.
Un ejemplo de viaje sobre una misma ruta es ir de San Luis a Rufino en la provincia de Santa Fe.

*/

public class Viaje {
    private String origen;
    private int kmOrigen;
    private String destino;
    private int kmDestino;
    private double distanciaEntreCiudades;
    private Combustible combustible;
    private Vehiculo vehiculo;
    private int cantidadPeajes;
    private boolean mismaRuta;

      public Viaje(String origen, int kmOrigen, String destino, int kmDestino, Combustible combustible, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.kmOrigen = kmOrigen;
        this.kmDestino = kmDestino;
        this.combustible = combustible;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
        this.mismaRuta = true;
    }
    public Viaje(String origen, String destino, double distanciaEntreCiudades, Combustible combustible, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaEntreCiudades = distanciaEntreCiudades;
        this.combustible = combustible;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
        this.mismaRuta = false;
    }
    
    
    public double calcularDistancia() {
        if (mismaRuta) {
            return (kmDestino - kmOrigen);
        } else {
            return distanciaEntreCiudades;
        }
    }
    
    /*
    El costo de los peajes también depende del tipo de vehículo (vamos a suponer que todos los peajes tienen el mismo costo),
    los autos y camionetas están en una categoría y los camiones en otra.
    */
    public double calcularCostoPeajes() {
        double costoPeajes;
        if (vehiculo instanceof Camion) {
            costoPeajes = cantidadPeajes * 20.0;  
        } else {
            costoPeajes = cantidadPeajes * 10.0;
        }
        return costoPeajes;
    }
    
    
    public double calcularCostoCombustible() {
        double distanciaViaje = calcularDistancia();
        return vehiculo.calcularCostoDeCombustible(distanciaViaje);
    }
    
    public double calcularCostoTotal() {
        double costoPeajes = calcularCostoPeajes();
        double costoCombustible = calcularCostoCombustible();
        return costoPeajes + costoCombustible;
    }
    
/*
    La clase viaje poseerá al menos 2 constructores, y los siguientes métodos:
• Cálculo de distancia
• Cálculo del costo en peajes,
• Calculo del costo en combustibles
• Cálculo del costo total.
*/
    
}
