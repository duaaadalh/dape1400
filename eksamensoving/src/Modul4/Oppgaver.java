package Modul4;


import javax.swing.*;

class Bøker{
    String tittel;
    double pris;
    String forfatter;
    String isbnNummer;

    void skrivUt(){
      //  System.out.println("Tittelen er " + tittel);
       // System.out.println("Prisen er " + pris + " kroner");
       // System.out.println("Forfatteren er " + forfatter);
      //  System.out.println("ISBN-nummeret er " + isbnNummer);

        String ut = "tittelen er " + tittel + ". Prisen er " + pris + ". Forfatteren er " + forfatter
                + ". ISBN-nummeret er " + isbnNummer;

        JOptionPane.showMessageDialog(null, ut);

    }
}


public class Oppgaver {
    public static void main(String[] args){

        Bøker bok1 = new Bøker();
        String forfatter = JOptionPane.showInputDialog("Skriv inn forfatter");
        String innPris = JOptionPane.showInputDialog("Skriv inn prisen");
        double pris = Double.parseDouble(innPris);
        String tittel = JOptionPane.showInputDialog("Skriv inn tittelen");
        String iSBNNummer = JOptionPane.showInputDialog("Skriv inn ISBN nummeret");

        bok1.forfatter = forfatter;
        bok1.pris = pris;
        bok1.tittel = tittel;
        bok1.isbnNummer = iSBNNummer;

        bok1.skrivUt();

      //  bok1.forfatter = "Duaa";
      //  bok1.pris = 130.5;
      //  bok1.tittel = "Simones bestevenn";
      //  bok1.isbnNummer = "130500051200";


    }
}
