package KogBoppgave3;


import javax.swing.*;
import java.util.Calendar;

class Personer{
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødselsår;
    public String alder;

    public int getFødselsår() {
        return fødselsår;

    }
    public String getNavn(){
        return navn;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public String getAlder(){
        return alder;
    }

    public int regnUtAlder(){
        int årNå = 2023;
        int alder = årNå - getFødselsår();
        return alder;
    }

    // let x be the year of birth for a person, then:
    // h(x) = 2023 - x
   // public int h(int x){
       // return 2023 - x;
    //}

    public int f(int x){
        return 2*x;
    }

    public int g(int x, int y){
        return 2*x*y;
    }
}

public class kogboppgave3 {
    public static void main(String[] args) {
        

        String innForNavn = JOptionPane.showInputDialog("Skriv inn navn");
        String innForAdresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String innForTelefonnr = JOptionPane.showInputDialog("Skriv inn telefonnr");
        String innForAlder = JOptionPane.showInputDialog("Skriv inn alder");


        Personer hello = new Personer();
        hello.navn = innForNavn;
        hello.adresse = innForAdresse;
        hello.telefonnr = innForTelefonnr;
        hello.alder = innForAlder;

        JOptionPane.showMessageDialog(null, "Navn: "+ hello.getNavn() + "\n"+ "Adresse: "+ hello.getAdresse() +"\n"+ "Telefonnummer; "+ hello.getTelefonnr() +"\n"+ "Alder: "+ hello.getAlder());





        Personer karsten = new Personer();
        karsten.fødselsår = 1997;
        int karstensalder = karsten.regnUtAlder();
        System.out.println(karstensalder);


        Personer Fatima = new Personer();
        Fatima.fødselsår = 1999;
        int fatimasAlder = Fatima.regnUtAlder();
        System.out.println(fatimasAlder);


    }



    }

