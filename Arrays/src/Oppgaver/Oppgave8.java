package Oppgaver;

public class Oppgave8 {
    public static void main(String[] args){
        int antallElever = lesAntallElever();
        int [] poengsumArray = new int[antallElever];

        for (int i = 0; i<antallElever; i ++){
            poengsumArray[i] = lesPoengsumForElever(i+1);

        }
        double gjennomsnitt = beregnGjennomsnitt(poengsumArray);

        System.out.println("Gjennomsnittlig poengsum: " + gjennomsnitt);
    }


    }

