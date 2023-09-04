package StatiskMetode;

public class statiskMetode {

    private static double beregnAreal(double radius){
          double areal = Math.PI * Math.pow(radius, 2);
           return areal;
          //  return Math.PI * Math.pow(radius, 2); --> kunne gjort dette
    }

    public static void main (String [] args) {
        double radius = 23.23;
        double areal = beregnAreal(radius);
        System.out.println("Arealet til en sirkel med radius" + radius+ " er "+ areal);


    }
}
