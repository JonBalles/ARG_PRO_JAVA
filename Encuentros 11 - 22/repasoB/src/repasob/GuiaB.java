package repasob;

import java.util.Scanner;

public class GuiaB {
    /*
    Implementar un método que reciba por parámetro dos números enteros y determine cuál es 
    el mayor y lo muestre por pantalla.
    */
    public static void mayor(int a, int b){
        if(a> b){
            System.out.println(a + " es mayor que " + b);
        }else if(b>a){
             System.out.println(b + " es mayor que " + a);
        }else{
            System.out.println("Metiste cualquier cosa");
        }
    }
    
    
    public static void parImpar(int numero){
        if(numero % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
    
    public static void comparar(){
         /*
    Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un 
    mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals() 
    de String
    
    String str) 
    */
        Scanner console = new Scanner(System.in);
        
        System.out.println("Ingrese su palabra secreta");
        String frase = console.next();
        //El ejercicio pide equals(), pero probe con los dos y deje este
        if("eureka".equalsIgnoreCase(frase)){
            System.out.println("Correcto");
        }else{
            System.out.println("Error");
        }
    }
   
    public static void largo(){
          /*
     Realizar un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el 
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla 
    que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
    el método lenght() de String    
    */
         Scanner console = new Scanner(System.in);
         
         System.out.println("Ingrese hasta 8 caracteres");
         String frase = console.next();
         
         if(frase.length() == 8){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         }
         
    }
  

    public static void buscandoA(){
          /*
    Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una 
    ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga 
    “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO
    */
          Scanner console = new Scanner(System.in);
         
         System.out.println("Ingrese una frase");
         String frase = console.next();
         
         if(frase.charAt(0) == 'A' || frase.charAt(0) == 'a'){  
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         }
    }
    
    public static void tipoMotor(){
        Scanner console = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de bomba");
        int valor = console.nextInt();
        
        if(valor>= 1 && valor <= 4){
            switch (valor){
                case 1: 
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2: 
                    System.out.println("La bomba es una bomba de de gasolina");
                    break;
                case 3: 
                    System.out.println("La bomba es una bomba de de hormigón");
                    break;
                case 4: 
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
            }
                    
        }else{
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
  
}
