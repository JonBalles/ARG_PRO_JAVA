package guia5ej3;

import javax.swing.JOptionPane;



public class Guia5Ej3 {

   /*
     En un nuevo proyecto, en el método main de su clase principal, se pide crear un algoritmo que 
    rellene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el 
    vector. El programa mostrará donde se encuentra el número y si se encuentra repetido
    */
    public static void main(String[] args) {
        // Declaro mi variable N como entero, Le pido al usuario un numero desde un input, ese input
        //llega en string y lo parseo a Int
        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de elementos"));
        int [] vector = new int[N];
        
        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = (int)(Math.random()*((10 - 1))) ;
            System.out.println(vector[i]);
        }
        
       int Buscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Que numero buscas?"));
        
        
          for (int i = 0; i < vector.length; i++)
        {
            if(Buscar == vector[i]){
            JOptionPane.showMessageDialog(null, "Encontre tu numero " + Buscar + " en la posicion " + i);
           // System.out.println("Encontre tu numero " + Buscar + " en la posicion " + i);
            }
        }
          
    }

}
