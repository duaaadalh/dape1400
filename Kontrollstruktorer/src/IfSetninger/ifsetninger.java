package IfSetninger;

import javax.swing.*;

public class ifsetninger {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(input);
        if (alder < 13){
            JOptionPane.showMessageDialog(null, "Du er et barn");
        } else if (alder<18) {
            JOptionPane.showMessageDialog(null, "Du er en ungdom");

        } else if (alder < 70) {
            JOptionPane.showMessageDialog(null, "Du er voksen");
            
        }

        // avslutt alltid med en else dersom du bruke if, else if
        else {
            JOptionPane.showMessageDialog(null, "Du er en pensjonist");
        }

    }
    }


// kan også bruke 'mellom' if (alder >= 18 && alder <= 70) JOptionPane.showMessageDialog