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

    public static int forekomst (int [] liste, int tall){
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
                maks++;
            }
        }
        return maks;
    }

}


public class Oppgave2 {

    public static void main(String[] args) {
        int [] liste = {1,2,1,1,1,-3,-9405,-9034759, 4254, 52352,2};
        System.out.println("Tall større enn null " + Liste.storreEnnNull(liste));
        System.out.println("Tallet 1 forekommer " + Liste.forekomst(liste, 1));
        System.out.println("Største tallet er " + Liste.storsteTallet(liste));

    }
}
