package guia4ejextra1;


public class YateLujoso extends Barco {

    private int potenciaCV;
    private int camarotes;

    public YateLujoso(String matricula, double eslora, int anioFabricacion, int potenciaCV, int camarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getCamarotes() {
        return camarotes;
    }

   @Override
    public double calcularModulo() {
        return super.calcularModulo() + this.camarotes + this.potenciaCV;
    }
    
}
