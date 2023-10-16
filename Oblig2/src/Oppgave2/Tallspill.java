package Oppgave2;

import javax.swing.*;


public class Tallspill {


        private int slumptall;
        private int antallGjetninger;

        // Her trekkes det og returneres et slumptall mellom 0 og 200
        public int nyttTall () {
            slumptall = (int) (Math.random() * 201);
            return slumptall;
        }
        // Definerer visMelding metode
        public void visMelding (String melding){
            JOptionPane.showMessageDialog(null, melding);
        }
        // Metode som forteller brukeren at tallet de skrev inn er for lite eller for stort
        public void forLite (int tall){
            visMelding(tall + "Tallet er for lite. Prøv igjen");
        }
        public void forStort (int tall){
            visMelding(tall + "Talle er for høyt. Prøv igjen");
        }

        //Metode hvor brukeren har gjettet riktig og får opp hvor mange forsøk de har brukt
        public void avsluttRunde (int antall, int gjetning){
            visMelding("Du har gjettet det riktige tallet " + gjetning + ". Etter " + antall + " forsøk");
        }


        public void kjørSpill(){
            nyttTall();
            antallGjetninger = 0;
            int tallGjettet;
            boolean gjettetRiktig = false;

            //While-løkke for å bruke spillet. Hvor programmet går gjennom tallene som brukeren gjetter
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
                    // Bruker catch for å sikre at brukeren får opp en feilmelding ved inntast av
                    //ugyldig tall
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
