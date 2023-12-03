package Eksamen2022;


class KonvertererTemperaturer{

    public static double tilCelsius (double innFarenheit){
        return (innFarenheit - 32)*1.8;
    }
    
    public static double tilFarenheit (double innCelsius){
        return (innCelsius*1.8)+32;
    }

}

public class RepetisjonOppgave4 {
    public static void main(String[] args){
    double celsius = 35.8;
    System.out.println(celsius + " celsius blir " + KonvertererTemperaturer.tilFarenheit(celsius) + " farenheit");
    double farenheit = 88.3;
    System.out.println(farenheit + " farenheit blir " + String.format("%.2f" , KonvertererTemperaturer.tilCelsius(farenheit))+ " celsius");


    }
}
