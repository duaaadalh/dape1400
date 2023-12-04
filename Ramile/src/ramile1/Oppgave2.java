package ramile1;

class Liste{

    public static int storreEnnNull (int [] liste){
        int teller = 0;
        for (int i : liste){
            if (i >0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekommer (int [] liste, int tall){
        int teller = 0;
        for (int i : liste){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int storste(int [] liste){
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
        int liste [] = {1,1,2,5,-8,-9,10,34566,-5};
        System.out.println(Liste.storreEnnNull(liste));
        System.out.println(Liste.forekommer(liste,1));
        System.out.println(Liste.storste(liste));
    }





}
