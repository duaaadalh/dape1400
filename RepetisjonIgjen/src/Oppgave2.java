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

    public static int forekommet (int [] liste, int tall){
        int teller = 0;
        for (int i : liste){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int storsteTallet (int [] liste){
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

    public static void main(String[] args) {
        int liste [] = {1,2,1,1,3,4,1,-3,-4,-7,-9,-8,-32454356, 895425};
        System.out.println("Større enn null " + Liste.storreEnnNull(liste));
        System.out.println("Tallet 1 forekommer " + Liste.forekommet(liste,1));
        System.out.println("Største tallet er " + Liste.storsteTallet(liste));

    }
}
