package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        double Dolar = 500;
        double Pesos = 25700;

        double pesosConvertidos = Conversor.convertirAPesos(Dolar);

        System.out.println("Total dolares : " + Dolar);
        System.out.println("Total pesos : " + pesosConvertidos);
        System.out.println("*------------------------*");

        double dolaresConvertidos = Conversor.convertirADolar(Pesos);

        System.out.println("Total pesos : " + Pesos);
        System.out.println("Total dolar : " + dolaresConvertidos);
        System.out.println("*------------------------*");

    }

}
