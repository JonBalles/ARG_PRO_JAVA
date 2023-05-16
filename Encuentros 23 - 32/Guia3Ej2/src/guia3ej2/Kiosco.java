package guia3ej2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Kiosco {

   private String nombre;
   private String direccion;
   private int cuit;
   private Empleado Empleado1;
   private Empleado Empleado2;
   private Empleado Empleado3;
   
   public Kiosco(String nombre,String direccion, int cuit){
       this.nombre= nombre;
       this.direccion=direccion;
       this.cuit= cuit;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Object getEmpleado1() {
        return Empleado1;
    }

    public void setEmpleado1(Empleado Empleado1) {
        this.Empleado1 = Empleado1;
    }

    public Object getEmpleado2() {
        return Empleado2;
    }

    public void setEmpleado2(Empleado Empleado2) {
        this.Empleado2 = Empleado2;
    }

    public Object getEmpleado3() {
        return Empleado3;
    }

    public void setEmpleado3(Empleado Empleado3) {
        this.Empleado3 = Empleado3;
    }
   
   public void contratar(Empleado nuevoEmpleado){
       if(getEmpleado1() == null){
           setEmpleado1(nuevoEmpleado);
       }else if(getEmpleado2()== null){
           setEmpleado2(nuevoEmpleado);
       }else if(getEmpleado3() == null){
           setEmpleado3(nuevoEmpleado);
       }else{
           System.out.println("No hay mas puestos de trabajo");
       }
   }
 
   public void Antiguedad(){
       long em1 = ChronoUnit.DAYS.between(Empleado1.getFechaDeIngreso(), LocalDate.now());
       long em2 = ChronoUnit.DAYS.between(Empleado2.getFechaDeIngreso(), LocalDate.now());
       long em3 = ChronoUnit.DAYS.between(Empleado3.getFechaDeIngreso(), LocalDate.now());
       
       
       if(em1 > em2 && em1 > em3){
           System.out.println(Empleado1);
       }else if(em2 > em1 && em2 > em3){
           System.out.println(Empleado2);
       }else if(em3 > em2 && em3 > em1){
           System.out.println(Empleado3);
       }else{
           System.out.println("Dos o mas empleado de igual antiguedad...");
           if(em1 == em2 && em1 == em3){
               System.out.println("Los 3 empleados ingresaron el mismo dia");
           } else if(em1 == em3){
               System.out.println("Los siguientes empleados ingresaron el mismo dia");
               System.out.println(Empleado1);
               System.out.println("*------------*");
               System.out.println(Empleado3);
           }else if(em2 == em3){
               System.out.println("Los siguientes empleados ingresaron el mismo dia");
               System.out.println(Empleado2);
               System.out.println("*------------*");
               System.out.println(Empleado3);
           }else{
               System.out.println("Los siguientes empleados ingresaron el mismo dia");
               System.out.println(Empleado1);
               System.out.println("*------------*");
               System.out.println(Empleado2);
           }
       }
   }
   
}


/*
if ((empleado1.getFechaIngreso().compareTo(empleado2.getFechaIngreso()) < 0) && (empleado1.getFechaIngreso().compareTo(empleado3.getFechaIngreso()) < 0)) {

            System.out.println("El empleado de mayor antiguedad es " + empleado1.getNombre());
        } else if ((empleado2.getFechaIngreso().compareTo(empleado1.getFechaIngreso()) < 0) && (empleado2.getFechaIngreso().compareTo(empleado3.getFechaIngreso()) < 0)) {
            System.out.println("El empleado de mayor antiguedad es " + empleado2.getNombre());
        } else if ((empleado3.getFechaIngreso().compareTo(empleado1.getFechaIngreso()) < 0) && (empleado3.getFechaIngreso().compareTo(empleado2.getFechaIngreso()) < 0)) {
            System.out.println("El empleado de mayor antiguedad es " + empleado3.getNombre());
        } else if ((empleado1.getFechaIngreso().compareTo(empleado2.getFechaIngreso()) == 0) && (empleado1.getFechaIngreso().compareTo(empleado3.getFechaIngreso()) == 0)) {
            System.out.println("Todos los empleado tiene la misma antiguedad");
        } else if (empleado2.getFechaIngreso().compareTo(empleado3.getFechaIngreso()) == 0) {
            System.out.println("El empleado " + empleado2.getNombre() + " " + empleado2.getApellido() + " y el empleado " + empleado3.getNombre() + " " + empleado3.getApellido() + " comparten la misma antiguedad");
        } else if (empleado1.getFechaIngreso().compareTo(this.empleado3.getFechaIngreso()) == 0) {
            System.out.println("El empleado " + empleado3.getNombre() + " " + empleado3.getApellido() + " y el empleado " + empleado1.getNombre() + " " + empleado1.getApellido() + " comparten la misma antiguedad");
        } else {
            System.out.println("El empleado " + empleado1.getNombre() + " " + empleado1.getApellido() + " y el empleado " + empleado2.getNombre() + " " + empleado2.getApellido() + " comparten la misma antiguedad");
*/
