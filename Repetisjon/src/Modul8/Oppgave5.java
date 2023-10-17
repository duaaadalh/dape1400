package Modul8;

public class Oppgave5 {
    public static void main (String [] args){
        int [] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int største = liste[0]; // her settes største lik første element i listen
        int minste = liste[0]; // her settes minste lik første elementet i listen
        for (int i : liste){ //Den brukes for å iterere gjennom alle elementene i en array eller en annen samling.
            if (i > største){ // dersom i er større enn tallet for hvert element, settes det lik i
                største = i;} // Her settes i lik største verdien
            if (i < minste){ // dersom et av elementene i listen er mindre enn i, settes det lik i
                minste = i; // Her settes i lik minste verdien
            }


        }
        System.out.println("Største tallet er " + største);
        System.out.println("Minste tallet er " + minste);

    }
}

