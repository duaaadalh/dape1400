package KogBoppgave3;

class Kalkulator{

    public static double multiplikasjon (double x, double y){
        return x*y;
    }

    public static double divisjon (double x, double y){
        return x/y;
    }

    public static double addisjon (double x, double y){
        return x+y;
    }

    public static double subtraksjon (double x, double y){
        return x-y;
    }





}




public class KogBoppgave5 {
    public static void main (String[] args) {
        double x = 200.87;
        double y = 100.98;

        double sum = Kalkulator.addisjon(x, y);
        double differanse = Kalkulator.subtraksjon(x, y);
        double produkt = Kalkulator.multiplikasjon(x, y);
        double kvotient = Kalkulator.divisjon(x, y);

        System.out.println("Addisjon: " + sum);
        System.out.println("Subtraksjon: " + differanse);
        System.out.println("Multiplikasjon: " + produkt);
        System.out.println("Divisjon: " + kvotient);








    }
}
