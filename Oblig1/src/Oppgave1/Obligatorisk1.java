package Oppgave1;

public class Obligatorisk1 {

    public static void main(String[] args)  {
        double radius = 13.5;

        String omkrets = String.format("%.2f", Sirkel.omkrets(radius));
        String areal = String.format("%.2f", Sirkel.areal(radius));
        String diameter = String.format("%.2f", Sirkel.diameter(radius));

        System.out.println("Arealet av sirkelen med radius " + radius + " er " + areal);
        System.out.println("Omkretsen av en sirkel med radius " + radius + " er " + omkrets);
        System.out.println("Diameteren av en sirkem med radius " + radius + " er " + diameter);



    }

}
