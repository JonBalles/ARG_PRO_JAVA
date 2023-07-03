package guia5pt2ej5;

/*
Los datos que necesita de un Alumno son: legajo, apellido, nombre y año 
que cursa.
*/
public class Alumno {
private int legajo, año;
private String apellido, nombre;

    public Alumno( String nombre, String apellido, int año, int legajo) {
        this.legajo = legajo;
        this.año = año;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


@Override
public String toString(){
    return "Alumno: " + apellido + " " + nombre + "\n Nro de legajo: " + legajo + "\n *------------------------------*" ;
}
}
