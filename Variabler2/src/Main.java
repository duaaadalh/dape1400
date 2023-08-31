import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {

        int alder;
        alder = 23;


        String innForAlder = showInputDialog("Min alder er ");
        alder = Integer.parseInt(innForAlder); // konvertere string til int
        showMessageDialog(null,"Min alder er "+ innForAlder + " år");


    }
}