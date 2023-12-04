package ramile1;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        //Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
        //a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
        //b) Skriv ut annethvert element
        //c) Skriv ut summen av alle positive tall i arrayet
        //d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
        //Bruk løkker og System.out for å skrive ut.

        int [] liste = {-3,41,5,-3,2,49};

        int teller = 0;
        for (int i : liste){
            if (i > 10){
                teller++;
            }
        }
        System.out.println(teller);

        //b

        for (int i = 0; i < liste.length; i += 2){
            System.out.println(liste[i]);
        }

        //C.
        int positiv = 0;
        int sum = 0;
        int gjennomsnittet = 0;
        for(int i : liste){
            if(i > 0){
                sum += i;
                positiv ++;
                gjennomsnittet = sum / positiv;

            }
        }
        System.out.println(sum + " er summen av positiv talene " + ". gjennomsnittet er " + gjennomsnittet);

        //D. Skriv også ut gjennomsnittet av alle positive tall i arrayet




    }
}
