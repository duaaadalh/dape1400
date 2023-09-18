import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {

        int alder;
        alder = 23;


        String innForAlder = showInputDialog("Min alder er ");
        alder = Integer.parseInt(innForAlder); // konvertere string til int
        showMessageDialog(null,"Min alder er "+ innForAlder + " år");

        // oppgave2

        double tall1;
        double tall2;
        double tall3;

        tall1 = 3.67;
        tall2 = 8.34;
        tall3 = 92.64;

        double sumAvAlleTall = tall1+tall2+tall3;

        System.out.println(sumAvAlleTall);

        // oppgave3

        double gjennomsnitt = sumAvAlleTall/3;
        System.out.println("Gjennomsnittet av tallen er " + sumAvAlleTall);
        JOptionPane.showMessageDialog(null, "Gjennomsnittet av tallene er" + gjennomsnitt);


    }
}