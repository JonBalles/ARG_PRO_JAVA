
package clase2act8;

public class Calculo {
    
    public static boolean esPrimo(int num){
        
        if (num==1 || num==2 || num==3 || num==5 || num==7){
            return true;
        }
        else if (num>1 && num<9){
            return false; 
        }
        else if (num >= 9) {
            if (num%2==0){
                return false;
            }
            else if(num%3==0){
                return false;
            }
            else if (num%5==0){
                return false;
            }
            else if (num%7==0){
                return false;
            }
            else{
            return true;
            }
        }
        return false;
    }
    
    
}
      
        

