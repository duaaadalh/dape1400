import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {

        String innVekt = JOptionPane.showInputDialog("Skriv inn vekten i KG");
        String innHøyde = JOptionPane.showInputDialog("Skriv inn høyde");

        double høyde;
        double vekt;

        try {
            høyde = Double.parseDouble(innHøyde);
            vekt = Double.parseDouble(innVekt);
        }

        catch (Exception e){
            høyde = 0;
            vekt = 0;
        }

        if (høyde <= 0 || vekt <= 0){
            JOptionPane.showMessageDialog(null, "Du har skrevet inn ugyldige tall");
        }
        else {
            double BMI = (vekt * 1.3)/Math.pow(høyde/100, 2.5);
            JOptionPane.showMessageDialog(null, "Din BMI er " + BMI);
        }

    }
}
