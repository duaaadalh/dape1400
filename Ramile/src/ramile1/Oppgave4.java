package ramile1;

class KonverterTemperatur{

    public static double tilCelsius (double fraFarenheit){
        return (fraFarenheit - 32)/1.8;
    }

    public static double tilFarenheit (double fraCelsius){
        return (fraCelsius * 1.8)+32;
    }



        }

public class Oppgave4 {
    public static void main(String[] args) {
        double celsius = 23.6;
        System.out.println(celsius + " celsius grader gir " + KonverterTemperatur.tilFarenheit(celsius) + " F");
        double farenheit = 88.7;
        System.out.println(farenheit + " farenheit grader gir " + String.format("%.2f", KonverterTemperatur.tilCelsius(farenheit))+ " C");
    }
}
