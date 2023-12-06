import javax.swing.*;
import java.util.jar.JarOutputStream;

class Vare{
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris){
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;}
        else {
            System.out.println("Skriv inn gyldig tall");
        }

    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0) {this.pris = pris;}
        else {System.out.println("Skriv inn gyldig tall");}
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double beregnPris (){
        double totalprisen = pris * antall;
        return totalprisen;
    }

}

public class Oblig1Opg2 {
    public static void main(String[] args) {

        String navn1 = JOptionPane.showInputDialog("skriv inn navn på varen");
        String navn2 = JOptionPane.showInputDialog("skriv inn navn på varen");
        String innPris1 = JOptionPane.showInputDialog("Skriv inn prisen på vare 1");
        String innPris2 = JOptionPane.showInputDialog("skriv inn prisen på vare 2");
        String innAntall1 = JOptionPane.showInputDialog("skriv inn antallet av vare 1");
        String innAntall2 = JOptionPane.showInputDialog("skriv inn antallet på vare 2");

        int pris1;
        int pris2;
        int antall1;
        int antall2;

        try {
            pris1 = Integer.parseInt(innPris1);
            pris2 = Integer.parseInt(innPris2);
            antall1 = Integer.parseInt(innAntall1);
            antall2 = Integer.parseInt(innAntall2);
        }

        catch (Exception e){
            antall1 = 0;
            antall2 = 0;
            pris1 = 0;
            pris2 = 0;
        }

        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);


        System.out.println(vare1.beregnPris());
        System.out.println(vare2.beregnPris());

        double totalpris = vare1.beregnPris() * vare2.beregnPris();

        System.out.println("Totalprisen av varene er " + totalpris);





    }
}
