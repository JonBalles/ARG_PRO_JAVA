package javaapplication14;


public class Auto {
    
private String color;
private String patente;
private double combustible;
private Rueda rueda1 = new Rueda();
private Rueda rueda2 = new Rueda();
private Rueda rueda3 = new Rueda();
private Rueda rueda4 = new Rueda();

public boolean evaluarRuedas(){
    
    if(rueda1.getPresion() < 5 && rueda2.getPresion() < 5 && rueda3.getPresion() < 5 && rueda4.getPresion() < 5){
       return false;
    }else{
        return true;
    }
    
}


public Auto(String color, String patente){
    this.color = color;
    this.patente = patente;
    this.combustible = combustible;
    
    combustible=50;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void Avanzar(int metros){
        double consumo;
        
            if(!evaluarRuedas()){
                System.out.println("Hay una rueda pinchada o baja");
            } else {
                if(combustible > 0){
                consumo = combustible - (metros * 0.1); 
                if(consumo < 0){
                    System.out.println("No tenes suficiente combustible para avanzar " + metros);
                }else{
                    rueda1.desinflar();
                    combustible -= metros * 0.1;
                    System.out.println("Avanzo: " + metros + " y restan: " + combustible);
                    System.out.println("Estado de rueda 1: " + rueda1.getPresion());
                }
            }  
           }
    }
    
    public void Retroceder(int metros){
        double consumo;
        if(!evaluarRuedas()){
                System.out.println("Hay una rueda pinchada o baja");
            } else {
                 if(combustible > 0){
                consumo = combustible - (metros * 0.1); 
                if(consumo < 0){
                    System.out.println("No tenes suficiente combustible para retroceder " + metros);
                }else{
                    combustible -= metros * 0.1;
                    System.out.println("Retrocedio: " + metros + " y restan: " + combustible);
                }
            }  
        }
    }
    
    public void LlenarTanque(){
        if(combustible<50){
            combustible = 50;
        }
        System.out.println("Tanque lleno!");
    }
}
