package guia6ej2;


public class Guia6Ej2 {

    /*
    Demuestre como provocar intencionalmente una excepción del tipo 
    ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango); luego agregue las 
    sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
    */
    public static void main(String[] args) {
        
        int [] numeros =  new int [3];
        
        try {
            for (int i = 0 ; i< 5 ; i++){
                System.out.println(numeros[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tipo de Error: \n" + e);
            System.out.println(e.fillInStackTrace());
           
        }
        
        
        
        
    }

}
