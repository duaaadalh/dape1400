import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        String navn;
        String adresse;
        navn = "Per Hansen";
        adresse = "Osloveien 82";
        String postAdresse = "Oslo";
        String postNr = "1234";
        System.out.println("Navnet er "+navn);
        System.out.println("Adressen er "+adresse+ " "+postNr+ " "+postAdresse);

        String innNavn = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnr");
        String innPostAdresse = showInputDialog("Skriv inn postadressen");
        showMessageDialog(null, innNavn+ " har adressen "+innAdresse);
        String ut = "Navnet : " +innNavn+"\n"+"Adressen er "+innAdresse+" "+innPostNr+" "+innPostAdresse;
        showMessageDialog(null,ut);

            }
        }




