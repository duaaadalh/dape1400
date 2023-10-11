package Oppgave2;

import javax.swing.*;

public class Tallspill {


        private int slumptall;
        private int antallGjetninger;


        public int nyttTall () {
            slumptall = (int) (Math.random() * 201);
            return slumptall;
        }

        public void visMelding (String melding){
            JOptionPane.showMessageDialog(null, melding);
        }

        public void forLite (int tall){
            visMelding(tall + "Tallet er for lite. Prøv igjen");
        }
        public void forStort (int tall){
            visMelding(tall + "Talle er for høyt. Prøv igjen");
        }

        public void avsluttRunde (int antall, int gjetning){
            visMelding("Du har gjettet det riktige tallet " + gjetning + ". Etter " + antall + " forsøk");
        }


        public void kjørSpill(){
            nyttTall();
            antallGjetninger = 0;

        }

    public static void main (String [] args) {}


}
