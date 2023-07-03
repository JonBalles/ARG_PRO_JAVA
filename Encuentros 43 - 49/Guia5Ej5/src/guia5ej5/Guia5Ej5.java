package guia5ej5;


public class Guia5Ej5 {
    /*
    En un nuevo proyecto, en el método main de su clase principal, se pide realice un algoritmo que 
    compruebe si una matriz dada es anti simétrica.
    Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
    Es decir, A es anti simétrica si A = - AT.
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
    */
   
    public static void main(String[] args) {
         int [][] matriz = new int [4][4];
        
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                matriz[i][j]= (int) (Math.random() * 10);
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("*-----------------------*");
        
        for (int j = 0; j < 4; j++)
        {
            for (int i = 0; i < 4; i++)
            {   
               matriz[i][j]=  matriz[i][j] * - 1;
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    }


