package Modul3;

import javax.swing.*;

public class Oppgaver {
    public static void main(String[] args){
      //  String navn = JOptionPane.showInputDialog("Skriv inn navn");
       // String innAlder = JOptionPane.showInputDialog("Skriv inn alder");
       // int alder = Integer.parseInt(innAlder);

       // int fødselsÅr = 2023 - alder;
      //  int pensjonsÅr = fødselsÅr + 67;

       // JOptionPane.showMessageDialog(null, navn + " er i dag " + alder + ". Han er født i " + fødselsÅr + ". I " + pensjonsÅr + " er han 67 år og da vil han være pensjonist.");



        //Oppgave 2

        int antall;

        antall = 0;
        antall +=2;
        System.out.print(antall + ", ");
        antall +=2;
        System.out.print(antall + ", ");
        antall +=2;
        System.out.print(antall + ", ");
        antall +=2;
        System.out.print(antall + ", ");



        //Oppgave 3

      //  String innLengde = JOptionPane.showInputDialog("Skriv inn lengden");
       // String innBredde = JOptionPane.showInputDialog("Skriv inn bredden");

        // double lengde = Double.parseDouble(innLengde);
      //  double bredde = Double.parseDouble(innBredde);

      //  double areal = lengde * bredde;

       // JOptionPane.showMessageDialog(null, "En rektangel med bredde " + bredde + " cm og lengde " + lengde + " cm har et areal på " + areal + " cm^2");


        //Oppgave 4

       // String innRadius = JOptionPane.showInputDialog("Skriv inn radiusen");

        //double radius = Double.parseDouble(innRadius);
       // double omkrets = radius * 3.14 * 2;
       // String omkretsMedToDesimaler = String.format("%.2f" , omkrets);

       // JOptionPane.showMessageDialog(null, "Omkreten av en sirkel med " + radius + "cm som radius blir " + omkretsMedToDesimaler + "cm");

        //Oppgave 5

      //  String innFarenheit = JOptionPane.showInputDialog("Skriv inn farenheit");
      //  double farenheit = Double.parseDouble(innFarenheit);

      //  double celius = (farenheit-32)/1.8;
     //   String celsiusMedToDesimaler = String.format("%.2f" , celius);

      //  JOptionPane.showMessageDialog(null, "Celsius med farenheit " + farenheit + " er " + celsiusMedToDesimaler);


        //Oppgave 6

       // String innAmerikansDollar = JOptionPane.showInputDialog("Skriv inn US dollars");
     //   double amerikanskDollar = Double.parseDouble(innAmerikansDollar);

      //  double valutakurs = 10.36;

     //   double norskeKroner = amerikanskDollar * valutakurs;
      //  String norskeKronerToDesimaler = String.format("%.2f" , norskeKroner);

      //  JOptionPane.showMessageDialog(null, amerikanskDollar + " dollar, tilsvarer " + norskeKronerToDesimaler + " norske kroner med " + valutakurs +" som dagens valutakurs");

        //Oppgave 7

      //  String innAntallPizza = JOptionPane.showInputDialog("Skriv inn antall pizzaer");
      //  String innAntallSlices = JOptionPane.showInputDialog("Skriv inn antall slices i pizzaen");
     //   String innAntallPersoner = JOptionPane.showInputDialog("Skriv inn antall personer");
     //   int antallPizza = Integer.parseInt(innAntallPersoner);
     //   int antallSlices = Integer.parseInt(innAntallSlices);
      //  int antallPersoner = Integer.parseInt(innAntallPersoner);


     //   int antallSlicesPerPerson = (antallPizza*antallSlices)/antallPersoner;
      //  int rest = (antallPizza*antallSlicesPerPerson)%antallPersoner;

      //  JOptionPane.showMessageDialog(null, "Dersom man er " + antallPersoner + " personer og har " + antallPizza + " pizzaer får hver person " + antallSlicesPerPerson + " og " + rest + " blir til overs");


        //Oppgave 10

        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);

        if (alder >= 18){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil da du er gammel nok");
        }
        if (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort");
        }
    }
}
