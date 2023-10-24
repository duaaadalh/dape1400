import javax.swing.*;

public class UnikeTall {


     private int [] tall;

       public UnikeTall(int length){
           tall = new int[length];
        }

        private boolean tallFinnes(int num) {
            for (int i = 0; i < tall.length; i++) {
                if (tall[i] == num) {
                    return true;
                }
            }
            return false;
        }

        public void genererUnikeTall(){
           for (int i = 0; i < tall.length; i++){
               int tilfeldigTall;
               do {
                   tilfeldigTall = (int) (Math.random() * 900) + 100;
               } while (tallFinnes(tilfeldigTall));
               tall[i] = tilfeldigTall;
           }
        }

        public int minsteTall (){
           int minste = tall[0];
           for (int i = 0; i < tall.length; i++){
               if (tall[i] < minste){
                   minste = tall[i];
               }
           }
           return minste;
        }

        public int størsteTall (){
           int største = tall[0];
           for (int i = 0; i < tall.length; i++){
               if (tall[i] > største){
                   største = tall[i];
               }
           }
           return største;
        }

        public double gjennomsnitt(){
           int sum = 0;
           for (int tallene : tall){
               sum += tallene;
           }
           return (double) sum/tall.length;
        }

        public void visResultat(){
           String melding = "Tallene i arrayet: \n";
           for (int i = 0; i < tall.length; i++){
               melding += tall[i] + " ";
               if ((i + 1 ) % 10 == 0) {
                   melding += "\n";
               }
           }

           int minste = minsteTall();
           int største = størsteTall();
           double finnGjennomsnitt = gjennomsnitt();

           melding += "minste tallet: " + minste + " ";
           melding += "største tallet: " + største + " ";
           melding += "gjennomsnittet: " + finnGjennomsnitt;

            JOptionPane.showMessageDialog(null, melding);
        }

    public static void main (String [] args){
           int arrayLength = 30;
           UnikeTall nyListe = new UnikeTall(arrayLength);
           nyListe.genererUnikeTall();
           nyListe.visResultat();
    }

}
