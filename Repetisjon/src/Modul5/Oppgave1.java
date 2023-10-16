package Modul5;

import javax.swing.*;

class Person{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

        public String getFornavn(){
        return fornavn;
        }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public void skrivUt(){
        String ut = "Navn: "+ fornavn+" " +etternavn+ "\n"+ "Adressen: " + adresse + "\n" + "Telefonnummeret "+
                telefonnr;

        JOptionPane.showMessageDialog(null, ut);
    }

}

public class Oppgave1 {
    public static void main (String [] args){
        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String telefonnr = JOptionPane.showInputDialog("Skriv inn telefonnummer");

        Person Duaa = new Person(fornavn, etternavn, adresse, telefonnr);
        Duaa.skrivUt();

    }

}
