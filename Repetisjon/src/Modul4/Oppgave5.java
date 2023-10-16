package Modul4;



class Kalkulator{
    public static double addere (double tallet1, double tallet2){
        double sum = tallet1 + tallet2;
        return sum;
    }

    public static double subtrahere (double tallet1, double tallet2){
        double sum = tallet1 - tallet2;
        return sum;
    }

    public static double multiplisere (double tallet1, double tallet2){
        double sum = tallet1 * tallet2;
        return sum;

    }

    public static double dividere (double tallet1, double tallet2){
        double sum = tallet1 / tallet2;
        return sum;
    }

}

public class Oppgave5 {

    public static void main (String [] args){
        System.out.println("2+2 er " + Kalkulator.addere(2,2));
        System.out.println("2-2 er " + Kalkulator.subtrahere(2,2));
        System.out.println("2*2 er " + Kalkulator.multiplisere(2,2));
        System.out.println("2/2 er " + Kalkulator.dividere(2,2));

    }

}
