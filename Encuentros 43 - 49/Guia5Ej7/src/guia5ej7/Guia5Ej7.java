package guia5ej7;


public class Guia5Ej7 {
    /*
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, 
se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la 
matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar 
en la matriz M, desplazándose por filas o columnas, existe al menos una que coincida con la matriz 
P. En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza 
el primer elemento de la submatriz P.
Ejemplo: 
    Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices: 4,4 - 4,5 
- 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
Modele e implemente las clases Java con los métodos necesarios para poder resolver este 
problema. Luego realice las pruebas necesarias desde el método main de la clase principal del 
proyecto.
    */
   
    public static void main(String[] args) {
        
        //Inicializamos las matricez
        //int [][] M = new int [10][10];
       // int [][] P = new int [3][3];
       
       int[][] M = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        // Matriz P de 3x3
        int[][] P = {
            {23, 24, 25},
            {33, 34, 35},
            {43, 44, 45}
        };

         
        //Llenamos la submatriz primero para poder dar con el match
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
               // P[i][j] = (int)(Math.random() * 10);
                System.out.print(P[i][j] + " ");
            }
            System.out.println();
        }

        //Llenamos la matriz 10x10
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
              //  M[i][j] = (int)(Math.random() * 10);
                System.out.print(M[i][j] + " ");
 
            }
            System.out.println();
        }
        System.out.println("*--------------------*");
       
        
        
       int[] result = checkSubmatrix(M, P);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("La submatriz P está contenida en la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + result[0] + " y columna " + result[1] + ".");
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }
        
        
    }
    public static int[] checkSubmatrix(int[][] matrix, int[][] submatrix) {
        int[] result = {-1, -1};
        int filas = matrix.length;
        int columnas = matrix[0].length;
        int subFilas = submatrix.length;
        int subColumnas = submatrix[0].length;

        for (int i = 0; i < filas - subFilas + 1; i++) {
            for (int j = 0; j < columnas - subColumnas + 1; j++) {
                boolean match = true;
                for (int k = 0; k < subFilas; k++) {
                    for (int l = 0; l < subColumnas; l++) {
                        if (matrix[i + k][j + l] != submatrix[k][l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

}
