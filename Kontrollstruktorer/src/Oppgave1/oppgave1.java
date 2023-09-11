package Oppgave1;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Skriv alderen din");
        int alder = Integer.parseInt(input);
        if (alder >= 20 && alder >= 18){
            JOptionPane.showMessageDialog(null, "Du er myndig og kan i tillegg kjøpe hva du vil på polet");
        }
        else if (alder >= 18 && alder < 20){
            JOptionPane.showMessageDialog(null, "Du er myndig men kan ikke kjøpe alkohol over 22%");
        }

        else {
            JOptionPane.showMessageDialog(null, "Du er ikke myndig og kan ikke handle alkohol på polet");
        }

    }
}
