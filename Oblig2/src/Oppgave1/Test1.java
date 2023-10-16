package Oppgave1;

import javax.swing.*;

public class Test1 {
    public static void main (String [] args){




        int nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));
        int øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));
        int linjeskift = 0;
        int sum = 0;

        while (øvreGrense <= nedreGrense){
            øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et større tall"));
        }


        for (int i = nedreGrense; i <= øvreGrense; i++){
            sum += i; }

        for (int minsteTall = nedreGrense; minsteTall < øvreGrense; minsteTall++){
            System.out.print(minsteTall + " + ");
            linjeskift++;
            if (linjeskift == 10){ //lager en if setning for å legge linjeskift etter hvert 10. tall
                System.out.print("\n");
                linjeskift = 0;
            }




        }

        System.out.print(øvreGrense + " = " + sum);



    }

}
