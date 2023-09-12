package Oppgaver;

public class Oppgave4 {
    public static void main(String[] args){
        int sum = 0;
        int antallPartall = 0;
        for (int i = 0; i<=100; i +=2){
            sum += i;
            antallPartall++;
        }

        double gjennomsnitt = (double) sum / antallPartall;

        System.out.println("Summen av partallene mellom 0 og 100 er " + sum);
        System.out.println("Gjennomsnittet av tallene mellom 0 og 99 er "+ gjennomsnitt);
    }
}
