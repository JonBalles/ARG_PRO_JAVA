package guia3ej2;

import java.time.LocalDate;


public class Empleado {
    private final String NOMBRE;
    private final String APELLIDO;
    private final int DNI;
    private LocalDate fechaDeIngreso;
    
    public Empleado(String NOMBRE ,String APELLIDO ,int DNI, String fechaDeIngreso){
        this.NOMBRE=NOMBRE;
        this.APELLIDO=APELLIDO;
        this.DNI=DNI;
        this.fechaDeIngreso = LocalDate.parse(fechaDeIngreso);
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public int getDNI() {
        return DNI;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + NOMBRE + ", Apellido: " + APELLIDO + ", DNI: " + DNI + ", Fecha de ingreso: " + fechaDeIngreso;
    }
}
