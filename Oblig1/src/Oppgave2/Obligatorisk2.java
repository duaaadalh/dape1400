package Oppgave2;

import javax.swing.*;

public class Obligatorisk2 {
    public static void main(String[] args) {

        // bruk avvikshåntering (try/catch) for å konvertere

        try {
            // les inn navn, antall og pris for vare 1
            String navn1 = JOptionPane.showInputDialog("Skrive navn til vare1 ");
            int antall1 = Integer.parseInt(JOptionPane.showInputDialog("Skrive antall av vare1: "));
            double pris1 = Double.parseDouble(JOptionPane.showInputDialog("Skrive pris av vare1: "));

            // les inn navn, antall og pris for vare 2
            String navn2 = JOptionPane.showInputDialog("Skrive navn til vare2 ");
            int antall2 = Integer.parseInt(JOptionPane.showInputDialog("Skrive antall av vare2: "));
            double pris2 = Double.parseDouble(JOptionPane.showInputDialog("Skrive pris av vare2: "));

            // opprett to vare-objekter med de innleste verdiene
            Vare vare1 = new Vare(navn1, antall1, pris1);
            Vare vare2 = new Vare(navn2, antall2, pris2);

            // beregn total pris for alle varer i System.out
            double totalPris = vare1.totalPrisen() + vare2.totalPrisen();

            // skriv ut totalprisen
            System.out.println(String.format("Totalprisen ble : %s kr.", totalPris));
        } catch (NumberFormatException e) {
            System.out.println("Feil format for antall eller pris.");

        }
    }
}
