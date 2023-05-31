package guia4ej3;

import java.text.DecimalFormat;

public class Rectangulo implements CalculosFormas {

    private double base;

    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: "+df.format(area));    
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (base + altura)*2;
        System.out.println("El perímetro del rectángulo es: "+df.format(perimetro));
    }
}
