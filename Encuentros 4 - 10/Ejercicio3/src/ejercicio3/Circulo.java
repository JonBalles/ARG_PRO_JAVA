/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


public class Circulo {
    private double pi = 3.14;
    private double radio;
    
    
    public Circulo(double radio){
        this.radio= radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return pi * (radio * radio);
    }
    
    public double calcularPerimetro(){
        return pi * pi *radio;
    }
}
