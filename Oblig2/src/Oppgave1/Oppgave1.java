package Oppgave1;
import javax.swing.*;


public class Oppgave1 {


    public static void main (String [] args){

        int sum = 0;
        String sumtekst = "";
        int nedre, ovre;

        do {
            String nedreGrensen = JOptionPane.showInputDialog("Skrive inn nedre grensen: ");
            nedre = Integer.parseInt(nedreGrensen);

            String ovesteGrensen = JOptionPane.showInputDialog("Skrive inn øvre grensen: ");
            ovre = Integer.parseInt(ovesteGrensen);

            //Dersom innlest øvre grense er mindre enn eller lik nedre grense,
            // skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.
            if (ovre <= nedre) {
                JOptionPane.showMessageDialog(null, "Nedre grense må være mindre enn øvre grense.");
            }
        }
        while ( ovre <= nedre);

        for (int i = nedre; i < ovre; i++) {
            sum += i;
            sumtekst += i;
            // Legg til " + " etter tallet, med linjeskift for hvert 10. tall
            if (i != ovre) {
                sumtekst += " + ";
                if (i % 10 == 0) {
                    sumtekst += "\n";
                }
            }
        }
        System.out.println(sumtekst+ " = " + sum);
        JOptionPane.showMessageDialog(null, nedre + " + " + (nedre + 1) + " + ... + " + ovre + " = " + sum);
    }
}




