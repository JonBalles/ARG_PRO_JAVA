package guia3ej1extra;


public class GPS {
private String marca, modelo;
private Posicion ultimaUbicacion;

public GPS(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    
}
/*
- mover() Este método generará una nueva Posición con valores aleatorios para la latitud 
y longitud de la misma entre 0 y 1. Esta nueva Posicion quedará registrada en la variable 
atributo “ultimaUbicacion”
- obtenerUltimaPosicion() Este método retornará el estado actual de la variable atributo 
“ultimaUbicacion” 
*/
public Posicion obtenerUltimaPosicion(){
    return ultimaUbicacion;
}

public void mover(){
    double latitud = Math.random();
    double longitud = Math.random();
    
    ultimaUbicacion.setLatitud(latitud);
    ultimaUbicacion.setLongitud(longitud);
 
}

}
