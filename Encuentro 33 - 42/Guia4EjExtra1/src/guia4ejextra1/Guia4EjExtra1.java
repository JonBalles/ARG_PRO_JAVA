package guia4ejextra1;

import java.time.LocalDate;


public class Guia4EjExtra1 {

   
    public static void main(String[] args) {
        // Crear barcos
        //BARCO: matricula, eslora, anio,
        Barco barco1 = new Barco("ABC123", 10, 2000);
        //VELERO: matricula, eslora, anio, mastiles
        Velero velero1 = new Velero("DEF456", 15.2, 2010, 3);
        //BARCOVAPOR: matricula, eslora, anio, potencia
        BarcoVapor barcoMotor1 = new BarcoVapor("GHI789", 12.8, 2015, 250);
        //YATELUJOSO: matricula, eslora, anio, potencia, camarotes
        YateLujoso yate1 = new YateLujoso("JKL012", 18.0, 2018, 350, 5);

        // Crear alquileres
         //nombre, dni, alquiler, devolucion, posicion, Barco
        Alquiler a1 = new Alquiler("Cliente1", 1230, LocalDate.of(2023, 5, 1), LocalDate.of(2023, 5, 5), "1", barco1);
        Alquiler a2 = new Alquiler("Cliente2", 000456, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 8), "2", velero1);
        Alquiler a3 = new Alquiler("Cliente3", 130, LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 3), "3", barcoMotor1);
        Alquiler a4 = new Alquiler("Cliente4", 24681, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 15), "4", yate1);

        // Mostrar precios de alquiler
        System.out.println("Precio alquiler 1: $" + a1.costoAlquiler());
        System.out.println("Precio alquiler 2: $" + a2.costoAlquiler());
        System.out.println("Precio alquiler 3: $" + a3.costoAlquiler());
        System.out.println("Precio alquiler 4: $" + a4.costoAlquiler());
        
    }

}
