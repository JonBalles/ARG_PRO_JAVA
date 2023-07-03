package guia5ej1;

import java.text.DecimalFormat;

/*
1) En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos
estáticos (static):

Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
de la clase Arreglo creada por usted.
*/
public class Arreglo {
    
    public static void sumarLista(int [] numbers){
        /*
        a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
        enteros y muestre por pantalla la suma y promedio de los mismos.
        */
        //Conversor a dos cifras como maximo en decimales
        DecimalFormat df = new DecimalFormat("#.##");
        
        //Inicializo variables para sumar total y promedio
        int total = 0;
        double promedio =0;
        
        //Hago una iteracion para cada numero de mi arreglo
        for(int i = 0 ; i < (numbers.length) ; i++){
            //Sumo los valores de mi arreglo para obtener el total y poder sacar un promedio
            total += numbers[i]; 
        }
        
        //Calculo el promedio
        promedio = total / numbers.length;
        
        //Imprimo por pantalla los resultados
        //Aplicamos decimal format para evitar muchos decimales
        System.out.println("El promedio es: " + df.format(promedio));
       
        System.out.println("La suma total de los numeros es: " + total);
    }
    
    public static void BuscarMenor(int [][] numeros){
        /*
        b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
    `   irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
        */
       //Inicio la variable menor con un numero alto
        int menor = 9999;
            
       //itero entre los vectores de mi matriz bidimensional
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros.length; j++)
            {
                //Utilizo el metodo Math.min para que devuelva el menor
                menor = Math.min(menor, numeros[i][j]);
            }
        }
        //Imprimimos por pantalla el numero menor
        System.out.println("El numero menor es: " + menor);
        
    }
    public static void BuscarMayor(int [][] numeros){
   
       //Inicio la variable menor con un numero alto
        int mayor = 0;
            
       //itero entre los vectores de mi matriz bidimensional
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros.length; j++)
            {
                //Utilizo el metodo Math.max para que devuelva el mayor
                mayor = Math.max(mayor, numeros[i][j]);
            }
        }
        //Imprimimos por pantalla el numero menor
        System.out.println("El numero mayor es: " + mayor);
        
    }
    
    
    public static void cuentaVocales(String palabra){
    /*
    c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
    de vocales que tiene la cadena.
    */
        //Creo mi lista de vocales e inicio una variable cantidad en 0
        char [] vocal = {'a','e','i','o','u'};
        int cantidad = 0;
        
        //TRansformamos el parametro a minusculas para evitar errores por diferencia en mayusuclas y minusculas
        palabra = palabra.toLowerCase();
        // Primero hay que iterar entra las letras de la palabra que vamos a ingresar
        for (int i = 0; i < palabra.length(); i++)
        {
            //Despues, vamos a iterar nuestra lista de vocales
            for (int j = 0; j < vocal.length; j++)
            {
                //Dentro de esas dos iteraciones ya podemos comprobar si en la palabra hay vocales!
                if(palabra.charAt(i) == vocal[j] ){
                    //Si hay vocales, cantidad debe aumentar su valor en 1(uno) 
                    cantidad++;
                }
            }   
        }
        //Por ultimo retornamos la cantidad total de vocales
        System.out.println("Cantidad de vocales: " + cantidad);
    }
    
    public static void cuentaCaracter(String palabra, char caracter){
        /*
    d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
    retorne la cantidad de veces que se repite en la cadena el carácter recibido
    */
       
        
        String cadenaNueva = String.valueOf(caracter);
        
        int cantidad = 0;
            for (int i = 0; i < palabra.length(); i++){
          
                if(palabra.substring(i).equalsIgnoreCase(cadenaNueva)){
                   cantidad++;
                }
              
        }
            System.out.println("El caracter se repitio:" + cantidad + " de veces");
    }


   
}
