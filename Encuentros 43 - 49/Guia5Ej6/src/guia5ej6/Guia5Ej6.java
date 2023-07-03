package guia5ej6;

import javax.swing.JOptionPane;


public class Guia5Ej6 {

   
    public static void main(String[] args) {
        /*
        
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma 
    de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir 
    un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá 
    comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
    Modele e implemente las clases Java con los métodos necesarios para poder resolver este 
    problema. Luego realice las pruebas necesarias desde el método main de la clase principal del 
    proyecto.
        */
        
        //Inicializo la matriz
        int [][] matriz = new int [3][3];
        
        
        //Itero la matriz para empezar a llenar los indices con valores
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                //matriz[i][j] = (int) (Math.random() * 10);
                
                //Mientras el numero ingresado sea entre 0 y 9 lo almacena en su respectivo indice
                do
                {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un total de 9 números")); 
                }
                while(!(matriz[i][j]<10 && matriz[i][j] >=0));
                
                //Imprimimos el cuadro para chequear todo ok!
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        //Declaramos las variables que van a comprobar que sea un cuadrado magico
        int diagonal = 0;
        int diagonalInversa = 0;
        
        int columna1 =0;
        int columna2 =0;
        int columna3 =0;
        
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        
        //Evaluamos cada suma por fila, columna y diagonal
        for (int i = 0; i < 3; i++)
        {
            //Valores de diagonales
           diagonal += matriz[i][i];
           diagonalInversa += matriz[i][matriz.length - 1 -i];
           
           //Guardamos valores de filas
           fila1 += matriz [0][i];
           fila2 += matriz [1][i];
           fila3 += matriz [2][i];
           
           //Valores de columnas
           columna1 += matriz [i][0];
           columna2 += matriz [i][1];
           columna3 += matriz [i][2];
        }
        
        int filas = (fila1 + fila2 + fila3) / 3;
        int columnas = (columna1 + columna2 + columna3) / 3;
        int diagonales = (diagonal + diagonalInversa) / 2;
        
        if(columnas == filas && filas == diagonales ){
            System.out.println("Tu cuadrado es magico");
        }else{
            System.out.println("Tu cuadrado re trucho!");
        }

        //Comprobamos los valores de cada fila y columna
        /*
        System.out.println("*-----------------*");
        System.out.println("Diagonales");
        System.out.println(diagonal);
        System.out.println(diagonalInversa);
        System.out.println("*-----------------*");
        System.out.println("Columnas");
        System.out.println(columna1);
        System.out.println(columna2);
        System.out.println(columna3);
        System.out.println("*-----------------*");
        System.out.println("Filas");
        System.out.println(fila1);
        System.out.println(fila2);
        System.out.println(fila3);
        */
    }

}
