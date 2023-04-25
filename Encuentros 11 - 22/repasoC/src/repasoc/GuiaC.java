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
                double resultado = (a*1.0)/b;
                System.out.println(a + " / " + b + " = " + resultado);
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
    
    public static void elDispositivo(){
              /*
        . Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de 
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: 
    tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último 
    tiene que ser una O. 
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial 
    “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que 
    no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe 
    indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá 
    investigar cómo se utilizan los siguientes métodos de la clase String: Substring(), Length(), 
    equals().
        */
        Scanner console = new Scanner(System.in);
        
        int ok = 0;
        int rejected = 0;
        String comandos;
        boolean on = true;
        
        System.out.println("Iniciando dispositivo RS232");
        System.out.println("Puede iniciar envios FDE");

        while(on){
            comandos = console.next();
            
            if(comandos.length() <= 5){
                if("X".equals(comandos.substring(0,1))&& "O".equals(comandos.substring((comandos.length() - 1 ),comandos.length()))){
                    ok++;
                    System.out.println("Lectura enviada");
                }else if("&&&&&".equals(comandos)){
                    on = false;
                }else{
                    rejected++;
                    System.out.println("Lectura enviada");
                }
            }else{
                rejected++;
                System.out.println("Lectura incorrecta");
            }
            
        }
        System.out.println("*--*--*--*--*--*--*");
        System.out.println("Lectura finalizada");
        System.out.println("Total de lecturas correctas: " + ok);
        System.out.println("Total de lecturas incorrectas: " + rejected);
        System.out.println("Fin del programa");
    }
    
    public static void dibujarCuadrado2(){
        Scanner console = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del cuadrado:");
        int dimension = console.nextInt();
        int i = 0;
        
        while( i < dimension){
            
            for(int j = 0; j < dimension ; j++){
              
                if (i == 0 || i == dimension - 1 || j == 0 || j == dimension - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            } System.out.println("");
            i++;
        }
       
    }
    
    public static void escala(){
        /* Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
        ingresado seguido de tantos asteriscos como indique su valor.*/
        Scanner console = new Scanner(System.in);
        int i = 0;
        int numero;
        //inicializamos array
        int aux [];
        aux = new int[4];
        
        while(i < 4){
            System.out.println("Ingrese numeros (entre el 1 y el 20)");
            numero = console.nextInt();
            
            if(numero > 20 || numero < 1 ){
                System.out.println("Error");
            }else{
                aux[i] = numero;
                i++; 
            }
        }
       
        System.out.println("*-----------*");
        
        for(int j = 0; j < aux.length; j++){
            System.out.print(aux[j]);
            for(int k = 0 ; k <= (aux[j] - 1); k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
       
    }

   
}
