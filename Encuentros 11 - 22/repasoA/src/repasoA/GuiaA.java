package repasoA;

import java.util.Scanner;

public class GuiaA {
    public static void suma(){
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = console.nextInt();
        System.out.println("Ingrese otro numero");
        int b = console.nextInt();
        System.out.println("Total: "+  (a + b)); 
    }
    
    public static void nombrando(){
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor:");
        String nombre = console.next();
        System.out.println("Su nombre es: " + nombre);
    }
    
    public static void frase(){
        Scanner console = new Scanner(System.in);
        System.out.println("A continuacion, ingrese una frase:");
        String frase = console.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println("*--------------*");
        System.out.println(frase.toUpperCase());
    }
    
    public static void temperature(){
        Scanner console = new Scanner(System.in);
        System.out.println("Che cuantos grados hace?");
        double centigrados = console.nextDouble();
        double fahrenheit = 32 +(9 * centigrados / 5);
        System.out.println("En grados Fahrenheit da: " + fahrenheit);
    }
    
    public static void variantes(){
        Scanner console = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero:");
        int numero = console.nextInt();
        System.out.println("El doble es "+ (numero*2));
        System.out.println("El triple es "+ (numero*3));
        System.out.println("Su raiz cuadrada es "+ (Math.sqrt(numero)));
        
    }
    
    
    
}
