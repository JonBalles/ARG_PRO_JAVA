/*En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
 esPrimo(): Este método recibe un número entero y retorna true si el número recibido es
primo, caso contrario retornará false.
 valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
 calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo
grado y mostrará por consola sus raíces y si no las tiene también lo informará.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

Utilizando los métodos estáticos de la clase Calculo:
a) Informar por consola si un número escogido por usted es primo o no.
b) Mostrar por consola el valor absoluto del valor -90;
c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.*/

package clase2act8;


public class Clase2Act8 {

    
    public static void main(String[] args) {
        
        
        /*for (int i = 1; i<=100; i++){
            System.out.println(i+" : "+Calculo.esPrimo(i));
        } */  
        
        double num = Math.pow(25, 0.5);
        System.out.println(num);
        
    }    
}
