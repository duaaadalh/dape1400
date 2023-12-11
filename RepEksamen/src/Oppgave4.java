
class KonverterTemperatur{

    public static double tilCelsius (double fraFarenheit){
        return (fraFarenheit-32)/1.8;
    }

    public static double tilFarenheit(double fraCelsius){
        return (fraCelsius*1.8)+32;
    }
}



public class Oppgave4 {
    public static void main(String[] args) {
        double celsius = 25.8;
        System.out.println(celsius + " grader celsius utgjør " + KonverterTemperatur.tilFarenheit(celsius)+ " grader i farenheit");
        double farenheit = 88.6;
        System.out.println(farenheit + " grader farenheit utgjør " + String.format("%.2f", KonverterTemperatur.tilCelsius(farenheit)) + " grader i celcius");

    }
}
