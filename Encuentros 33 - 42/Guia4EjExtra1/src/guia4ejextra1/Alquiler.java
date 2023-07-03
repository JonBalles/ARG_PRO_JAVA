package guia4ejextra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;
    private int documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;
    
    public Alquiler(String nombre, int documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion ,String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double costoAlquiler() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
}
