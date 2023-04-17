package ejercicio4;

public class Conversor {

    private static double tipoDeCambio = 400.004;

    public static double convertirAPesos(double Dolar) {

        return Dolar * tipoDeCambio;

    }

    public static double convertirADolar(double Pesos) {

        return Pesos / tipoDeCambio;

    }

}
