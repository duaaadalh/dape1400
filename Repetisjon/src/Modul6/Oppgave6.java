package Modul6;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args){
        String måned = JOptionPane.showInputDialog("Skriv inn en måned");
        switch (måned){
            case "januar":
            case "februar":
            case "desember":
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;

            case "mars":
            case "april":
            case "mai":
                JOptionPane.showMessageDialog(null, "Det er vår");

            case "juni":
            case "juli":
            case "august":
                JOptionPane.showMessageDialog(null, "Det er sommer");

            case "september":
            case "oktober":
            case "november":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;
            default:JOptionPane.showMessageDialog(null, "Ugyldig måned");
        }
    }
}
