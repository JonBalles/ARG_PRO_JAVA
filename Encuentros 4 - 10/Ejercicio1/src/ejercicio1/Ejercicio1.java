package ejercicio1;

public class Ejercicio1 {

      public static void main(String[] args) {
        
         Numero variante1 = new Numero(1459);
         
          
        if(variante1.esPar()){
            System.out.println(variante1.getValor());
            System.out.println("Es numero par? " + true);
            System.out.println("*-----------------*");
        }else{
            System.out.println(variante1.getValor());
            System.out.println("Es numero par? " + false);
            System.out.println("*-----------------*");
        }
        
        if(variante1.esPositivo()){
            System.out.println(variante1.getValor());
            System.out.println("Es positivo? " + true);
            System.out.println("*-----------------*");
        }else{
            System.out.println(variante1.getValor());
            System.out.println("Es positivo? " + false);
            System.out.println("*-----------------*");
        }  
        
        int param = 3;
        if(variante1.esMultiploDe(param)){
            System.out.println(variante1.getValor());
            System.out.println("Es multiplo de " + param);
            System.out.println("*-----------------*");
        }else{
            System.out.println(variante1.getValor());
            System.out.println("No es multiplo de " + param);
            System.out.println("*-----------------*");
        }
        
          
    }
    
}
