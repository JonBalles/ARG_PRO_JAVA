package guia3ej1extra;

public class Posicion {
private double latitud;
private double longitud;

public Posicion(double latitud, double longitud){
    this.latitud = latitud;
    this.longitud = longitud;
}

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
   @Override
    public String toString() {
        return "Ubicacion {" + "Latitud: " + latitud + ", Longitud: " + longitud;
    }
}
