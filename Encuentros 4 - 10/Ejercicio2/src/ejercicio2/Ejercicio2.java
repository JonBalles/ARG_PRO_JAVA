
package ejercicio2;

public class Ejercicio2 {

   
    public static void main(String[] args) {
        // largo , alto
        Cuadrilatero cuadrado = new Cuadrilatero(70, 50);
        
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        cuadrado.esUnCuadrado();
        
        cuadrado.setLargo(50);
        cuadrado.esUnCuadrado();   
    }
}
