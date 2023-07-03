package guia6ej3;

import java.util.Scanner;


public class Guia6Ej3 {
    /*
    Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer 
    dos números en forma de cadena. A continuación, utilice el método parseInt() de la clase 
    Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por 
    ultimo realizar una división con los dos números y mostrar el resultado. 
    */
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Division de dos numeros \n Ingrese el primer numero: ");
        String a = leer.next();
        System.out.println("Por cuanto queres dividir?");
        String b = leer.next();
        
        try{
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
            DivisionNumero.dividir(c, d);
        } catch (NumberFormatException e){
            System.out.println("NO SE PERMITEN CARACTERES. SOLO NUMEROS!");
            System.out.println("El error es de tipo: " + e);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
            System.out.println("El error es de tipo: " + e);
        }catch(Exception e){
            System.out.println("El error es de tipo: " + e);
        }
      
    }

}
