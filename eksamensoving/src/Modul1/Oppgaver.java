package Modul1;

import javax.swing.*;

public class Oppgaver {
    public static void main(String[] args){



         String forNavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
         String etterNavn = JOptionPane.showInputDialog("Skriv inn etternavnet");
         String alder = JOptionPane.showInputDialog("Skriv inn alderen");
         String adresse = JOptionPane.showInputDialog("Skriv inn adressen");
         String postSted = JOptionPane.showInputDialog("Skriv inn poststed");
         String postNummer = JOptionPane.showInputDialog("Skriv inn postnummeret");


       //  JOptionPane.showMessageDialog(null, "Navnet er " + innNavn + " " + innEtternavn);

       // JOptionPane.showMessageDialog(null, "Alderen til " + forNavn + " " + etterNavn + " er " + alder+ " år");

     //   JOptionPane.showMessageDialog(null, forNavn + " " + etterNavn + " " + "bor i " + adresse + " som har postnummeret " + postNummer + " i " + postSted+ ". " + forNavn + "'s alder er " + alder+ " år.");

        //JOptionPane.showMessageDialog(null,"Navn: " + forNavn + " " +etterNavn +"\n"+ "Adresse: " + adresse+ "\n" + "Postnummer: " + postNummer + "\n" + "Poststed: " + postSted + "\n"  + "Alder: " + alder + " år");

        System.out.println("Navn: " + forNavn+ " " + etterNavn + "\n" + "Adresse: " + adresse + "\n" + "Postnummer: " + postNummer + "\n"+
                "Poststed: " + postSted + "\n" + "Alder: " + alder);
    }

}
