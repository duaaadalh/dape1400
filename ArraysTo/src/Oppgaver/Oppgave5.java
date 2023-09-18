package Oppgaver;

import javax.swing.*;

public class Oppgave5 {
    public static void main(String[] args){

        String innAnmeldere = JOptionPane.showInputDialog("Skriv inn anmeldere");
        String antallFilmer = JOptionPane.showInputDialog("Skriv inn filmer");
        int anmeldere;
        int filmer;

        try { anmeldere = Integer.parseInt(innAnmeldere);}
        catch (Exception e ){
            anmeldere = 0;
        }
        try {filmer = Integer.parseInt(antallFilmer);}
        catch (Exception e){
            filmer = 0;
        }

        if (anmeldere == 0 || filmer == 0){
            JOptionPane.showMessageDialog(null, "Ikke korrekt informasjon");
        }
        else {

            int [][] tabell1 = new int[anmeldere][filmer];
            int score;
            String innScore;
            for (int i = 0; i < anmeldere; i++){
                for (int j = 0; j < filmer; j++){
                    innScore = JOptionPane.showInputDialog("Skriv inn score for anmelder " + i + " og film " + j + " |  0-9");
                    try {
                        score = Integer.parseInt(innScore);
                        if ( score >= 0 && score <=9){
                            tabell1 [i][j] = score;
                        }
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Ikke gylidg");
                    }

                }
            }


            String ut = "";
            for (int i = 0; i<anmeldere; i++){
                ut += "Anmeldere" + i + " : ";
                for (int j = 0; j<filmer; j++){
                    ut += tabell1[i][j]+ " ";
                }
                ut += "\n";
            }
            System.out.println(ut);


        }

        int [][] tabell = {
                {4, 7, 6},
                {6, 9, 9},
                {2, 4, 3},
                {5, 8, 7}
        };

        for (int film = 0; film < tabell.length; film++){
            int sumScore = 0;


            for (int score = 0; score < tabell[film].length; score++){
                sumScore += tabell[film][score];

            }

            double gjennomsnittScore = (double) sumScore / tabell [film].length;
            System.out.println(gjennomsnittScore);

        }

    }


}


// regne gjennomsnitt for hver film
// nested loop
// inne i innerste loop -> snitt av tre tall