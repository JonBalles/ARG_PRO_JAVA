package ejercicio2;

public class Computadora {
    
    //Procesador, RAM, Disco, PlacaMadre, so
    
    private String procesador;
    private int ram;
    private int disco;
    private String placaMadre;
    private String so;
    
    public Computadora(String procesador, int ram, int disco, String placaMadre, String so){
        this.procesador = procesador;
        this.ram = ram;
        this.disco=disco;
        this.placaMadre = placaMadre;
        this.so = so;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public String getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(String placaMadre) {
        this.placaMadre = placaMadre;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
}
