package Modul6;

import javax.swing.*;

public class Oppgave1 {

    public static void main (String [] args){

        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);

        if (alder >= 18 && alder <= 20){
            JOptionPane.showMessageDialog(null, "Du er myndig, men kan ikke kjøpe alkohol for mer enn 22%");


        }

            else {
                JOptionPane.showMessageDialog(null, "Du er enten umynding, eller så kan du kjøpe hva du vil på polet");
        }

    }
}
