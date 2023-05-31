/*
Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos: 
dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos: 
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en 
la clase Kiosco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el 
Empleado con mayor antigüedad. 
Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego 
incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado 
de mayor antigüedad.
 */

package ejercicio2x2;

import java.time.LocalDate;


public class Ejercicio2x2 {

   
    public static void main(String[] args) {
       
        
        Kiosco elkiosco = new Kiosco("Lo de Jon", "calle falsa 123", 98745632);
        //nombre, apellido, dni
        Empleado turro1 = new Empleado("el", "Kevin", 69696969, LocalDate.of(2020,5,11));
        Empleado turro2 = new Empleado("Le", "Brown", 69696969, LocalDate.of(2019,04,12));
        Empleado turro3 = new Empleado("el", "Joni", 69696969, LocalDate.of(2019,5,12));
        Empleado turro4 = new Empleado("La", "Jenni", 69696969, LocalDate.of(2020,5,12));
        
        
        
        elkiosco.contratar(turro4);
        elkiosco.contratar(turro1);
        elkiosco.contratar(turro2);
        elkiosco.contratar(turro3);
        
        System.out.println(elkiosco.antiguedad());
      
        
        
        
        
    }

}
