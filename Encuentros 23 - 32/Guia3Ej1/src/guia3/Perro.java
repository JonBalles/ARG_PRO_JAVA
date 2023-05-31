package guia3;

public class Perro {

    private String nombre;

    private String raza;

    private int edad;

    private double size;
    

    public Perro(String nombre, String raza, int edad, double size) {
        this.nombre= nombre;
        this.raza = raza;
        this.edad = edad;
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    
}
