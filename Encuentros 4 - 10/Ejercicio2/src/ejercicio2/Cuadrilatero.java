package ejercicio2;


public class Cuadrilatero {
    
    private double largo;
    private double alto;
    
    public Cuadrilatero(double largo, double alto){
        this.largo = largo;
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public void calcularPerimetro(){
        // calcularPerimetro(): este método retornará el perímetro del cuadrilátero.
        System.out.println("Perimetro: " + (alto * 2 + largo * 2));
        System.out.println("*----------------*");
    }
    
    public void calcularArea(){
        // calcularArea(): este método retornará la superficie del cuadrilátero.
        System.out.println("Area: " + (alto * largo));
        System.out.println("*----------------*");
    }
    
    public void esUnCuadrado(){
        /* esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso
        contrario retornará false.*/
        if(largo == alto){
            System.out.println("Es un cuadrado");
            System.out.println("*----------------*");
        }else{
            System.out.println("No es un cuadrado");
            System.out.println("*----------------*");
        }
    }
   
    
    
}
