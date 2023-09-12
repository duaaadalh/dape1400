package Forlokker;

import javax.swing.*;
import javax.swing.JOptionPane;


public class While1 {
    public static void main(String[] args){
        int sum = 0;
        int antall = 0;
        String input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
        int innTall = Integer.parseInt(input);
        while (innTall > 0){
            sum = sum + innTall;
            antall = antall + 1;
            input = JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0");
            innTall = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, "Summen er "+ sum);
        double gjennomsnitt = (double) sum / (double) antall;
        JOptionPane.showMessageDialog(null, "Gjennomsnittet er "+ gjennomsnitt);


    }
}
