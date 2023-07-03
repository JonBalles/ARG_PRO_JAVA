package guia6ej4;

import java.util.Scanner;


public class Guia6Ej4 {
    /*
    Demuestre como provocar intencionalmente una excepción del tipo 
    NumberFormatException, luego agregue las sentencias try/catch para mostrar los
    mensajes de error   
    */
   
    public static void main(String[] args) {
        String prueba;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra o caracter para generar el error");
        prueba = leer.next();
        try{
            int d = Integer.parseInt(prueba);
            System.out.println(d);
        }catch(NumberFormatException e){
            System.out.println("Caracter no permitido: " + prueba);
            System.out.println(e);
        }
        
    }

}
