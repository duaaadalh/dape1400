package Eksamen2022;

class KonvertTemp{

    public static double tilCelsius (double fraFarenheit){
        return (fraFarenheit - 32)/1.8;
    }

    public static double tilFarenheit (double fraCelsius){
        return (fraCelsius * 1.8)+32;
    }

}

public class reOpg4 {
    public static void main(String[] args){
        double celsius = 25.5;
        System.out.println(celsius + " celsius blir " + KonvertTemp.tilFarenheit(celsius) + " farenheit");
        double farenheit = 80.4;
        System.out.println(farenheit + " farenheit blir " + String.format("%.2f",KonvertTemp.tilCelsius(farenheit))+ " celsius");

    }
}
