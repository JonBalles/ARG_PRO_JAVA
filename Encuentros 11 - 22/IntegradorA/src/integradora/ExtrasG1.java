package integradora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExtrasG1 {

    // Declaramos un Scanner de scope global para agilizar su llamado
    static Scanner console = new Scanner(System.in);

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

    public static void numerosRomanos() {
        String romanos[] =
        {
            "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        };

        System.out.println("Ingrese un numero del 1 - 10");
        int num = console.nextInt();

        System.out.println("El numero en romano es: " + romanos[num]);

    }

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

    public static void altura() {

        /*Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y 
    determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de 
    estaturas en general.*/
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

}
