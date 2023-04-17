package ejercicio8;


public class Ejercicio8 {

    public static void main(String[] args) {
        
        
        /*
        Utilizando los métodos estáticos de la clase Calculo:
    a) Informar por consola si un número escogido por usted es primo o no.
    b) Mostrar por consola el valor absoluto del valor -90;
    c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
        */
        System.out.println(Calculo.esPrimo(16));
        
        System.out.println("*-------------*");
        System.out.println(Calculo.valorAbsoluto(-8));
        
        System.out.println("*-------------*");
        Calculo.calcularRaices(1, 2, 9);

    }
    
}
