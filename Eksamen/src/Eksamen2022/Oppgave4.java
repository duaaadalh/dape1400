package Eksamen2022;


class KonverterTemperatur{
    public static double tilCelsisus(double innFarenheit){
        return (innFarenheit - 32)/1.8;
    }

    public static double tilFarenheit(double innCelsius){
        return (innCelsius*1.8) + 32;
    }

}

public class Oppgave4 {
    public static void main(String[] args){
        double celsius = 23.6;
        System.out.println(celsius + " celsius blir " + KonverterTemperatur.tilFarenheit(celsius) + " farenheit");
        double farenheit = 85.5;
        System.out.println(farenheit + " farenheit blir " + String.format("%.2f", KonverterTemperatur.tilCelsisus(farenheit))+ " celsius");


    }
}
