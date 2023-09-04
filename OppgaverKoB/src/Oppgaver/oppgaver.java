package Oppgaver;

    class Bøker {

     public String tittel;
     public String pris;
     public String forfatter;
     public String iSBNNummer;

     public void visTittel(){
         System.out.println("Tittelen på boka er " + tittel);
     }
     public void visPrisen(){
         System.out.println("Prisen på boka er " + pris);
     }

     public void visForfatter(){
         System.out.println("Forfatteren til denne boka er " + forfatter);

     }

     public void visIsbnNummer(){
         System.out.println("ISBN-nummeret til boka er " + iSBNNummer);
     }


    }

public class oppgaver {
    public static void main (String[] args) {

        Bøker nyBøker = new Bøker();


        nyBøker.tittel = "Drapet på skolen";
        nyBøker.pris = "198kr";
        nyBøker.forfatter = "Jo Nesbø";
        nyBøker.iSBNNummer = "8349532";

        nyBøker.visForfatter ();
        nyBøker.visTittel();
        nyBøker.visPrisen();
        nyBøker.visIsbnNummer();




    }

}
