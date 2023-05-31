package guia4ej3;


import java.text.DecimalFormat;

public class Circulo implements CalculosFormas {

    private double diametro;

    private double radio;

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    DecimalFormat df = new DecimalFormat("#.##");


    @Override
    public void calcularArea() {
        double area = Math.pow((PI*radio),2);
        System.out.println("El área del círculo es: "+df.format(area));
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = PI * diametro;
        System.out.println("El perímetro del círculo es: "+df.format(perimetro));
    }
}
