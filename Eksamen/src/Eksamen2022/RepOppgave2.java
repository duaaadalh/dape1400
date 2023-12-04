package Eksamen2022;


class Liste3{


    public static int positiveTall (int [] liste5){
        int teller = 0;
        for (int i : liste5){
            if (i>0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekomst (int [] liste5, int tall){
        int teller = 0;
        for (int i : liste5){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int maksimaltTall (int [] liste5){
        int maks = liste5[0];
        for (int i : liste5){
            if (i > maks){
                maks = i;
            }
        }
        return maks;



    }

}

public class RepOppgave2 {
    public static void main(String[] args){
        int liste5 [] = {1,1,1,3,6,-987,-3,10,11,-87};
        System.out.println("Antall tall større enn null er " + Liste3.positiveTall(liste5));
        System.out.println("Antall ganger tallet 1 forekommer er " + Liste3.forekomst(liste5,1));
        System.out.println("Det største tallet er " + Liste3.maksimaltTall(liste5));

    }

}
