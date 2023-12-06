
class Sirkel{
    public static double beregnDiameter (double radius){
        double diameter = radius*2;
        return (diameter);
    }

    public static double beregnOmkrets (double radius){
        double omkrets = (2*3.14*radius);
        return (omkrets);
    }

    //Kan enten definere en double omkrets/areal/diameter også trykke return, eller ikke

    public static double beregnAreal (double radius){
        return (2*3.14*Math.pow(radius,2));
    }
}

public class Oblig1 {
    public static void main(String[] args) {
        double radius = 34.5;
        System.out.println("Arealet av en sirkel " + Sirkel.beregnAreal(radius));
        System.out.println("Omkretsen av en sirkel er " + Sirkel.beregnOmkrets(radius));
        System.out.println("Diameteren av en sirkel er " + Sirkel.beregnDiameter(radius));
    }

}
