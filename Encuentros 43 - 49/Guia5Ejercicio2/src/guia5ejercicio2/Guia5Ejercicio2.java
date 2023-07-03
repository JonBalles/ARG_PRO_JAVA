package guia5ejercicio2;


public class Guia5Ejercicio2 {
    /*
    ) En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que 
    rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden 
    descendente.
    */
   
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        for (int i = vector.length -1 ; i >= 0; i--)
        {
            vector[i] = i + 1;
            System.out.println(vector[i]);
        }
    }

    
    
    
}
