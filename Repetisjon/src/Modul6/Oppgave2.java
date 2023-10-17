package Modul6;

import javax.swing.*;

public class Oppgave2 {

    public static void main (String [] args){
        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);

        if (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort");


        }

        else if (alder < 70){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort og trenger ikke legesjekk");
        }

        else {
            JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok, men må ta årlig legesjekk");
        }


       // if (alder <= 18){
         //   JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");

        //else {
            //JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort");




    }
}
