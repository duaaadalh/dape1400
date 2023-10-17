package Modul6;

import javax.swing.*;

public class Oppgave5 {

    public static void main (String [] args){
        String måned = JOptionPane.showInputDialog("Skriv inn en måned");
        if (måned.equals("juni") || måned.equals("juni") || måned.equals("august")){
            JOptionPane.showMessageDialog(null, "Det er sommer");
        } else if (måned.equals("oktober") || måned.equals("sepmember") || måned.equals("november")) {
            JOptionPane.showMessageDialog(null, "Det er høst");


        } else if (måned.equals("mai") || måned.equals("april") || måned.equals("mars")) {
            JOptionPane.showMessageDialog(null, "Det er vår");

        } else if (måned.equals("desember") || måned.equals("januar") || måned.equals("februar"))  {

        } else {
            JOptionPane.showMessageDialog(null, "Det er ikke en gyldig måned");
        }
    }


}
