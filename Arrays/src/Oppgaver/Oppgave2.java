package Oppgaver;

public class Oppgave2 {
    public static void main(String[] args){
        int liste [] = {1,2,3,4,5,6,7,8,9};

        System.out.print("Elementnummer til 3 er " + liste[3] + ". ");
        System.out.println("Elementnummer til 6 er " + liste[6]);


        int sumAlleTall = 0;
        for (int tall : liste){
            sumAlleTall += tall;
        }

        double gjennomsnittAlleTall = (double) sumAlleTall / liste.length;
        System.out.println("Summen av alle tallene er " + sumAlleTall);
        System.out.println("Gjennomsnittet er " + gjennomsnittAlleTall);

        int storreEnnFem = 0;
        int antallStorreEnnFem = 0;
        for (int tall : liste){
            if (tall > 5){
                storreEnnFem += tall;
                antallStorreEnnFem ++;

            }
        }

        double gjennomsnittStorreEnnFem = (double) storreEnnFem / antallStorreEnnFem;
        System.out.println("Summen av tallene større enn 5 er "+ sumAlleTall);
        System.out.println("Gjennomsnittet av tallene større enn 5 er " + gjennomsnittStorreEnnFem);


            int sumForenklet = 0;
            for (int i = 0; i < liste.length; i++){
                sumForenklet += liste[i];
                System.out.println("Summen av listen er " + sumForenklet);
            }
    }
}


//Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
// Finn så gjennomsnittet av alle tallene.
// Summer så alle tallene som er større enn 5. Finn så gjennomsnittet av disse.
// Summer så tallene med en forenklet for-løkke.