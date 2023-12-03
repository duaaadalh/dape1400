package Eksamen2022;

import javax.swing.*;

public class RepetisjonOppgave3 {
    public static void main(String[] args){

        double vekt;
        double høyde;

        String innVekt = JOptionPane.showInputDialog("Skriv inn vekten din i kg");
        String innHøyde = JOptionPane.showInputDialog("Skriv inn høyden din i cm");

        try {
            vekt = Double.parseDouble(innVekt);
            høyde = Double.parseDouble(innHøyde);
        }
        catch (Exception e){
            vekt = 0;
            høyde = 0;
        }

        if (vekt <= 0 || høyde <= 0){
            JOptionPane.showMessageDialog(null, "Du har skrevet inn ugyldige tall");

        }
        else {
            double BMI = (1.3 * vekt)/(Math.pow(høyde/100,2.5));
                JOptionPane.showMessageDialog(null, "Din BMI er " + String.format("%.2f", BMI));
            }
        }


    }


