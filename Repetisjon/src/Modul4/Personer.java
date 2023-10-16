package Modul4;


import javax.swing.*;

class Person{

  public String navn;
  public String adresse;
  public String telefonnr;
  public int fødselsår;

  public int alder(){
      return 2023 - fødselsår;


  }
    public void skrivUt(int alder){
  String ut = "navn: " + navn + "\n" +  "adresse: " +  adresse + "\n" +  "telefonnummer: " +  telefonnr + "\n"+
         "alder: " + alder + " år.";
   // System.out.println(ut);
        JOptionPane.showMessageDialog(null, ut);
}
}




public class Personer {
    public static void main (String [] args){

        String navn = JOptionPane.showInputDialog("skriv inn navnet");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String telefonnummer = JOptionPane.showInputDialog("Skriv inn telefonnummer");
        String innFødselsår = JOptionPane.showInputDialog("Skriv inn fødselsåret");
        int fødselsår = Integer.parseInt(innFødselsår);


        Person Duaa = new Person();
        Duaa.navn = navn;
        Duaa.adresse = adresse;
        Duaa.fødselsår = fødselsår;
        Duaa.telefonnr = telefonnummer;
        int alder = Duaa.alder();
        Duaa.skrivUt(alder);

        }
    }

