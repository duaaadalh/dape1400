package Oppgaver;

public class Oppgave8 {
    public static void main(String[] args){
        int sum = 0;
        int parTall = 0;
        int i = 0;

        while (i <=100){
            sum += i;
            parTall ++;
            i ++;

        }

        double gjennomsnitt = (double) sum / parTall;

        System.out.println("Summen av partallene mellom 0 og 100 er " + sum);
        System.out.println("Gjennomsnittet av tallene mellom 0 og 99 er "+ gjennomsnitt);
    }
}
