package guia4ejextra1;


public class BarcoVapor extends Barco {

    private int potenciaCV;

    public BarcoVapor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
     @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.potenciaCV;
    }
}
