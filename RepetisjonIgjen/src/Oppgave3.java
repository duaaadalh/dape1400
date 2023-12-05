import javax.swing.*;


public class Oppgave3 {
    public static void main(String[] args) {

        String innVekt = JOptionPane.showInputDialog("Skriv inn vekten");
        String innHøyde = JOptionPane.showInputDialog("Skriv inn høyde");

        double vekt;
        double høyde;

        try {
            vekt = Double.parseDouble(innVekt);
            høyde = Double.parseDouble(innHøyde);
        }
        catch (Exception e){
            høyde = 0;
            vekt = 0;
        }

        if (vekt <= 0 || høyde <= 0){
            JOptionPane.showMessageDialog(null, "Du har skrevet inn ugydlig tall");
        }
        else {
            double BMI = (vekt*1.3)/Math.pow(høyde/100,2.5);
            JOptionPane.showMessageDialog(null, "Din BMI er " + String.format("%.2f", BMI));

        }
    }
}
