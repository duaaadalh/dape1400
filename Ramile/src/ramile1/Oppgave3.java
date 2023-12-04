package ramile1;

import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {


        String innVekt = JOptionPane.showInputDialog("Skriv inn vekt");
        String innHøyde = JOptionPane.showInputDialog("Skriv inn høyden");

        double vekt;
        double høyde;

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
            double BMI = (vekt * 1.3)/(Math.pow(høyde/100,2.5));
            JOptionPane.showMessageDialog(null, "Din BMI er " + String.format("%.2f", BMI));
        }


    }
}
