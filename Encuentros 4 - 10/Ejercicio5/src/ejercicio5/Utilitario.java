package ejercicio5;

public class Utilitario {

    public static void dibujarCuadrado(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
             System.out.println("");
        }
    }
    
    
  
    public static void esMayor(int a, int b, int c){
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        } else if ((c == a && c > b) || (c == b && c > a) || (b == a && b > c)){
            System.out.println("Dos numeros de igual valor no permite mostrar el numero de mayor valor");
        } else {
            System.out.println("Todos los numeros son de igual valor");
        }
    }
    
    
    public static String elDiaEs(int dia){
        
        switch (dia){
            case 1: return "lunes";
            
            case 2: return "Martes";
            
            case 3: return "Miercoles";
            
            case 4: return "Jueves";
            
            case 5: return "Viernes";
            
            case 6: return "Sabado";
            
            case 7: return "Domingo";
            
            default : return "Dia invalido";
        }
    }
}
