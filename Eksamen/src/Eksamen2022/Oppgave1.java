package Eksamen2022;

public class Oppgave1 {

    public static void main (String [] args){

        int [] liste = {-3, 41, 5, -3, 2, 49};

        int teller = 0;
        for (int i : liste){
            if (i > 10){
                teller++;
            }
        }
        System.out.println("Antall tall større enn 10 er " + teller) ;


        for (int i = 0; i<liste.length; i +=2){
            System.out.println("Annethvert tall er " + liste[i]);
        }

        int sum = 0;
        teller = 0;

        for (int i : liste){
            if (i > 0){
                sum += i;
                teller ++;
            }
        }

        System.out.println("Summen av tallene er " + sum);
        double gjennomsnitt = (double) sum / teller;
        System.out.println("Gjennomsnittet av tallene er " + gjennomsnitt);



    }
}
