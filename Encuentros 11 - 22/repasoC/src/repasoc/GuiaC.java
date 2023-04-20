package repasoc;

import java.util.Scanner;

public class GuiaC {
    
    public static void entreDiez (){
        /*
        Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, sino está 
        entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta
        */
        Scanner console = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int nota = console.nextInt();
        
        do {
             System.out.println("Intente otra vez!");
                nota = console.nextInt();
        } while (nota < 0 || nota > 10);
        
        System.out.println("La nota es " + nota);
       
    }
    
    public static void superar(){
    /*
    Escriba un método en el cual se ingrese un valor límite positivo, y a continuación solicite 
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    Scanner console = new Scanner(System.in);
    
        int aux = 0;
        System.out.println("Ingrese un valor inicial");
        int valor = console.nextInt();
        
        while(valor >= aux){
            System.out.println("ingrese numeros hasta superar el valor inicial");
            
            aux = aux + console.nextInt();
            
        }
        System.out.println("el valor inicial era " +valor + " y lo superaste con " + aux);
    
    }
 
    public static void calculadora(){
         Scanner console = new Scanner(System.in);

         boolean on = true;
         int a;
         int b;
         
        while(on){
         System.out.println("MENU");
         System.out.println("1 - Sumar");
         System.out.println("2 - Restar");
         System.out.println("3 - Multiplicar");
         System.out.println("4 - Dividir");
         System.out.println("5 - Salir");
         System.out.println("Elija una opcion...");
       
          switch (console.nextInt()){
            case 1:
                System.out.println("Numero a sumar");
                a = console.nextInt();
                System.out.println("Segundo numero a sumar");
                b = console.nextInt();
                System.out.println(a + " + " + b + " = " + (a+b));
                System.out.println("*--------------*");
                break;
            case 2:
                System.out.println("Numero a restar");
                a = console.nextInt();
                System.out.println("Restar");
                b = console.nextInt();
                System.out.println(a + " - " + b + " = " + (a-b));
                System.out.println("*--------------*");
                break;
            case 3:
                 System.out.println("Numero a multiplicar");
                a = console.nextInt();
                System.out.println("Multiplicador");
                b = console.nextInt();
                System.out.println(a + " * " + b + " = " + (a*b));
                System.out.println("*--------------*");
                break;
            case 4:
                System.out.println("Numero a dividir");
                a = console.nextInt();
                System.out.println("Ingrese divisor");
                b = console.nextInt();
                System.out.println(a + " / " + b + " = " + (a/b));
                System.out.println("*--------------*");
                break;
            case 5:
                System.out.println("Desea salir? S/N");
                String salir = console.next();
                
                if("N".equalsIgnoreCase(salir)){
                    System.out.println("*--------------*");
                }else if ("S".equalsIgnoreCase(salir)){
                    System.out.println("Adios!");
                    on = false;
                    break;
                }else{
                    System.out.println("Opcion incorrecta");
                    System.out.println("*--------------*");
                } 
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.out.println("*--------------*");       
        } 
       
        }
    }
    
    public static void bucancoCero(){
       /*Escriba un método que lea 20 números. Si el número leído es igual a cero se debe salir del 
    bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el 
    resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: 
    recordar el uso de la sentencia break.
    */
       Scanner console = new Scanner(System.in);
       int numero;
       int count = 1;
       int aux = 0;
        do{
            System.out.println("ingrese un número");
            numero = console.nextInt();
            if(numero > 0){
                aux = aux + numero;
                count++;
            }else{
                count++;
            }
        }while(numero != 0 && count <= 20);
        if(numero == 0){
            System.out.println("Se capturó el número cero");
            System.out.println("El total de los números ingresados es " + aux);
        }else{
            System.out.println("Contador al limite: " + count);
            System.out.println("El total de los números ingresados es " + aux);
        }
        
    }
}
