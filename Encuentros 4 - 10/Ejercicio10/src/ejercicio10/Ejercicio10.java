package ejercicio10;


public class Ejercicio10 {


    public static void main(String[] args) {
        Pensador algo = new Pensador(3915);
        
        System.out.println(algo.invertir()); 
        System.out.println("*-----------------*");
        System.out.println(algo.parAntes());
        System.out.println("*-----------------*");
        System.out.println(algo.parPosterior());
        System.out.println("*-----------------*");
        System.out.println(algo.primerDigito());
        System.out.println("*-----------------*");
        System.out.println(algo.ultimoDigito());
        System.out.println("*-----------------*");
    }
    
}
