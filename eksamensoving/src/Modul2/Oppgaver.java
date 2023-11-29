package Modul2;

import javax.swing.*;

public class Oppgaver {
    public static void main(String[] args){
       // String innAlder = JOptionPane.showInputDialog("Skriv inn alder");
      //  int alder = Integer.parseInt(innAlder);

      //  JOptionPane.showMessageDialog(null, "Min alder er  " + alder + " år");

        //Oppgave 2

       // String innTall1 = JOptionPane.showInputDialog("Skriv inn tall 1");
      //  String innTall2 = JOptionPane.showInputDialog("Skriv inn tall 2");
      //  String innTall3 = JOptionPane.showInputDialog("Skriv inn tall 3");

      //  double tall1 = Double.parseDouble(innTall1);
      //  double tall2 = Double.parseDouble(innTall2);
      //  double tall3 = Double.parseDouble(innTall3);

       // double sum = tall1 + tall2 + tall3;
       // double gjennomsnitt = sum / 3;

       // System.out.println("Summen av tallene er "  + sum);
      //  System.out.println("Gjennomsnittet av tallene er " + gjennomsnitt);

       // JOptionPane.showMessageDialog(null, "Gjennomsnittet av tallene er " + gjennomsnitt);

        //Oppgave 4

        //De må først være Strings for å kunne bruke inputdialog

        String innTall1 = JOptionPane.showInputDialog("Skriv inn tall 1");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn tall 2");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn tall 3");

        double tall1, tall2, tall3;

        try {
            //Double.parseDouble gjør dem om til doubles slik at man kan bruke inputdialogene etterpå
            tall1 = Double.parseDouble(innTall1);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        }

        //Setter dem lik 0 dersom man skriver inn noe annet enn et tall på inputdialogene
        catch(Exception e) {
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }

        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;

        System.out.println("Summen av tallene er "  + sum);
        System.out.println("Gjennomsnittet av tallene er " + gjennomsnitt);

        JOptionPane.showMessageDialog(null, "Gjennomsnittet av tallene er " + gjennomsnitt);



    }
}
