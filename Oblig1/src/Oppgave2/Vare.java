package Oppgave2;

public class Vare {private String navn;
    private int antall;
    private double pris;


    // Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // get / set metoder
    // antall og pris må være større enn null

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        } else {
            System.out.println("Antall må være større enn null.");
        }
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        } else {
            System.out.println("Prisen må være større enn null.");
        }
    }

    // metode for å beregne totalpris (pris * antall)
    public double totalPrisen() {
        return pris * antall;
    }
}
