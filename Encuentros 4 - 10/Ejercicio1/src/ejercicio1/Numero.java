package ejercicio1;


public class Numero {
        private int valor;
        
        
        public Numero(int valor){
            this.valor = valor;
        }
        
        
        public int getValor(){
            return valor;
        }
        
        public void setValor(){
            this.valor = valor;
        }
               
        public boolean esPar(){
        /*  esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario
            retornará false.
            */
        return valor % 2 == 0;
        
       
        }
        
        
        public boolean esPositivo(){
            /* esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual
            a cero, caso contrario retornará false.*/
            return valor >= 0;
           
        }
        
        
        public boolean esMultiploDe(int multiplo){
            /* esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor
            guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false */
            
            return valor % multiplo == 0;
       }
        
        
}
