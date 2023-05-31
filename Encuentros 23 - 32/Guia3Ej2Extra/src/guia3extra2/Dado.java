/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia3extra2;


public class Dado {
private int numero;

public Dado(){
    
}

public void generarNumero(){
    int num;
    do{
        num = (int) (Math.random() *10);
    }while(num == 0 || num > 6);
    
    numero = num;
    
}

public int verNumero(){
    return numero;
}
}
