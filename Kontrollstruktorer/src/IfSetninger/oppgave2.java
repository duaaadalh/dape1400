package IfSetninger;
import javax.swing.*;

public class oppgave2 {

    public static void main(String[] args) {

        int alder;
        String innForAlder = JOptionPane.showInputDialog("Skriv inn alder");
        alder = Integer.parseInt(innForAlder);

        if (alder < 18) {
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort");
        } else if (alder <= 70 && alder >= 18) {
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");

        } else if (alder > 70){
            JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");

        }


    }

}