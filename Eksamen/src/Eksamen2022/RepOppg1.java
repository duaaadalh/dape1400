package Eksamen2022;

public class RepOppg1 {
    public static void main(String[] args){

        int liste [] = {-3, 41, 5, -3, 2, 49};
        int teller  = 0;
        for (int i : liste){
            if (i > 10){
                teller++;
            }
        }
        System.out.println("Antall tall større enn ti er " + teller);


        //b

       for (int i = 0; i < liste.length; i +=2){
           System.out.println("Annethvert tall er " + liste[i]);
       }

       //c

        int sum = 0;
       teller = 0;

       for (int i : liste){
           if (i > 0){
               sum += i;
               teller ++;
           }
       }

       System.out.println(sum);

       double gjennomsnitt = (double) sum /  teller;

       System.out.println(gjennomsnitt);




    }
}
