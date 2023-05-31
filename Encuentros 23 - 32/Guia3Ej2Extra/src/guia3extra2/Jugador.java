/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia3extra2;


public class Jugador {
private String nombre;
private int clasificacion;

public Jugador(String nombre){
    this.nombre = nombre;
}

public void tirarDado(Dado dado){
   
    dado.generarNumero();
    clasificacion += dado.verNumero();
}
public int verClasificacion(){
    return clasificacion;
}
}
