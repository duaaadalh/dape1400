package Modul1;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {

        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String navn = fornavn + " " + etternavn;
        JOptionPane.showMessageDialog(null, navn);

    }
}
}
