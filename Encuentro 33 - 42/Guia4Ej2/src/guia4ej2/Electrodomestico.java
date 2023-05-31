package guia4ej2;


public abstract class Electrodomestico {
protected double precio;
protected String color;
protected double peso;
protected char consumoEnergetico;

public Electrodomestico(){
    
}

    public Electrodomestico(double precio, String color, double peso, char consumoEnergetico) {
        this.precio = precio;
        this.color = color;
        comprobarColor(color);
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);   
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
   
    protected void comprobarConsumoEnergetico(char letra){
        
        switch (letra){
           case 'A':
               this.consumoEnergetico = letra;
               break;
           case 'B':
               this.consumoEnergetico = letra;
               break;
           case 'C':
               this.consumoEnergetico = letra;
               break;
           case 'D':
               this.consumoEnergetico = letra;
               break;
           case 'E':
               this.consumoEnergetico = letra;
               break;
           default:
            {
                this.consumoEnergetico = 'F';
            }
               break;

       }
    }
    
    protected void comprobarColor(String color){
      if(!"rojo".equalsIgnoreCase(color) && !"blanco".equalsIgnoreCase(color) && !"negro".equalsIgnoreCase(color) && !"azul".equalsIgnoreCase(color) && !"gris".equalsIgnoreCase(color)){
          color = "Blanco";
      }  
      this.color = color;
    };
    
    public void precioFinal(){
       
        switch(consumoEnergetico){
            case 'A':
                precio += 1000;
                if(peso >= 1 && peso <= 19){
                    precio += 100;
                }else if(peso >= 20 && peso <= 49){
                    precio += 500;
                }else if(peso >= 50 && peso <= 79){
                    precio += 800;
                }else if(peso > 80){
                    precio += 1000;
                }
                break;
            case 'B':
                precio += 800;
                if(peso >= 1 && peso <= 19){
                    precio += 100;
                }else if(peso >= 20 && peso <= 49){
                    precio += 500;
                }else if(peso >= 50 && peso <= 79){
                    precio += 800;
                }else if(peso > 80){
                    precio += 1000;
                }
                break;
            case 'C':
                precio += 600;
                if(peso >= 1 && peso <= 19){
                    precio += 100;
                }else if(peso >= 20 && peso <= 49){
                    precio +=  500;
                }else if(peso >= 50 && peso <= 79){
                    precio +=  800;
                }else if(peso > 80){
                    precio +=  1000;
                }
                break;
            case 'D':
                precio +=  500;
                if(peso >= 1 && peso <= 19){
                    precio +=  100;
                }else if(peso >= 20 && peso <= 49){
                    precio +=  500;
                }else if(peso >= 50 && peso <= 79){
                    precio +=  800;
                }else if(peso > 80){
                    precio +=  1000;
                }
                break;
            case 'E':
                precio +=  300;
                if(peso >= 1 && peso <= 19){
                    precio +=  100;
                }else if(peso >= 20 && peso <= 49){
                    precio += 500;
                }else if(peso >= 50 && peso <= 79){
                    precio += 800;
                }else if(peso > 80){
                    precio += 1000;
                }
                break;
            case 'F':
                precio += 100;
                if(peso >= 1 && peso <= 19){
                    precio += 100;
                }else if(peso >= 20 && peso <= 49){
                    precio += 500;
                }else if(peso >= 50 && peso <= 79){
                    precio += 800;
                }else if(peso > 80){
                    precio += 1000;
                }
                break;    
        }
    }
    
}
