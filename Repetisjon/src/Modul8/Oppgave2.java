package Modul8;

public class Oppgave2 {
    public static void main (String [] args){
        int [] liste = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i = 0; i< liste.length; i++){
            sum += liste.length;
        }
        System.out.println(sum);
        double gjennomsnitt = (double)sum/liste.length;
        System.out.println(gjennomsnitt);

        sum = 0;
        int teller = 0;
        for (int i : liste){
            if (i>5){
                sum +=i;
                teller++;
            }


        }
        System.out.println(sum);
        gjennomsnitt = (double)sum/teller;
        System.out.println(gjennomsnitt);

    }
}
