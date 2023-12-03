package Eksamen2022;

class Liste1{

    public static int merEnnNull (int [] Liste){
        int teller = 0;
        for (int i : Liste){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }

    public static int forekommerTallet (int [] Liste, int tall){
        int teller = 0;
        for (int i : Liste){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    public static int finnStorsteTall (int [] Liste){
        int maks = Liste[0];
        for (int i : Liste){
            if (i > maks){
                maks = i;
            }
        }
        return maks;
    }

}

public class RepetisjonOppgave2 {
    public static void main(String[] args){
        int Liste [] = {1,2,3,4,78,4,4,87,-234,-3,-1,200};
        System.out.println("Antall tall mer enn null er " + Liste1.merEnnNull(Liste));
        System.out.println("Tallet 4 forekommer " + Liste1.forekommerTallet(Liste, 4));
        System.out.println("Det største tallet er " + Liste1.finnStorsteTall(Liste));
    }
}
