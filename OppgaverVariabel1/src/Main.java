import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {
//oppgave 1, 2, 3
    String fornavn;
    String etternavn;
    String alder;
    String adresse;
    String poststed;
    String postnr;
    adresse = "Harbitzalléen 25";
    poststed = "Oslo";
    postnr = "0275";
    alder = "23";
    fornavn = "Duaa";
    etternavn = "Al-Hemdany";
    System.out.println("Navnet er "+fornavn+ " "+ etternavn );
    System.out.println("Alderen er "+ alder);

//oppgave 3 og 4

    String innForNavn = showInputDialog("Skriv inn navnet");
    String innEtterNavn = showInputDialog("Skriv inn etternavn");
    String innAdresse = showInputDialog("Skriv inn adresse");
    String innPostNr = showInputDialog("Skriv inn postnr");
    String innAlder = showInputDialog("Skriv inn alder");
    String innPostSted  = showInputDialog("Skriv inn poststed");
   //showMessageDialog(null, innForNavn + innEtterNavn + "bor i "+ innAdresse);
    String ut = "Navn: "+ innForNavn+" "+ innEtterNavn + "\n" +  "Adresse: "+ innAdresse+ "\n" + "Postnummer: "+ innPostNr+ "\n"+ "Poststed:" +innPostSted + "\n"+ "Alder: "+innAlder;
   //showMessageDialog(null, ut);

System.out.println(ut);

// satte kommentar på showmessagedialog på 31 og 33 for å printe det










    }
}