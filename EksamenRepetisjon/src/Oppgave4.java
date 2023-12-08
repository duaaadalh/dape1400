import javax.swing.*;

public class Oppgave4 {

    public static void main(String[] args) {

        String CellerF = JOptionPane.showInputDialog("Skriv inn 'c' eller 'f'");
        String gradeTallinn = JOptionPane.showInputDialog("Skriv inn tallet du vil ha i grader");
        double grader = Double.parseDouble(gradeTallinn);

        if (CellerF.equals("C")){
            double celTilFar = (grader*1.8+32);
            JOptionPane.showMessageDialog(null, "Antall celsius i farenheit blir " + celTilFar);
        } else if (CellerF.equals("F")) {
            double farTilCel = (grader-32)/1.8;
            JOptionPane.showMessageDialog(null, "Antall farenheit i celsius blir " + farTilCel);

        }
        else {
            JOptionPane.showMessageDialog(null, "Du har skrevet inn gyldige verdier");
        }


    }
}
