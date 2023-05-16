/*
La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite 
inicializar su carga y los métodos get y set para dicho atributo.
 */

package guia3ej4;


public class Bateria {
    private double carga;
    
    public Bateria(double carga){
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

}
