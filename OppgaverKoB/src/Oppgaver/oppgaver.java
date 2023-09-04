package Oppgaver;

import javax.swing.*;


class Bøker {

     public String tittel;
     public String pris;
     public String forfatter;
     public String iSBNNummer;

     // metode som returnerer atributtene
     public String getTittel(){
         return tittel;
     }
    public String getPris(){
        return pris;
    }
    public String getForfatter(){
        return forfatter;
    }
    public String getiSBNNummer(){
        return iSBNNummer;
    }

    // Metode for å printe ut
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

        // her hentes system out printen fra ovenfor med verdiene fra linje 55-58
        nyBøker.visForfatter();
        nyBøker.visTittel();
        nyBøker.visPrisen();
        nyBøker.visIsbnNummer();

        String innForTittel = JOptionPane.showInputDialog("Skriv inn tittel");
        String innforForfatter = JOptionPane.showInputDialog("Skriv inn navnet på forfatter");
        String innForPris = JOptionPane.showInputDialog("Skriv inn prisen");
        String innForISBNNummer = JOptionPane.showInputDialog("Skriv inn ISBN nummer");

        // Henter verdi for show message dialog

        Bøker nybok2 = new Bøker();
        nybok2.tittel = innForTittel;
        nybok2.pris = innForTittel;
        nybok2.forfatter = innforForfatter;
        nybok2.iSBNNummer = innForISBNNummer;


        JOptionPane.showMessageDialog(null, "Tittelen på boka er "+ nybok2.getTittel() + ". Forfatteren av boka er "+ nybok2.getForfatter()+ ". Prisen på boka er "+ nybok2.getPris()+ ". ISBN-nummeret er "+ nybok2.getiSBNNummer());




    }

}
