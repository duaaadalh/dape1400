package Oppgaver;

import static javax.swing.JOptionPane.*;

class Person {
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String adresse;

    public Person(String fornavn, String etternavn, String telefonnr, String adresse) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.adresse = adresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void skriveUt(){
        String ut = "Navn: " + fornavn + " "+ etternavn + "\n"+
                "Telefonner: " + telefonnr +  "\n" +
                "Adresse: " + adresse;

        showMessageDialog(null, ut);

    }

}


    public class Oppgave1 {
        public static void main(String[] args) {


            String innForFornavn = showInputDialog("Skriv inn navn");
            String innForEtternavn = showInputDialog("Skriv inn etternavn");
            String innForTelefonnr = showInputDialog("Skriv inn telefonnummer");
            String innForAdresse = showInputDialog("Skriv inn adresse");

            Person Duaa = new Person(innForFornavn,innForEtternavn,innForTelefonnr, innForAdresse);
          Duaa.skriveUt();

        }

    }




