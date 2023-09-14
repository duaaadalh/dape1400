package Oppgaver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Oppgave10 {
    public static void main(String[] args){
        int[] allePrimTallOppTil10 = finnAllePrimtall(10);
        System.out.println(Arrays.toString(allePrimTallOppTil10));


        // 1, 3, 5, 7
    }

    public static int[] finnAllePrimtall(int oppTilDetteTallet) {
        int[] primtallliste = {};
        for (int i = 2; i < oppTilDetteTallet; i++){
            boolean erEtPrimtall = true;
            for (int j = 1; j < i; j++){
                if (i % j == 0){
                    erEtPrimtall = false;
                }
            }
            if (erEtPrimtall == true){
                System.out.println(i);
                primtallliste = Arrays.copyOf(primtallliste, primtallliste.length + 1);
                primtallliste[primtallliste.length - 1] = i;
            }
        }

        return primtallliste;
    }
}


// Lag en primtallsgenerator.
// Det vl si liste ut alle primtall fra 0 og opp til et valgt tall.
// Et primtall er et tall som bare er delelig med 1 og seg selv.

// Lag et program som returnerer ut alle primtall opp til et valgt tall.
