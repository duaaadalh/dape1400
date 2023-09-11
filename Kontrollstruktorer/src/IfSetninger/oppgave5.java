package IfSetninger;

import javax.swing.*;

public class oppgave5 {

    public static void main(String[] args){
        String maned = JOptionPane.showInputDialog("Skriv inn måneden");
        switch (maned){
            case "juni":
            case "juli":
            case "august":
            JOptionPane.showMessageDialog(null, "Det er sommer");
            break;

            case "mai":
            case "april":
            case "mars":
                JOptionPane.showMessageDialog(null, "Det er vår");
                break;

            case "november":
            case "september":
            case "oktober":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;

            case "januar":
            case "februar":
            case "desember":
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ugyldig måned");



        }




        /*
        if (maned.equals("mai") || maned.equals("april") || maned.equals("mars")){
            JOptionPane.showMessageDialog(null, "Det er vår");
        } else if (maned.equals("august")|| maned.equals("juni") || maned.equals("juli")) {
            JOptionPane.showMessageDialog(null, "Det er sommer");
        } else if (maned.equals("november") || maned.equals("oktober") || maned.equals("september")) {
            JOptionPane.showMessageDialog(null, "Det er høst");

        } else if (maned.equals("desember") || maned.equals("januar") || maned.equals("februar")) {
            JOptionPane.showMessageDialog(null, "Det er vinter");
        }
        else {
            JOptionPane.showMessageDialog(null, "Du har ført opp en ugyldig måned");
        }
        */
    }

    }


