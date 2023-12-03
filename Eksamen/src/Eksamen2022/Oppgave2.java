package Eksamen2022;


class Liste{



    public static int storreEnnNull (int [] liste){
        int teller = 0;
        for (int i : liste){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }
    public static int forekommerTallet (int [] liste, int tall){
        int teller = 0;
        for (int i : liste){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int storsteTall (int [] liste ){
        int maks = liste[0];
        for (int i : liste){
            if (i > maks){
                maks = i;
            }
        }
        return maks;
    }
}




public class Oppgave2 {
    public static void main(String[] args){
        int liste [] = {2,3,-7,23,89,- 234, 9489, 2};
        System.out.println("Antall tall større enn null er " + Liste.storreEnnNull(liste));
        System.out.println("Antall ganger tallet 2 forekommer er " + Liste.forekommerTallet(liste,2));
        System.out.println("Største tallet er " + Liste.storsteTall(liste));

    }
}
