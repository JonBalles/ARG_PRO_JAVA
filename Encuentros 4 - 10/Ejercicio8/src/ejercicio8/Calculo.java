package ejercicio8;

public class Calculo {
    //  esPrimo(): Este método recibe un número entero y retorna true si el número recibido es 
    //primo, caso contrario retornará false.
    public static boolean esPrimo(int n){
       if(n > 3){
           return n % 1 == 0 && n % n == 0 && n % 2 != 0 && n % 3 != 0;
       }else{
           return n % 1 == 0 && n % n == 0;
       }

    } 
    
//  valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
    
    public static int valorAbsoluto(int n){
        return n * (-1);
    }
    
    
    public static void calcularRaices(double a, double b, double c){

        System.out.println("La raiz de "+ a + " es " + Math.pow(a, 0.5));
        System.out.println("La raiz de "+ b + " es " + Math.pow(b, 0.5));
        System.out.println("La raiz de "+ c + " es " + Math.pow(c, 0.5));
    }
    /*
     calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo 
grado y mostrará por consola sus raíces y si no las tiene también lo informará.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
    */
}
