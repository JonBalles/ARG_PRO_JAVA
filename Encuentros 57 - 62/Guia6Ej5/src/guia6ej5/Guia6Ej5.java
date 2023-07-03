package guia6ej5;

import java.util.Scanner;


public class Guia6Ej5 {
    /*
    Escribir un programa en Java que juegue con el usuario a adivinar un número. 
    La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene 
    que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la 
    computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor 
    que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e 
    imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si 
    el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo 
    por pantalla. En este último caso también se debe contar el carácter fallido como un 
    intento.
    */
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        int intentos = 0;
        String a;
         //Variable con el numero a adivinar
        int secreto = (int) (Math.random() * 1000);
        //Nos aseguramos que el numero sea hasta 500
        while(secreto > 500){
            secreto = (int) (Math.random() * 1000);
        }
       
        boolean on = true;
        
        System.out.println("Bienvenido al adivinador de numeros");
        
        System.out.println("Adivine el numero (Del 1 al 500)");
        while(on)
        {

            try
            {
                a = leer.next();
                        
                numero = Integer.parseInt(a);
                if (numero > secreto)
                {
                    System.out.println("El numero secreto es menor al que pusiste");
                    System.out.println("Intentalo otra vez!");
                } else if (numero < secreto)
                {
                    System.out.println("El numero secreto es mayor al que pusiste");
                    System.out.println("Intentalo otra vez!");
                }
                else{
                    on = false;
                }
            } catch (NumberFormatException e)
            {
                System.out.println("No se permiten caracteres. Solo numeros");
                System.out.println("Intentalo otra vez!");
            }
            intentos++;

        }
        
        System.out.println("Lo lograste! El numero secreto era: \n" + secreto);
        System.out.println("Cantidad de intentos: " + intentos);
  
    }

}
