/*
En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará 
un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para 
dicho atributo y los siguientes métodos adicionales:

Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probar todos sus métodos y mostrar por consola los resultados obtenido
 */
package ejercicio10;

public class Pensador {

    private int valor;

    public Pensador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int invertir() {
        /*
             invertir(): Este método retornará el valor guardado en el atributo con sus cifras 
            invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
         */

        int auxiliar = valor;
        int resultado = 0;

        while (auxiliar > 0)
        {
            resultado = resultado * 10 + auxiliar % 10;
            auxiliar = Math.round(auxiliar / 10);
        }

        return resultado;
    }

    public int parAntes() {
        // parAntes(): Este método retornará el valor par próximo anterior al valor guardado.
        if (valor % 2 == 0)
        {
            return valor - 2;
        } else
        {
            return valor - 1;
        }
    }

    public int parPosterior() {
        /*
         parPosterior(): Este método retornará el valor par próximo posterior al valor 
        guardado.
         */
        if (valor % 2 == 0)
        {
            return valor + 2;
        } else
        {
            return valor + 1;
        }
    }

    public int primerDigito() {
        // primerDigito(): Este método retornará el primer dígito del valor guardado. 
        int auxiliar = valor;
        
        
        while (auxiliar >= 10 )
        {
            
            auxiliar = Math.round(auxiliar / 10);
            
        }

        return auxiliar;

    }

    public int ultimoDigito() {
        //  ultimoDigito(): Este método retornará el último dígito del valor guardado.
        return valor % 10;
    }

}
