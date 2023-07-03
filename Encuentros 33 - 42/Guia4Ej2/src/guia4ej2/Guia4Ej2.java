package guia4ej2;


public class Guia4Ej2 {

   
    public static void main(String[] args) {
        //precio, color, peso, consumoEnergetico, carga
        Electrodomestico prueba = new Lavadora(1000, "Violeta", 20, 'A', 31);
        Electrodomestico Tv = new Televisor(1000, "marron", 10, 'C', 49, true);
        
        System.out.println(prueba.getPrecio());
        //prueba.precioFinal();
        
        System.out.println(Tv.getPrecio());
        
    }

}
