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
            int tallGjettet;
            boolean gjettetRiktig = false;

            while (!gjettetRiktig){
                try {
                    tallGjettet = Integer.parseInt(JOptionPane.showInputDialog("Gjett et tall mellom 0-200"));
                    antallGjetninger++;
                    if (tallGjettet<slumptall){
                        forLite(tallGjettet);

                    } else if (tallGjettet>slumptall) {
                        forStort(tallGjettet);

                    }
                    else {
                        gjettetRiktig = true;
                        avsluttRunde(antallGjetninger, tallGjettet);

                    }

                } catch (Exception e){
                    visMelding("Skriv inn et gyldig tall");
                }
            }

        }


    public static void main (String [] args) {
            Tallspill nyttSpill = new Tallspill();
            nyttSpill.kjørSpill();
    }


}
