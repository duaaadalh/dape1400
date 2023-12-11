import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {


        String innVekt = JOptionPane.showInputDialog("Skriv inn vekten din i KG");
        String innHøyde = JOptionPane.showInputDialog("Skriv inn høyden din i CM");

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

        if (høyde <= 0 || vekt <=0){
            JOptionPane.showMessageDialog(null, "Du har skrevet inn ugyldig høyde eller vekt");
        }

        else {
            double BMI = (1.3*vekt)/Math.pow(høyde/100,2.5);
                JOptionPane.showMessageDialog(null, "Din BMI er " + BMI);

        }

    }
}
