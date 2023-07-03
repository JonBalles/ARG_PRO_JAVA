package guia5ej1;

public class Guia5Ej1 {

    public static void main(String[] args) {

        int [] numeros = {3,3,4}; 
        int [][] numerosBi = {{1,2,3},{1,8,7}};
        
        //Ejercicio 1
       Arreglo.sumarLista(numeros);
        
        //Ejercicio 2
        Arreglo.BuscarMayor(numerosBi);
        Arreglo.BuscarMenor(numerosBi);
        
        //Ejercicio3
        Arreglo.cuentaVocales("AbracadAOUUUUUUUbra");
        
        
        Arreglo.cuentaCaracter("uwuuuuuuuu", 'U');
    }

}
