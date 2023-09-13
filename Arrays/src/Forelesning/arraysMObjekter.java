package Forelesning;


import javax.swing.*;

class film {
    private String tittel;
    private double pris;
    public String getTittel(){
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public double getPris() {
        return pris;
    }

    public void setPris (double pris){
        if (pris > 0){
            this.pris = pris;
        }
    }

    public film (String tittel, double pris){
        this.tittel = tittel;
        this.pris = pris;
    }
}




public class arraysMObjekter {
    public static void main(String[] args){
        film [] filmer = new film[100];
        int antall = 0;
        double innPris = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen på filmen, avslutt med 0"));
        String innTittel = JOptionPane.showInputDialog("Skriv inn tittel");
        while (antall < filmer.length && innPris > 0){
            film enFilm = new film(innTittel, innPris);
            filmer [antall] = enFilm;
            antall++;
            innPris = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen på filmen, avslutt med 0 "));
            innTittel = JOptionPane.showInputDialog("Skriv inn tittel");
        }

        int i = 0;
        String ut = "Her er alle filmene: \n";
        while (filmer[i] != null){
            ut += "Tittel : "+ filmer[i].getTittel();
            ut += " Prisen : "+ filmer[i].getPris() + "\n";
            i++;

        }

        JOptionPane.showMessageDialog(null, ut);


    }
}
