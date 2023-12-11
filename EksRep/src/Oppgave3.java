import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {

        String CellerF = JOptionPane.showInputDialog("Skriv inn 'C' eller 'F'");
        String innGrader =  JOptionPane.showInputDialog("Skriv inn grader");
        double grader = Double.parseDouble(innGrader);

        if (CellerF.equals("C")){
            double celsius = (grader*1.8+32);
            JOptionPane.showMessageDialog(null, "I farenheit blir det" + celsius);
        } else if (CellerF.equals("F")) {
            double farenheit = (grader-32*1.8);
            JOptionPane.showMessageDialog(null, "I celsius blir det" + farenheit);

        }
        else {
            JOptionPane.showMessageDialog(null, "Du har skrevet inn ugyldige verdier");
        }

    }
}
