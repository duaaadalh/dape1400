package Oppgave1;

public class Sirkel {


    public static double diameter (double radius){
        return radius*2;
    }

    public static double omkrets (double radius){

        return 2*Math.PI * radius;
    }

    public static double areal (double radius){
        return Math.PI*Math.pow(radius,2);
    }



    public static void main(String[] args) {
        double radius = 6.7;
        double omkretsSirkel = omkrets(radius);
        double diameterSirkel = diameter(radius);
        double arealSirkel = areal(radius);

        System.out.println("Arealet er " + arealSirkel);

    }
}


