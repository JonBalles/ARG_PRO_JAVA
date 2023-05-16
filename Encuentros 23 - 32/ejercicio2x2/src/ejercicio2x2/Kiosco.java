package ejercicio2x2;

import java.time.LocalDate;
public class Kiosco {
    private String direccion, nombre;
    private int cuit;
    private Empleado [] empleados;

    public Kiosco (String nombre, String direccion, int cuit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
        this.empleados = new Empleado[3];
    }
    
    
    public void contratar(Empleado nuevoEmpleado){
          
        for(int i = 0 ; i< (empleados.length) ; i++){
            if(empleados[i] == null){
                empleados[i] = nuevoEmpleado;
                System.out.println("Contrataste a "+ (empleados[i].getNombre()) + " " + (empleados[i].getApellido()) );
                System.out.println("Fecha de ingreso: " + (empleados[i].getIngreso()));
                return;
            }
        }
        System.out.println("No podes contratar mas");
    }
    
    public Empleado antiguedad(){
       Empleado empleadoMasJovie = null;
       LocalDate fechaMasAntigua = null;
       
       for(int i = 0 ; i< empleados.length ; i++){
           if(empleadoMasJovie == null || empleados[i].getIngreso().isBefore(fechaMasAntigua)){
               empleadoMasJovie = empleados[i];
               fechaMasAntigua = empleados[i].getIngreso();
           }
       }
       
       return empleadoMasJovie;
    }
}
