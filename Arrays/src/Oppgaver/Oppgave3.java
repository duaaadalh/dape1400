package Oppgaver;

public class Oppgave3 {
    public static void main(String[] args){
        String navn [] = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};

        for (int i = 0; i < navn.length; i+=2){
            String fornavn = navn[i];
            String etternavn = navn[i+1];

            System.out.println(fornavn + " " + etternavn);
        }
    }
}

// fremgangsmåte
// først setter vi i=0 fordi 0 viser til første variabel (som da er per)
// deretter vil vi løkken skal fortsette til den er gjennom alle variablene og dermed blir det
// i < navn.length
// videre, er hvert par av fornavn og etternavn lagret på hver annen indeks i arrayen
// når vi definerte fornavn tok vi i og på etternavn i +1 for å få med etternavnet som kommer etter
// fornavnet som vi har skrevet i indeksen