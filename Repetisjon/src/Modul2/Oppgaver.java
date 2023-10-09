package Modul2;

import javax.swing.*;

public class Oppgaver {
    public static void main(String[] args){

        //Oppgave1

      //  String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din ");
      //  int alder = Integer.parseInt(innAlder);
       // JOptionPane.showMessageDialog(null, "Min alder er " + alder + " år.");

        //Oppgave2

     //   double tall1 = 23.6;
     //   double tall2 = 53.75;
     //   double tall3 = 953.64;
     //   double sum = tall1 + tall2 + tall3;

     //   System.out.println("Summen av alle tallene er " + sum);

        // Oppgave3

      //  double gjennomsnitt = sum / 3;

      //  String innTall = JOptionPane.showInputDialog("Skriv inn et tall");
      //  String innTall2 = JOptionPane.showInputDialog("Skriv inn et tall");
      //  String innTall3 = JOptionPane.showInputDialog("Skriv inn et tall");

      //  double tall4 = Double.parseDouble(innTall);
      //  double tall5 = Double.parseDouble(innTall2);
     //   double tall6 = Double.parseDouble(innTall3);

      //  double sum1 = tall4 + tall5 + tall6;
       // double gjennomsnitt1 = sum1 / 3;

       // String ut = "Summen av alle tall er " + tall4 + " ," +tall5 + ", " +tall6+
           //     " er " + sum1 + "\n"+
             //   "Gjennomsnittet av tallene er " + gjennomsnitt1;

       // System.out.println(ut);
      //  JOptionPane.showMessageDialog(null, ut);

        // Oppgave 4

        String innTall = JOptionPane.showInputDialog("Skriv inn et tall");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn et tall");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn et tall");

        double tall1, tall2, tall3;

        try {
            tall1 = Double.parseDouble(innTall);
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);

        }
        catch (Exception e){
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }

        double sum = tall1+tall2+tall3;
        double gjennomsnitt = sum /3;
        String ut = "Summen av alle tall er " + tall1 + " ," +tall2 + ", " +tall3+
             " er " + sum + "\n"+
           "Gjennomsnittet av tallene er " + gjennomsnitt;

         System.out.println(ut);
          JOptionPane.showMessageDialog(null, ut);









    }

}
