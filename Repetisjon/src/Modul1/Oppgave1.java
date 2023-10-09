package Modul1;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {

        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String alder = JOptionPane.showInputDialog("Skriv inn alderen din");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String poststed = JOptionPane.showInputDialog("Skriv inn poststed");
        String postnummer = JOptionPane.showInputDialog("Skriv inn postnummer");
        String navn = fornavn + " " + etternavn;

      //  JOptionPane.showMessageDialog(null, navn);

       // JOptionPane.showMessageDialog(null, "Alderen til " + navn + " er " + alder + " år");


       // JOptionPane.showMessageDialog(null, navn + " bor i " + adresse + " som har postnummer " +postnummer
      //  + " i " + poststed + ". " + fornavn + "'s alder er " + alder + " år");

      //  JOptionPane.showMessageDialog(null, "Navn: " + navn + "\n" + "Adresse: " + adresse +"\n"
      //  + "Postnummer: " + postnummer + "\n" + "Poststed: " + poststed + "\n" + "Alder: " + alder + " år.");

        System.out.println(navn + " bor i " + adresse + " som har postnummer " + postnummer + " i "+ poststed + ". " + fornavn
        + "'s alder er " + alder + " år.");
    }

}

