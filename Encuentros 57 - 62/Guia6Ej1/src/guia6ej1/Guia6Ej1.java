package guia6ej1;


public class Guia6Ej1 {
    /*
    Demuestre como provocar intencionalmente una excepción del tipo
    NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de 
    error
    */
   
    public static void main(String[] args) {
        String nuevo = null;
        
        try{
            int num = nuevo.length();
            System.out.println(num);
        }catch(NullPointerException e){
            System.out.println("Se ha producido un error: \n " + e);
            System.out.println("No se puede acceder al tipo de dato o contiene datos nulos");
        }
    }

}
