package Oppgaver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Oppgave10 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i<= n; i++){
            int count = 0;
            for (int j = 2; j<i; j++){
                if (i % j == 0){
                    count ++;
                }
            }
            if (count == 0){
                System.out.println(i + " ");
            }
        }
    }
    }



// Lag en primtallsgenerator.
// Det vl si liste ut alle primtall fra 0 og opp til et valgt tall.
// Et primtall er et tall som bare er delelig med 1 og seg selv.

// Lag et program som returnerer ut alle primtall opp til et valgt tall.
