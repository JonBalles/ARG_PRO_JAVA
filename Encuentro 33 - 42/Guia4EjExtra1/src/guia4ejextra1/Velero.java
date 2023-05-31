package guia4ejextra1;


public class Velero extends Barco {

    private int mastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int mastiles) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }
     
    @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.mastiles;
    }
}
