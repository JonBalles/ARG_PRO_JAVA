package guia4ej3;


public class Guia4Ej3 {

   
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5,5);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        Rectangulo rectangulo = new Rectangulo(5.5,10.1);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }

}
