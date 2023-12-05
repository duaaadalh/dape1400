

class KonverterTemperatur{

    public static double tilCelsius (double fraFarenheit){
        return (fraFarenheit - 32)/1.8;
    }
    public static double tilFarenheit (double fraCelsius){
        return (fraCelsius * 1.8) + 32;
    }


}


public class Oppgave4 {
    public static void main(String[] args) {
        double celsius = 23.6;
        System.out.println(celsius + " celsius blir " + KonverterTemperatur.tilFarenheit(celsius) + " farenheit");
        double farenheit = 89.60;
        System.out.println(farenheit + " farenheit blir " + String.format("%.2f", KonverterTemperatur.tilCelsius(farenheit)) + " celsius");

    }
}
