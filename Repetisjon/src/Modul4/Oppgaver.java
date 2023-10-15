package Modul4;

import javax.swing.*;

class Bøker{
    String forfatter;
    double pris;
    String tittel;
    String IBSN;

    void skrivUt(){

        String ut = "Tittelen: " + tittel + " Forfatter: " + forfatter + " Prisen: " + pris + " ISBN nummeret: "
                + IBSN;

        JOptionPane.showMessageDialog(null, ut);
      //  System.out.println("Tittelen: " + tittel);
      //  System.out.println("Prisen: " + pris);
     //   System.out.println("Forfatteren: " + forfatter);
     //   System.out.println("ISBN nummer: " + IBSN);

    }
}



public class Oppgaver {

    public static void main (String [] args){


        String forfatter = JOptionPane.showInputDialog("Forfatter");
        String tittel = JOptionPane.showInputDialog("Tittelen");
        String innPris = JOptionPane.showInputDialog("Prisen");
        double pris = Double.parseDouble(innPris);
        String ISBN = JOptionPane.showInputDialog("ISBN nummer");

        Bøker bok1 = new Bøker();
        bok1.forfatter = forfatter;
        bok1.tittel = tittel;
        bok1.pris = pris;
        bok1.IBSN = ISBN;
        bok1.skrivUt();
    }


}
