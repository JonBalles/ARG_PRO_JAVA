/*
Ejercicio 2:
En el siguiente modelo, tenemos una clase Jugador con los atributos: nombre y clasificación; un 
constructor que inicializa su atributo nombre y los métodos:
tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es invocar el método 
generarNro del dado y acumulará el valor del Dado en su atributo clasificación.
verClasificación(): Retornará la clasificación del jugador.
Por otro lado, tenemos la clase Dado que posee como atributo: número que es un valor entero y 
los métodos:
generarNro(): Que genera un número al azar entre 1 y 6 que se lo asigna a su variable atributo 
numero, si el atributo tiene un valor mayor a 0, significa que ese dado ya generó un valor y lo 
mantendrá.
verNro(): Retornará el valor guardado en la variable numero.

 */

package guia3extra2;


public class Guia3Extra2 {

   
    public static void main(String[] args) {
        Dado uno = new Dado();
        
        uno.generarNumero();
        System.out.println(uno.verNumero());
        
    }

}
