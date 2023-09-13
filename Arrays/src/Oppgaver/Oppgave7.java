package Oppgaver;

public class Oppgave7 {
    public static void main(String[] args){
        int liste [] = {1,2,5,6,8};
        int antallPartall = 0;
        int antallOddetall = 0;

        for (int i = 0; i < liste.length; i++){
            if (liste[i] % 2 == 0){
                antallPartall ++;
            }
            else {
                antallOddetall ++;
            }

        }
        System.out.println("Antall partall er: " + antallPartall);
        System.out.println("Antall oddetall er: " + antallOddetall);


    }
}
