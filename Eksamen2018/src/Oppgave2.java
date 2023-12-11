public class Oppgave2 {

    public static void main(String[] args) {

        int [] liste = {-3, 41, 5, -3, 2, 49};


       int teller = 0;
       for (int i : liste){
           if (i > 10){
               teller++;
           }
       }
       System.out.println(teller);

       for (int i = 0; i<liste.length; i+=2){
           System.out.print(liste[i] + ", ");
       }

       teller = 0;
       int positiv = 0;
       for (int i : liste){
           if (i > 0){
               teller++;
               positiv +=i;
           }
       }
       System.out.println(positiv);
       double gjennomsnitt = positiv / (double) teller;
       System.out.println(gjennomsnitt);

    }






}
