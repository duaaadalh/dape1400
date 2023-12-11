class Liste{


    public static int storreEnnNull(int [] liste){
        int teller = 0;
        for (int i : liste){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekommer(int [] liste, int tall){
        int teller = 0;
        for (int i : liste){
            if (i == tall){
                teller++;
            }
        }
        return teller;


    }

    public static int storsteTallet(int [] liste){
        int maks = liste[0];
        for (int i : liste){
            if (i > maks){
                maks++;
            }
        }
        return maks;
    }


}



public class Oppgave3 {


    public static void main(String[] args) {
        int [] liste = {1,2,3,5,-5,-323,24,1,1,1,3};
        System.out.println("Antall tall større enn null er " + Liste.storreEnnNull(liste));
        System.out.println("Antall ganger tallet en dukker opp er " + Liste.forekommer(liste,1));
        System.out.println("Største tallet er " + Liste.storsteTallet(liste));

    }
}
