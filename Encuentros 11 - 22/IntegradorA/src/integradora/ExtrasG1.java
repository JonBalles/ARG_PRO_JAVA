package integradora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExtrasG1 {

    // Declaramos un Scanner de scope global para agilizar su llamado
    static Scanner console = new Scanner(System.in);
    // Ejercicio1
    public static void minutosPor() {
        /*
    Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en 
    días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
    equivalente: 1 día, 2 horas.
         */
        int minutos;
        System.out.println("Ingresame los minutos para calcular");

        minutos = console.nextInt();
        int horas = (minutos / 60);
        int dias = (horas / 24);

        System.out.println("Minutos a horas: " + (horas % 24));
        System.out.println("Minutos a dias: " + dias);

    }
    // Ejercicio2
    public static void mixer() {
        /*
    . Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle 
un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B 
tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar 
los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
         */

        int A, B, C, D, aux;
        A = (int) (Math.random() * 10);
        B = (int) (Math.random() * 10);
        C = (int) (Math.random() * 10);
        D = (int) (Math.random() * 10);
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);

        System.out.println("*-----------------*");
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valor final de A: " + A);
        System.out.println("Valor final de B: " + B);
        System.out.println("Valor final de C: " + C);
        System.out.println("Valor final de D: " + D);

    }
    // Ejercicio3
    //El siguiente ejercicio se planteo de diferentes maneras y decidimos crear ambos
    public static void vocalCheck() {
        /*
    . Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso 
    contrario mostrar un mensaje.
         */
        String letra;

        System.out.println("Ingrese una letra");
        letra = console.next();

        while (letra.length() >= 1)
        {

            if ("a".equalsIgnoreCase(letra)
                    || "e".equalsIgnoreCase(letra)
                    || "i".equalsIgnoreCase(letra)
                    || "o".equalsIgnoreCase(letra)
                    || "u".equalsIgnoreCase(letra))
            {
                System.out.println("Es vocal");
            } else if (letra.length() > 1)
            {
                System.out.println("Debes ingresar de una letra");
                // Vuelvo a llamar al metodo para volver a intentarlo
                vocalCheck();
            } else
            {
                System.out.println("No es vocal");
            }
            break;
        }

    }
    // Ejercicio3.2
    public static void vocalCheck2() {
        boolean check = false;
        String vocales[];
        vocales = new String[5];

        vocales[0] = "a";
        vocales[1] = "e";
        vocales[2] = "i";
        vocales[3] = "o";
        vocales[4] = "u";

        System.out.println("ingrese una letra");
        String letra = console.next();

        for (int i = 0; i < vocales.length; i++)
        {
            if (letra.equalsIgnoreCase(vocales[i]))
            {
                check = true;
            }
        }
        if (!check)
        {
            System.out.println("no es vocal");
        } else
        {
            System.out.println("Es vocal");
        }

    }
    // Ejercicio4
    public static void numerosRomanos() {
        String romanos[] =
        {
            "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        };
        int num;
        do{
        System.out.println("Ingrese un numero del 1 - 10");
        num = console.nextInt();
         if(num > 10|| num < 0){
             System.out.println("Valor fuera de rango");
            break;
        }
        System.out.println("El numero en romano es: " + romanos[num]);
       
        }while(num < 10 || num > 0);
    }
    // Ejercicio4.2 by Juana Leranoz
    public static void numerosRomanos2() {
        System.out.println("Ingrese un numero entre el 1 y el 10");
        int num;
        num = console.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("El numero ingresado no es valido. Vuelva a intentarlo.");
            num = console.nextInt();
        }
        switch (num) {
            case 1: {
                System.out.println("I");
                break;
            }
            case 2: {
                System.out.println("II");
                break;
            }
            case 3: {
                System.out.println("III");
                break;
            }
            case 4: {
                System.out.println("IV");
                break;
            }
            case 5: {
                System.out.println("V");
                break;
            }
            case 6: {
                System.out.println("VI");
                break;
            }
            case 7: {
                System.out.println("VII");
                break;
            }
            case 8: {
                System.out.println("VIII");
                break;
            }
            case 9: {
                System.out.println("IX");
                break;
            }
            case 10: {
                System.out.println("X");
                break;
            }
        }
    }
   // Ejercicio5
    public static void obraSocial() {
        /*  Una obra social tiene tres clases de socios: 
     Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos 
    los tipos de tratamientos. 
     Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los 
    mismos tratamientos que los socios del tipo A. 
     Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
    tratamientos. 
    Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente 
    el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho 
    socio. Crear un método con el algoritmo para dar solución a lo propuesto.*/
        boolean on = true;
        do
        {
            System.out.println("Ingrese el tipo de socio:");
            String opcion = console.next();

            if ("a".equalsIgnoreCase(opcion))
            {
                System.out.println("Valor del tratamiento: ");
                int valor = console.nextInt();
                System.out.println("Descuento del 50%. Valor final: " + (valor * 0.5));
                on = false;

            } else if ("b".equalsIgnoreCase(opcion))
            {
                System.out.println("Valor del tratamiento: ");
                int valor = console.nextInt();
                System.out.println("Descuento del 35%. Valor final: " + (valor * 0.65));
                on = false;

            } else if ("c".equalsIgnoreCase(opcion))
            {
                System.out.println("Valor del tratamiento: ");
                int valor = console.nextInt();
                System.out.println("No incluye descuento. Valor final: " + valor);
                on = false;
            } else
            {
                System.out.println("Incorrecto");
            }
        } while (on);

    }
    // Ejercicio6
    public static void altura() {

        /*Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y 
    determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de 
    estaturas en general.*/
        
        // Para usar DecimalFormat, hay que hacer el siguiente import: import java.text.DecimalFormat
        //DecimalFormat limita a los decimales segun la cantidad de 00 que se les pase por parametro
        DecimalFormat df = new DecimalFormat("#.00");
        int i = 0;
        int chiquis = 0;
        double bajitos = 0;
        double todos = 0;

        System.out.println("Cuantas personas entran en el recinto");
        int cantidad = console.nextInt();

        while (i < cantidad)
        {
            System.out.println("Ingrese altura persona " + (i + 1));
            double altura = console.nextDouble();
            todos = todos + altura;
            if (altura <= 1.6)
            {
                bajitos = bajitos + altura;
                chiquis++;
            }
            i++;
        }

        System.out.println("Promedio gente bajita " + df.format(bajitos / chiquis));
        System.out.println("Promedio general " + df.format(todos / cantidad));

    }
    // Ejercicio7
    // menorMayor pide dos metodos. Uno con While y el otro do/While
    public static void menorMayor(){
            /*. Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de 
            n números (n>0). El valor de n se solicitará al principio del programa y los números serán 
            introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra 
            con el bucle “do - while”*/
            int i = 0;
            int menor = 99999;
            int mayor = 0;
            int total = 0;
            
            System.out.println("Ingrese la cantidad de valores a evaluar");
            int cantidad = console.nextInt();

            while(i< cantidad){
                System.out.println("Ingrese valor " + (i + 1));
                int valor = console.nextInt();
                menor = Math.min(menor, valor);
                mayor = Math.max(mayor, valor);
                total = total + valor;
                i++; 
            } 
           System.out.println("El mayor es " + mayor);
           System.out.println("El minimo es: " + menor);
           System.out.println("El promedio es " + (total / cantidad));
           
        }
    // Ejercicio7 (do/while) by Juana Leranoz
    public static void menorMayorDo() {
        int n, i = 0, j = 0;
        double max, min, suma = 0, promedio;
        System.out.println("Ingrese la cantidad de n valores que desea evaluar: ");
        n = console.nextInt();
        double[] num = new double[n];
        System.out.println("Ahora ingrese los numeros que seran evaluados:");
        do {
            num[i] = console.nextDouble();
            i++;
        } while (i < n);
        max = num[0];
        min = num[0];
        do {
            if (num[j] > max) {
                max = num[j];
            }
            if (num[j] < min) {
                min = num[j];
            }
            suma += num[j];
            j++;
        } while (j < n);
        promedio = suma / n;
        System.out.println("El valor maximos es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio de los numeros ingresados es: " + promedio);

    }
 
    // Ejercicio8
    public static void multiplo5(){
         /* . Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la 
        lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de 
        números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
        Nota: recordar el uso de la sentencia break*/
       int valor, cantidad = 0, pares = 0, impares = 0;
       
       
        do{
            System.out.println("Ingrese numeros enteros");
            valor = console.nextInt();
            if(valor>0){
                cantidad++;
                if(valor% 2 ==0){
                pares++;
                }else{
                impares++;
                }
            }
        }while(valor % 5 != 0);
        
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        
    }
    // Ejercicio9
    public static void simulandoDivisiones(){
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
        realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
        Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
        este resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13: 
        50 – 13 = 37 una resta realizada 
        37 – 13 = 24 dos restas realizadas 
        24 – 13 = 11 tres restas realizadas 
        Crear un método con el algoritmo necesario para dar solución a lo propuesto. */
        
        int valor, divisor, residuo, cociente =0;
       
        System.out.println("Ingrese el numero a dividir");
        valor = console.nextInt();
        
        System.out.println("Ingrese el divisor");
        divisor = console.nextInt();
       
        residuo = valor;
        while(divisor <= residuo){
          residuo =  residuo - divisor;
          cociente++;
        }
        System.out.println("el resultado de la division de " + valor + " / " + divisor + " es: " + cociente);
        System.out.println("residuo " + residuo);
    }
    // Ejercicio10
    public static void adivinando(){
        /*. Realice un método para que el usuario adivine el resultado de una multiplicación entre dos 
    números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta 
    es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su 
    respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función 
    Math.random() de Java */
        int i = (int) (Math.random() * 10);
        int j = (int) (Math.random() * 10);
        int secreto = i * j;
        
        System.out.println("Adivine el numero secreto");
        int respuesta = console.nextInt();
        while(respuesta != secreto){
            System.out.println("Nop. ese no es.");
            if(secreto>respuesta){
                System.out.println("Es mas alto el valor!");
            }else{
                System.out.println("Es menor el valor");
            }
            respuesta = console.nextInt();
        }
        System.out.println("Felicitaciones! El numero era " + secreto);
        System.out.println("Te ganaste un 0km!");
    }
    // Ejercicio11
    public static void digitos(){
            System.out.println("Ingrese un número entero:");
            int num = console.nextInt();
            int contador = 0;
            while(num!=0){
                num = num/10;
                contador++;              
            }
            System.out.println("El número tenía " + contador + " dígitos");
        }
    // Ejercicio12
    public static void contador(){
        
    /* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 
    al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Crear un método que dé solución a lo propuesto en el enunciado. */
      
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                
                for (int k = 0; k < 10; k++)
                {
                    if(i == 3){
                        System.out.print("E - ");
                    }else{
                        System.out.print(i + " - ");
                    }
                    
                    if(j == 3){
                        System.out.print("E - ");
                    }else{
                        System.out.print(j + " - ");
                    }
                    
                    if(k == 3){
                        System.out.println("E");
                    }else{
                        System.out.println(k);
                    }
                    
                }
               
            }
             
        }
    
    
    }
    // Ejercicio13
    public static void escalera(){
        /*Crear un método que dibuje una escalera de números, donde cada línea de números comience 
    en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. 
    Ejemplo: si se ingresa el número 3: 
    1
    12
    123*/
        int contador = 1;
        System.out.println("Ingrese la cantidad de escalones");
        int cantidad = console.nextInt();
        
        do{
        for(int i = 1 ; i <= contador ; i++){
            System.out.print(i);
        }
            System.out.println("");
            contador++;
        }while(contador <= cantidad);
        
    }
}
