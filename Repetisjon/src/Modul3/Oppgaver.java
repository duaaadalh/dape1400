package Modul3;

import javax.swing.*;
import java.nio.channels.spi.AbstractSelectionKey;
import java.util.jar.JarOutputStream;

public class Oppgaver {

    public static void main (String [] args){
        String navn = JOptionPane.showInputDialog("Skriv inn navn");
        String innAlder = JOptionPane.showInputDialog("Skriv inn alder");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2023 - alder;
        int pensjonist = fødselsår + 67;

        System.out.print(navn + " er i dag " + alder + " år. " + "Hun er født i " + fødselsår);
        System.out.print(". I "+ pensjonist + " er hun 67 år og da vil hun være pensjonist");

        //Oppgave2

        int antall = 0;
        antall +=2;
        System.out.print(antall + ",");
        antall = antall +2;
        System.out.print(antall + ",");
        antall +=2;
        System.out.print(antall + ",");
        antall +=2;
        System.out.print(antall + ",");


        //Oppgave3

        String innBredde = JOptionPane.showInputDialog("Skriv inn bredden");
        String innLengde = JOptionPane.showInputDialog("Skriv inn lengden");

        double bredde = Double.parseDouble(innBredde);
        double lengde = Double.parseDouble(innLengde);

        double areal = bredde * lengde;

        JOptionPane.showMessageDialog(null, "Arealet av en rektangel med bredde " + bredde + " og lengde "
        + lengde + " har et areal på " + areal + "cm^2.");

        //Oppgave4

        String innRadius = JOptionPane.showInputDialog("Skriv inn radiusen");


        double radius = Double.parseDouble(innRadius);
        double omkrets = (2*3*radius);
        String omkretsMedToDesimaler = String.format("%.2f" ,omkrets);

        JOptionPane.showMessageDialog(null, "Omkretsen av en sirkel med " + radius + "cm som radius er "+ omkretsMedToDesimaler + "cm");


        //Oppgave5


        String innFarenheit = JOptionPane.showInputDialog("Skriv inn farenheit");
        double farenheit = Double.parseDouble(innFarenheit);

        double celsius = (farenheit-32)/1.8;

        JOptionPane.showMessageDialog(null, "Celsius med " +farenheit + " farenheit, er " + celsius + " grader");


        //Oppgave6

        String innAmerikanskDollar = JOptionPane.showInputDialog("Skriv inn antall US dollar");
        double amerikanskDollar = Double.parseDouble(innAmerikanskDollar);

        double valutakurs = 10.36;

        double norskeKroner = valutakurs * amerikanskDollar;

        JOptionPane.showMessageDialog(null, "Amerikanske dollar i norske kroner er " + norskeKroner);

        //Oppgave 7

        String innAntallPizza = JOptionPane.showInputDialog("Skriv inn antall pizza");
        int antallPizza = Integer.parseInt(innAntallPizza);
        String innAntallPersoner = JOptionPane.showInputDialog("Skriv inn antall personer");
        int antallPersoner = Integer.parseInt(innAntallPersoner);
        String innAntallSlicesPerPizza = JOptionPane.showInputDialog("Skriv inn antall slices per pizza");
        int antallSlicesPerPizza = Integer.parseInt(innAntallSlicesPerPizza);

        int antallSlicesPerPerson = (antallPizza*antallSlicesPerPizza)/antallPersoner;
        int rest = (antallPizza*antallSlicesPerPizza)%antallPersoner;

        System.out.println("Dersom man er " + antallPersoner + "personer, og har "  + antallPizza+ " pizzaer, får hver person " + antallSlicesPerPerson+
                " og " + rest + " blir til overs");

        //Oppgave8







    }


}
