import javax.swing.*;

public class UnikeTall {


     private int [] tall;

    // Konstruktør som mottar arrayets lengde som parameter

       public UnikeTall(int lengde){
           tall = new int[lengde];
        }

        //Metode som undersøker om tallet finnes i mitt array fra før av

        private boolean tallFinnes(int num) {
            for (int i = 0; i < tall.length; i++) {
                if (tall[i] == num) {
                    return true;
                }
            }
            return false;
        }

        //Her lager vi en metode som genererer tilfeldige tall mellom 100 og 999. Bruker math sin random
        public void genererUnikeTall(){
           for (int i = 0; i < tall.length; i++){
               int tilfeldigTall;
               do {
                   tilfeldigTall = (int) (Math.random() * 900) + 100;
               } while (tallFinnes(tilfeldigTall));
               tall[i] = tilfeldigTall;
           }
        }

        // Her har vi laget en metode som returnerer det minste tallet

        public int minsteTall (){
           int minste = tall[0];
           for (int i = 0; i < tall.length; i++){
               if (tall[i] < minste){
                   minste = tall[i];
               }
           }
           return minste;
        }

        //Her gjør vi det samme, bare med det største tallet
        public int størsteTall (){
           int største = tall[0];
           for (int i = 0; i < tall.length; i++){
               if (tall[i] > største){
                   største = tall[i];
               }
           }
           return største;
        }
        //Metode som regner ut gjennomsnittet og returnere det som en double
        public String gjennomsnitt(){
           int sum = 0;
           for (int tallene : tall){
               sum += tallene;
           }
           double gjennomsnitt = (double) sum/tall.length;
           String gjennomsnittet = String.format("%.2f",gjennomsnitt);
           return gjennomsnittet;
        }

        // Metode for å vise frem resultatet
        public void visResultat(){
           String melding = "Tallene i arrayet: \n";
           for (int i = 0; i < tall.length; i++){
               melding += tall[i] + " ";
               if ((i + 1 ) % 10 == 0) {
                   melding += "\n";
               }
           }

           // Printe ut resultatene i en meldingsboks
           int minste = minsteTall();
           int største = størsteTall();
           String finnGjennomsnitt = gjennomsnitt();

           melding += "minste tallet: " + minste + "\n";
           melding += "største tallet: " + største + "\n";
           melding += "gjennomsnittet: " + finnGjennomsnitt;

            JOptionPane.showMessageDialog(null, melding);
        }
        //Kjører koden
    public static void main (String [] args){
           int arrayLength = 30;
           UnikeTall nyListe = new UnikeTall(arrayLength);
           nyListe.genererUnikeTall();
           nyListe.visResultat();
    }

}
