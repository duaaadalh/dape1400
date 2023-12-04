package Eksamen2022;


class Lister{

    public static int merEnnNull (int [] liste){
        int teller = 0;
        for (int i : liste){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekomsten (int [] liste, int tall){
        int teller = 0;
        for (int i : liste){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int storst (int [] liste){
        int makss = liste[0];
        for (int i : liste){
            if (i > makss){
                makss =  i;
            }
        }
        return makss;
    }

}

public class reOpg2 {
    public static void main(String[] args){
        int liste [] = {1,1,2,4,5,-7,-90654,11, 1, 5};

        System.out.println("Antall tall større enn 10 er " + Lister.merEnnNull(liste));
        System.out.println("Tallet 1 forekommer " + Lister.forekomsten(liste, 1));
        System.out.println("Det største tallet er " + Lister.storst(liste));



    }
}
