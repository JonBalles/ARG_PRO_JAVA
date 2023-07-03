package guia4ejextra2;

public class Guia4EjExtra2 {
  public static void main(String[] args) {
        Combustible combustible = new Combustible("Gasolina", 2.5);
        
        Auto auto = new Auto("Ford", "ABC123", combustible);
        Camioneta camioneta = new Camioneta("Toyota", "DEF456", combustible);
        Camion camion = new Camion("Volvo", "GHI789", combustible);
        
        Viaje viaje1 = new Viaje("Ciudad A", "Ciudad B", 200.0, combustible, auto, 3);
        Viaje viaje2 = new Viaje("Ciudad C", 100, "Ciudad D", 300, combustible, camioneta, 2);
        
        double costoTotal1 = viaje1.calcularCostoTotal();
        double costoTotal2 = viaje2.calcularCostoTotal();
        
        System.out.println("Costo total del viaje 1: $" + costoTotal1);
        System.out.println("Costo total del viaje 2: $" + costoTotal2);
    
    }
}
/*
Se desean gestionar viajes terrestres en vehículos propios, con el objetivo de poder calcular el 
costo de los mismos.

Se posee además la siguiente información: el costo del viaje depende de la distancia, el consumo de 
combustible y la cantidad de peajes.



Si las ciudades están sobre la misma ruta se recibe el Km de la ciudad origen y el Km de la ciudad destino.
De lo contrario se recibe la distancia. 
*/
  

