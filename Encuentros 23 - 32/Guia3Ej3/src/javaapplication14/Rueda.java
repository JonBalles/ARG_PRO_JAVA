package javaapplication14;

/*
B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además 
Rueda tendrá los siguientes comportamientos:
• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI
*/
public class Rueda {
    private String marca;
    private double presion = 28;
    
    public Rueda(){
   
    }
    
    public String getMarca() {
        return marca;
    }

    public double getPresion() {
        return presion;
    }
    
    public void inflar (){
        if(presion< 28.0){
            presion = 28.0;
        }
    }
    
    public void pinchar(){
        presion = 0;
    }
    
    public void desinflar(){
        if(presion > 0.5){
        presion -= 0.5;
       }else{
            pinchar();
       }
    }
        /*

C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas, 
avanzar/retroceder, y llenarTanque.
Nota: La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen 
llevar una presión recomendada comprendida entre los 28 a 30 PSI.

*/
}
