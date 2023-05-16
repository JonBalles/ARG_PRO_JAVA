/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio2x2;

import java.time.LocalDate;


public class Empleado {
private String nombre, apellido;
private int dni;
private LocalDate ingreso;

public Empleado(String nombre, String apellido, int dni, LocalDate ingreso){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.ingreso = ingreso;
      
}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }
     @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellido;
    }

}
